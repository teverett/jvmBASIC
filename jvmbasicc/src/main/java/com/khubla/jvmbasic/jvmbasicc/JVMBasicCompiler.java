package com.khubla.jvmbasic.jvmbasicc;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicLexer;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.LocalVariableDeclaration;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.ProgramStaticAnalysis;
import com.khubla.jvmbasic.jvmbasicc.function.Function;
import com.khubla.jvmbasic.jvmbasicc.function.impl.PROGFunction;

/**
 * @author tom
 */
public class JVMBasicCompiler {
   /**
    * generate the class name from the supplied BASIC filename
    */
   public static String classNameFromFileName(String filename) {
      return new File(filename).getName().replaceAll(".bas", "").toUpperCase();
   }

   /**
    * dump a tree to the console
    */
   public static void dumpTree(CommonTree commonTree, int indent) {
      if (null != commonTree) {
         StringBuffer sb = new StringBuffer(indent);
         if (commonTree.getParent() == null) {
            if (null != commonTree.getText()) {
               System.out.println(sb.toString() + commonTree.getText().toString());
            }
         }
         for (int i = 0; i < indent; i++) {
            sb = sb.append("   ");
         }
         for (int i = 0; i < commonTree.getChildCount(); i++) {
            System.out.println(sb.toString() + " " + jvmBasicParser.tokenNames[commonTree.getChild(i).getType()] + " " + commonTree.getChild(i).toString());
            dumpTree((CommonTree) commonTree.getChild(i), indent + 1);
         }
      }
   }

