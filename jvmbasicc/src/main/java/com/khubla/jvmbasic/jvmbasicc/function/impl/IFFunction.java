package com.khubla.jvmbasic.jvmbasicc.function.impl;

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
import org.antlr.runtime.tree.CommonTree;
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
public class IFFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         if (generationContext.getCommonTree().getChildCount() == 3) {
            /*
             * so the subtree under the <IF> here will be <relational operator tree> <THEN> <statement>
             */
            /*
             * process the relational operator. this will push a TRUE or FALSE onto the generation context stack
             */
            final GenerationContext subGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(0));
            Dispatcher.dispatch(subGenerationContext);
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
            final GenerationContext conditionalGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(2));
            Dispatcher.dispatch(conditionalGenerationContext);
            /*
             * label to skip to
             */
            generationContext.getMethodVisitor().visitLabel(l1);
            generationContext.getMethodVisitor().visitFrame(Opcodes.F_SAME, 0, null, 0, null);
            return true;
         } else if (generationContext.getCommonTree().getChildCount() == 2) {
            /*
             * so the subtree under the <IF> here will be <relational operator tree> <statement>
             */
            /*
             * process the relational operator. this will push a TRUE or FALSE onto the generation context stack
             */
            final GenerationContext subGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(0));
            Dispatcher.dispatch(subGenerationContext);
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
            final GenerationContext conditionalGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(1));
            Dispatcher.dispatch(conditionalGenerationContext);
            /*
             * label to skip to
             */
            generationContext.getMethodVisitor().visitLabel(l1);
            generationContext.getMethodVisitor().visitFrame(Opcodes.F_SAME, 0, null, 0, null);
            return true;
         } else {
            throw new Exception("Invalid number of tokens in subtree '" + generationContext.getCommonTree().getChildCount() + "' expected 3 on line number: " + generationContext.getLineNumber());
         }
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
