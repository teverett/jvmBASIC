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
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;

import com.khubla.jvmbasic.jvmbasicc.compiler.Dispatcher;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 *         <p>
 *         <code>
 *  if (true == executionContext.pop().getBoolean()) {
 * </code>
 *         </p>
 */
public class ifstmtRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         if (generationContext.getParseTree().getChildCount() == 4) {
            /*
             * so the subtree under the <IF> here will be <relational operator tree> <THEN> <statement>
             */
            Dispatcher.dispatchChildren(generationContext);
            /*
             * check the result
             */
            generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
            generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getBoolean", "()Ljava/lang/Boolean;");
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z");
            /*
             * check result
             */
            final Label l1 = new Label();
            generationContext.getMethodVisitor().visitJumpInsn(Opcodes.IFEQ, l1);
            /*
             * process the contained tree
             */
            final GenerationContext conditionalGenerationContext = new GenerationContext(generationContext, generationContext.getParseTree().getChild(2));
            Dispatcher.dispatch(conditionalGenerationContext);
            /*
             * label to skip to
             */
            generationContext.getMethodVisitor().visitLabel(l1);
            generationContext.getMethodVisitor().visitFrame(Opcodes.F_SAME, 0, null, 0, null);
            return true;
         } else if (generationContext.getParseTree().getChildCount() == 3) {
            /*
             * so the subtree under the <IF> here will be <relational operator tree> <statement>
             */
            Dispatcher.dispatchChildren(generationContext);
            /*
             * check the result
             */
            generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
            generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getBoolean", "()Ljava/lang/Boolean;");
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z");
            /*
             * check result
             */
            final Label l1 = new Label();
            generationContext.getMethodVisitor().visitJumpInsn(Opcodes.IFEQ, l1);
            /*
             * process the contained tree
             */
            final GenerationContext conditionalGenerationContext = new GenerationContext(generationContext, generationContext.getParseTree().getChild(1));
            Dispatcher.dispatch(conditionalGenerationContext);
            /*
             * label to skip to
             */
            generationContext.getMethodVisitor().visitLabel(l1);
            generationContext.getMethodVisitor().visitFrame(Opcodes.F_SAME, 0, null, 0, null);
            return true;
         } else {
            throw new Exception("Invalid number of tokens in subtree '" + generationContext.getParseTree().getChildCount() + "' expected 3 on line number: " + generationContext.getLineNumber());
         }
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