   /**
    * parse an input file
    */
   public static CommonTree parse(InputStream inputStream) throws Exception {
      try {
         if (null != inputStream) {
            final jvmBasicLexer jvmBasicLexer = new jvmBasicLexer(new ANTLRInputStream(inputStream));
            final CommonTokenStream tokens = new CommonTokenStream(jvmBasicLexer);
            final jvmBasicParser jvmBasicParser = new jvmBasicParser(tokens);
            final jvmBasicParser.prog_return ret = jvmBasicParser.prog();
            final CommonTree tree = (CommonTree) ret.getTree();
            return tree;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (final Exception e) {
         throw new Exception("Exception reading and parsing file", e);
      }
   }

   /**
    * write the supplied bytecode given the class name and an option output directory
    */
   public static void writeClassFile(byte[] byteCode, String classname, String outputDirectory) throws Exception {
      try {
         System.out.println("Writing class '" + classname + "' to file '" + classname + ".class'");
         if (null != byteCode) {
            FileOutputStream fos = null;
            if (null != outputDirectory) {
               new File(outputDirectory).mkdirs();
               fos = new FileOutputStream(outputDirectory + "/" + classname + ".class");
            } else {
               fos = new FileOutputStream(classname + ".class");
            }
            fos.write(byteCode);
            fos.flush();
            fos.close();
         }
      } catch (final Exception e) {
         throw new Exception("Exception in writeClassFile", e);
      }
   }

   /**
    * compile. This method generates the class definition
    */
   public byte[] compile(InputStream inputStream, String classname, boolean verboseOutput) throws Exception {
      try {
         /*
          * a message
          */
         System.out.println("Parsing input");
         /*
          * get tree
          */
         final CommonTree commonTree = parse(inputStream);
         /*
          * dump tree
          */
         dumpTree(commonTree, 0);
         /*
          * a message
          */
         System.out.println("Generating Bytecode for class '" + classname + "'");
         /*
          * class
          */
         final ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
         classWriter.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, classname, null, "java/lang/Object", null);
         /*
          * the execution context
          */
         FieldVisitor fieldVistor = classWriter.visitField(Opcodes.ACC_PUBLIC, RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE, null, null);
         fieldVistor.visitEnd();
         /*
          * input stream
          */
         fieldVistor = classWriter.visitField(Opcodes.ACC_PUBLIC, "inputStream", "Ljava/io/InputStream;", null, null);
         fieldVistor.visitEnd();
         /*
          * output stream
          */
         fieldVistor = classWriter.visitField(Opcodes.ACC_PUBLIC, "outputStream", "Ljava/io/PrintStream;", null, null);
         fieldVistor.visitEnd();
         /*
          * init method
          */
         generateInit(classname, classWriter);
         /*
          * main()
          */
         generateMain(classname, classWriter);
         /*
          * program
          */
         generateProgram(classname, classWriter, commonTree);
         /*
          * generate the class
          */
         classWriter.visitEnd();
         return classWriter.toByteArray();
      } catch (final Exception e) {
         throw new Exception("Exception in compile", e);
      }
   }

   /**
    * generate init.
    * <p>
    * This inits the class members and assigns class members, such as the ExecutionContext.
    * </p>
    * <p>
    * <code>
    * public ExecutionContext executionContext = new ExecutionContext();
    * </code>
    * </p>
    */
   protected void generateInit(String className, ClassWriter classWriter) throws Exception {
      try {
         final MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
         methodVisitor.visitCode();
         /*
          * call init()
          */
         final Label l0 = new Label();
         methodVisitor.visitLabel(l0);
         methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
         methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
         /*
          * create a new execution context and assign it
          */
         final Label l1 = new Label();
         methodVisitor.visitLabel(l1);
         methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
         methodVisitor.visitTypeInsn(Opcodes.NEW, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT);
         methodVisitor.visitInsn(Opcodes.DUP);
         methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "<init>", "()V");
         methodVisitor.visitFieldInsn(Opcodes.PUTFIELD, className, RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         /*
          * return
          */
         final Label l2 = new Label();
         methodVisitor.visitLabel(l2);
         methodVisitor.visitLineNumber(8, l2);
         methodVisitor.visitInsn(Opcodes.RETURN);
         /*
          * declare variables
          */
         final Label l3 = new Label();
         methodVisitor.visitLabel(l3);
         methodVisitor.visitLocalVariable("this", "L" + className + ";", null, l0, l3, 0);
         methodVisitor.visitMaxs(3, 1);
         methodVisitor.visitEnd();
      } catch (final Exception e) {
         throw new Exception("Exception in generateInit", e);
      }
   }

   /**
    * generate void main(String[])
    * <p>
    * <code>
    * public static void main(String[] args) {
    *   ExampleProgram exampleProgram = new ExampleProgram();
    *  try {
    *       exampleProgram.inputStream = System.in;
    *       exampleProgram.outputStream = System.out;
    *       exampleProgram.program();
    *   } catch (Exception e) {
    *       e.printStackTrace();
    *    }
    *  }
    * </code>
    * </p>
    */
   protected void generateMain(String classname, ClassWriter classWriter) throws Exception {
      try {
         /*
          * make method
          */
         final MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
         methodVisitor.visitCode();
         final Label l0 = new Label();
         final Label l1 = new Label();
         final Label l2 = new Label();
         methodVisitor.visitTryCatchBlock(l0, l1, l2, "java/lang/Exception");
         final Label l3 = new Label();
         methodVisitor.visitLabel(l3);
         /*
          * declare a local instance of the class in the void() main, store as variable 1.
          */
         methodVisitor.visitTypeInsn(Opcodes.NEW, classname);
         methodVisitor.visitInsn(Opcodes.DUP);
         methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, classname, "<init>", "()V");
         methodVisitor.visitVarInsn(Opcodes.ASTORE, 1);
         /*
          * assign the input stream
          */
         methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
         methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
         methodVisitor.visitFieldInsn(Opcodes.PUTFIELD, classname, "inputStream", "Ljava/io/InputStream;");
         /*
          * assign the output stream
          */
         methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
         methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
         methodVisitor.visitFieldInsn(Opcodes.PUTFIELD, classname, "outputStream", "Ljava/io/PrintStream;");
         /*
          * load the class instance from variable 1 and call "program"
          */
         methodVisitor.visitLabel(l0);
         methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
         methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, classname, "program", "()V");
         methodVisitor.visitLabel(l1);
         final Label l4 = new Label();
         methodVisitor.visitJumpInsn(Opcodes.GOTO, l4);
         methodVisitor.visitLabel(l2);
         methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] { "[Ljava/lang/String;", classname }, 1, new Object[] { "java/lang/Exception" });
         methodVisitor.visitVarInsn(Opcodes.ASTORE, 2);
         final Label l5 = new Label();
         methodVisitor.visitLabel(l5);
         methodVisitor.visitLineNumber(21, l5);
         methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
         methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "()V");
         /*
          * return
          */
         methodVisitor.visitLabel(l4);
         methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
         methodVisitor.visitInsn(Opcodes.RETURN);
         /*
          * declare the parameters
          */
         final Label l6 = new Label();
         methodVisitor.visitLabel(l6);
         methodVisitor.visitLocalVariable("args", "[Ljava/lang/String;", null, l3, l6, 0);
         methodVisitor.visitLocalVariable("exampleProgram", "L" + classname + ";", null, l0, l6, 1);
         methodVisitor.visitLocalVariable("e", "Ljava/lang/Exception;", null, l5, l4, 2);
         /*
          * done
          */
         methodVisitor.visitMaxs(2, 3);
         methodVisitor.visitEnd();
      } catch (final Exception e) {
         throw new Exception("Exception in generateMain", e);
      }
   }

   /**
    * Generate program
    * <p>
    * Java prototype is "public program()"
    * </p>
    */
   protected void generateProgram(String classname, ClassWriter classWriter, CommonTree commonTree) throws Exception {
      try {
         final MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "program", "()V", null, new String[] { "java/lang/Exception" });
         methodVisitor.visitCode();
         /*
          * label for the start of the method
          */
         final Label l0 = new Label();
         methodVisitor.visitLabel(l0);
         /*
          * do the static analysis
          */
         final ProgramStaticAnalysis programStaticAnalysis = new ProgramStaticAnalysis();
         programStaticAnalysis.performStaticAnalysis(commonTree);
         /*
          * show the static analysis
          */
         programStaticAnalysis.dumpStaticAnalysis();
         /*
          * recurse into the parse tree
          */
         final Function function = new PROGFunction();
         final GenerationContext generationContext = new GenerationContext(classname, methodVisitor, classWriter, commonTree, programStaticAnalysis);
         function.execute(generationContext);
         /*
          * return
          */
         final Label l1 = new Label();
         methodVisitor.visitLabel(l1);
         methodVisitor.visitInsn(Opcodes.RETURN);
         /*
          * declare the *this* local variable
          */
         final Label l2 = new Label();
         methodVisitor.visitLabel(l2);
         methodVisitor.visitLocalVariable("this", "L" + classname + ";", null, l0, l2, 0);
         /*
          * show all the other local variables
          */
         System.out.println("JVM local variables");
         for (int i = 1; i < (GenerationContext.getLocalvariables().size() + 1); i++) {
            final LocalVariableDeclaration lvd = GenerationContext.getLocalvariables().get(i);
            System.out.println("variable: " + lvd.getName() + " declared on line: " + lvd.getBasicLine() + " frame index: " + lvd.getIndex());
         }
         /*
          * we are done
          */
         methodVisitor.visitMaxs(0, 1);
         methodVisitor.visitEnd();
      } catch (final Exception e) {
         throw new Exception("Exception in generateProgram", e);
      }
   }
}