package com.khubla.jvmbasic.jvmbasicc.function.impl;

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

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 *         <p>
 *         Generates a random integer b/t 1 and the supplied argument.
 *         </p>
 *         <p>
 *         <code>
 *         this.executionContext.push(new Random().nextInt(this.executionContext.pop().getInteger()));
 *         </code>
 *         </p>
 */
public class RNDFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * get the operands
          */
         processTree(generationContext);
         /*
          * declare the local var Random
          */
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitTypeInsn(Opcodes.NEW, "java/util/Random");
         generationContext.getMethodVisitor().visitInsn(Opcodes.DUP);
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESPECIAL, "java/util/Random", "<init>", "()V");
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getInteger", "()Ljava/lang/Integer;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/util/Random", "nextInt", "(I)I");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Integer;)V");
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
