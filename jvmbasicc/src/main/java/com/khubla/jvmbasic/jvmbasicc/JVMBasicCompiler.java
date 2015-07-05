package com.khubla.jvmbasic.jvmbasicc;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicLexer;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.ProgContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.LocalVariableDeclaration;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.compiler.TreePrinter;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.StaticAnalysis;
import com.khubla.jvmbasic.jvmbasicc.function.Function;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.progRule;
import com.khubla.jvmbasic.jvmbasicc.util.FilenameUtil;

/**
 * @author tom
 */
public class JVMBasicCompiler {
   /**
    * logger
    */
   private static final Logger logger = LoggerFactory.getLogger(JVMBasicCompiler.class);

   /**
    * parse an input file
    */
   public static ProgContext parse(InputStream inputStream) throws Exception {
      try {
         if (null != inputStream) {
            final jvmBasicLexer jvmBasicLexer = new jvmBasicLexer(new ANTLRInputStream(inputStream));
            final CommonTokenStream tokens = new CommonTokenStream(jvmBasicLexer);
            final jvmBasicParser jvmBasicParser = new jvmBasicParser(tokens);
            jvmBasicParser.setBuildParseTree(true);
            return jvmBasicParser.prog();
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
         logger.info("Writing class '" + classname + "' to file '" + classname + ".class'");
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
         logger.info("Parsing input for classname: '" + classname + "'");
         /*
          * get tree
          */
         final ProgContext progContext = parse(inputStream);
         /*
          * print tree
          */
         final TreePrinter treePrinter = new TreePrinter();
         treePrinter.printTree(progContext);
         /*
          * a message
          */
         logger.info("Generating Bytecode for class '" + classname + "'");
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
         generateProgram(classname, classWriter, progContext);
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
    * compile. This method generates the class definition
    */
   public byte[] compile(String filename, boolean verboseOutput) throws Exception {
      final InputStream inputStream = new FileInputStream(filename);
      final String className = FilenameUtil.classNameFromFileName(filename);
      if (verboseOutput) {
         logger.info("Compiling '" + filename + "' to class: '" + className + "'");
      }
      return this.compile(inputStream, className, verboseOutput);
   }

   /**
    * compile a BAS file to a class file and return the classname
    */
   public String compileToClassfile(String filename, String outputDir, boolean verboseOutput) throws Exception {
      try {
         final FileInputStream fis = new FileInputStream(filename);
         final String className = FilenameUtil.classNameFromFileName(filename);
         final byte[] classbytes = compile(fis, className, verboseOutput);
         writeClassFile(classbytes, className, outputDir);
         return className;
      } catch (final Exception e) {
         throw new Exception("Exception in compileToClassfile", e);
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
         methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
         /*
          * create a new execution context and assign it
          */
         final Label l1 = new Label();
         methodVisitor.visitLabel(l1);
         methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
         methodVisitor.visitTypeInsn(Opcodes.NEW, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT);
         methodVisitor.visitInsn(Opcodes.DUP);
         methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "<init>", "()V", false);
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
         methodVisitor.visitMaxs(0, 0);
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
         methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, classname, "<init>", "()V", false);
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
         methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, classname, "program", "()V", false);
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
         methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "()V", false);
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
         methodVisitor.visitMaxs(0, 0);
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
   protected void generateProgram(String classname, ClassWriter classWriter, ProgContext progContext) throws Exception {
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
         final StaticAnalysis programStaticAnalysis = new StaticAnalysis();
         programStaticAnalysis.performStaticAnalysis(progContext);
         /*
          * show the static analysis
          */
         logger.info("Static analyis results for '" + classname + "'");
         programStaticAnalysis.showAnalysisResults();
         /*
          * recurse into the parse tree
          */
         final Function function = new progRule();
         final GenerationContext generationContext = new GenerationContext(classname, methodVisitor, classWriter, progContext, programStaticAnalysis);
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
         logger.info("JVM local variables");
         for (int i = 1; i < (GenerationContext.getLocalvariables().size() + 1); i++) {
            final LocalVariableDeclaration lvd = GenerationContext.getLocalvariables().get(i);
            logger.info("variable: " + lvd.getName() + " declared on line: " + lvd.getBasicLine() + " frame index: " + lvd.getIndex());
         }
         /*
          * max stack 1024 max variables 1024
          */
         methodVisitor.visitMaxs(0, 0);
         /*
          * we are done
          */
         methodVisitor.visitEnd();
      } catch (final Exception e) {
         throw new Exception("Exception in generateProgram", e);
      }
   }
}