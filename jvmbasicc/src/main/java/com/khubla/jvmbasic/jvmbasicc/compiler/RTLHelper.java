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
import org.objectweb.asm.Opcodes;

/**
 * common methods to generate code to do various runtime things
 *
 * @author tome
 */
public class RTLHelper {
   public static final String EXECUTIONCONTEXT_NAME = "executionContext";
   public static final String JASIC_RUNTIME_NAMESPACE = "com/khubla/jvmbasic/jvmbasicrt";
   public static final String JASIC_RUNTIME_EXECUTIONCONTEXT = "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext";
   public static final String JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE = "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;";
   public static final String JASIC_RUNTIME_VALUE = "com/khubla/jvmbasic/jvmbasicrt/Value";
   public static final String JASIC_RUNTIME_VALUE_TYPE = "Lcom/khubla/jvmbasic/jvmbasicrt/Value;";
   public static final String JASIC_RUNTIME_MATH = "com/khubla/jvmbasic/jvmbasicrt/MathFunctions";

   /**
    * push a value onto the Execution Context stack
    * <p>
    * <code>
    * executionContext.push(db);
    * </code>
    * </p>
    */
   public static void push(GenerationContext generationContext, double db) {
      generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
      generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), EXECUTIONCONTEXT_NAME, JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
      generationContext.getMethodVisitor().visitLdcInsn(new Double(db));
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Double;)V", false);
   }

   /**
    * push a value onto the Execution Context stack
    * <p>
    * <code>
    * executionContext.push(i);
    * </code>
    * </p>
    */
   public static void push(GenerationContext generationContext, int i) {
      generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
      generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), EXECUTIONCONTEXT_NAME, JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
      generationContext.getMethodVisitor().visitIntInsn(Opcodes.BIPUSH, i);
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Integer;)V", false);
   }

   /**
    * push a value onto the Execution Context stack
    * <p>
    * <code>
    * executionContext.push(str);
    * </code>
    * </p>
    */
   public static void push(GenerationContext generationContext, String str) {
      generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
      generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), EXECUTIONCONTEXT_NAME, JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
      generationContext.getMethodVisitor().visitLdcInsn(str);
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/String;)V", false);
   }
}
