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
import org.antlr.v4.runtime.CommonToken;
import org.objectweb.asm.Opcodes;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.RelopContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.Dispatcher;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.exception.JVMBasicFunctionException;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 *         <p>
 *         relationalExpression : addingExpression ((relop) addingExpression)*;
 *         </p>
 */
public class relationalExpressionRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws JVMBasicFunctionException {
      try {
         /*
          * get the operands
          */
         Dispatcher.dispatchChildren(generationContext);
         /*
          * check for 3 values
          */
         if (generationContext.getParseTree().getChildCount() == 3) {
            /*
             * sign
             */
            final RelopContext relopContext = (RelopContext) generationContext.getParseTree().getChild(1);
            final CommonToken commonToken = (CommonToken) relopContext.getChild(0).getPayload();
            if (commonToken.getType() == jvmBasicParser.GTE) {
               /*
                * compare
                */
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "resolveValue",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "resolveValue",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, RTLHelper.JASIC_RUNTIME_MATH, "GTE",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Ljava/lang/Boolean;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Boolean;)V", false);
            } else if (commonToken.getType() == jvmBasicParser.GT) {
               /*
                * compare
                */
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "resolveValue",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "resolveValue",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, RTLHelper.JASIC_RUNTIME_MATH, "GT",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Ljava/lang/Boolean;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Boolean;)V", false);
            } else if (commonToken.getType() == jvmBasicParser.LTE) {
               /*
                * compare
                */
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "resolveValue",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "resolveValue",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, RTLHelper.JASIC_RUNTIME_MATH, "LTE",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Ljava/lang/Boolean;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Boolean;)V", false);
            } else if (commonToken.getType() == jvmBasicParser.LT) {
               /*
                * compare
                */
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "resolveValue",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
               generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "resolveValue",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, RTLHelper.JASIC_RUNTIME_MATH, "LT",
                     "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Ljava/lang/Boolean;", false);
               generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Boolean;)V", false);
            }
            return true;
         } else {
            /*
             * do nothing
             */
            return true;
         }
      } catch (final Exception e) {
         throw new JVMBasicFunctionException("Exception in execute", e);
      }
   }
}
