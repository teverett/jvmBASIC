package com.khubla.jvmbasic.jvmbasicc.function.impl.rule;

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

import com.khubla.jvmbasic.jvmbasicc.compiler.Dispatcher;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * <p>
 * <code>
 * executionContext.setVariable(executionContext.pop().getAsString(), executionContext.pop());
 * </code>
 * </p>
 * 
 * @author tome
 */
public class readstmtRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * process subtree
          */
         Dispatcher.dispatchChildren(generationContext);
         /*
          * get the data
          */
         final String data = "\"" + generationContext.readData() + "\"";
         /*
          * push it onto the stack
          */
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitLdcInsn(data);
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/String;)V");
         /*
          * swap the stack arguments
          */
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "swap", "()V");
         /*
          * set the variable
          */
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getString", "()Ljava/lang/String;");
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "setVariable",
               "(Ljava/lang/String;Lcom/khubla/jvmbasic/jvmbasicrt/Value;)V");
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
