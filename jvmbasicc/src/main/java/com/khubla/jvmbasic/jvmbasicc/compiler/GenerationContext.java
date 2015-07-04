package com.khubla.jvmbasic.jvmbasicc.compiler;

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
import java.util.Hashtable;

import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.ForDeclaration;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.StaticAnalysis;

/**
 * @author tome
 */
public class GenerationContext {
   /**
    * data pointer
    */
   private static int dataPointer = 0;
   /**
    * the static analysis
    */
   private static StaticAnalysis programStaticAnalysis = null;
   /**
    * all the variables
    */
   private final static Hashtable<Integer, LocalVariableDeclaration> localVariables = new Hashtable<Integer, LocalVariableDeclaration>();
   /**
    * local variable allocation index
    */
   private static int localVariableIndex = 1;

   public static void addLocalVariable(int basicLine, String name, int index) {
      localVariables.put(index, new LocalVariableDeclaration(basicLine, name, index));
   }

   public static Hashtable<Integer, LocalVariableDeclaration> getLocalvariables() {
      return localVariables;
   }

   public static StaticAnalysis getProgramStaticAnalysis() {
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
   private final ParseTree parseTree;
   /**
    * all FOR declarations
    */
   private final Hashtable<String, ForDeclaration> forDeclarations;
   /**
    * current BASIC line number
    */
   private final int lineNumber;

   /**
    * copy ctor
    */
   public GenerationContext(GenerationContext parent, ParseTree parseTree) {
      methodVisitor = parent.methodVisitor;
      this.parseTree = parseTree;
      classWriter = parent.classWriter;
      className = parent.className;
      forDeclarations = parent.forDeclarations;
      lineNumber = parent.lineNumber;
   }

   /**
    * copy ctor
    */
   public GenerationContext(GenerationContext parent, ParseTree parseTree, int lineNumber) {
      methodVisitor = parent.methodVisitor;
      this.parseTree = parseTree;
      classWriter = parent.classWriter;
      className = parent.className;
      forDeclarations = parent.forDeclarations;
      this.lineNumber = lineNumber;
   }

   public GenerationContext(String className, MethodVisitor methodVisitor, ClassWriter classWriter, ParseTree parseTree, StaticAnalysis staticAnalysis) {
      this.methodVisitor = methodVisitor;
      this.parseTree = parseTree;
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
         if (null != parseTree) {
            final ParseTree childParseTree = parseTree.getChild(i);
            return childParseTree.getText();
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

   public ParseTree getParseTree() {
      return parseTree;
   }

   /**
    * read data
    */
   public String readData() {
      return programStaticAnalysis.getDatasDatabase().getData()[dataPointer++];
   }

   /**
    * reset data pointer
    */
   public void resetDataPointer() {
      dataPointer = 0;
   }
}
