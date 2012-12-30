package com.khubla.jvmbasic.jvmbasicc.compiler;

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
import java.util.Hashtable;

import org.antlr.runtime.tree.CommonTree;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.ForDeclaration;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.ProgramStaticAnalysis;

/**
 * @author tome
 */
public class GenerationContext {
   public static void addLocalVariable(int basicLine, String name, int index) {
      localVariables.put(index, new LocalVariableDeclaration(basicLine, name, index));
   }

   public static Hashtable<Integer, LocalVariableDeclaration> getLocalvariables() {
      return localVariables;
   }

   public static ProgramStaticAnalysis getProgramStaticAnalysis() {
      return programStaticAnalysis;
   }

   public static int nextLocalVariableIndex() {
      return localVariableIndex++;
   }

   /**
    * ClassWriter
    */
   private final ClassWriter classWriter;
   /**
    * classname
    */
   private final String className;
   /**
    * the MethodVisitor for ASM
    */
   private final MethodVisitor methodVisitor;
   /**
    * the commonTree
    */
   private final CommonTree commonTree;
   /**
    * all FOR declarations
    */
   private final Hashtable<String, ForDeclaration> forDeclarations;
   /**
    * current BASIC line number
    */
   private final int lineNumber;
   /**
    * data pointer
    */
   private static int dataPointer = 0;
   /**
    * the static analysis
    */
   private static ProgramStaticAnalysis programStaticAnalysis = null;
   /**
    * all the variables
    */
   private final static Hashtable<Integer, LocalVariableDeclaration> localVariables = new Hashtable<Integer, LocalVariableDeclaration>();
   /**
    * local variable allocation index
    */
   private static int localVariableIndex = 1;

   /**
    * copy ctor
    */
   public GenerationContext(GenerationContext parent, CommonTree commonTree) {
      methodVisitor = parent.methodVisitor;
      this.commonTree = commonTree;
      classWriter = parent.classWriter;
      className = parent.className;
      forDeclarations = parent.forDeclarations;
      lineNumber = parent.lineNumber;
   }

   /**
    * copy ctor
    */
   public GenerationContext(GenerationContext parent, CommonTree commonTree, int lineNumber) {
      methodVisitor = parent.methodVisitor;
      this.commonTree = commonTree;
      classWriter = parent.classWriter;
      className = parent.className;
      forDeclarations = parent.forDeclarations;
      this.lineNumber = lineNumber;
   }

   public GenerationContext(String className, MethodVisitor methodVisitor, ClassWriter classWriter, CommonTree commonTree, ProgramStaticAnalysis staticAnalysis) {
      this.methodVisitor = methodVisitor;
      this.commonTree = commonTree;
      this.classWriter = classWriter;
      this.className = className;
      programStaticAnalysis = staticAnalysis;
      forDeclarations = new Hashtable<String, ForDeclaration>();
      lineNumber = 0;
   }

   /**
    * store a loop declaration
    */
   public void addForDeclaration(String basicVariableName, int fromLocalVariableIndex, int toLocalVariableIndex, int stepLocalVariableIndex, int counterLocalVariableIndex, int lineNumber) {
      forDeclarations.put(basicVariableName, new ForDeclaration(basicVariableName, fromLocalVariableIndex, toLocalVariableIndex, stepLocalVariableIndex, counterLocalVariableIndex, lineNumber));
   }

   /**
    * get child value of commontree
    */
   public String getChildValue(int i) throws Exception {
      try {
         if (null != commonTree) {
            final CommonTree commonTree = (CommonTree) this.commonTree.getChildren().get(i);
            return commonTree.getText();
         }
         return null;
      } catch (final Exception e) {
         throw new Exception("Exception in getChildValue", e);
      }
   }

   public String getClassName() {
      return className;
   }

   public ClassWriter getClassWriter() {
      return classWriter;
   }

   public CommonTree getCommonTree() {
      return commonTree;
   }

   public int getLineNumber() {
      return lineNumber;
   }

   /**
    * get a loop declaration
    */
   public ForDeclaration getLoopDeclaration(String variableName) {
      return forDeclarations.get(variableName);
   }

   public MethodVisitor getMethodVisitor() {
      return methodVisitor;
   }

   /**
    * read data
    */
   public String readData() {
      return programStaticAnalysis.getData()[dataPointer++];
   }

   /**
    * reset data pointer
    */
   public void resetDataPointer() {
      dataPointer = 0;
   }
}
