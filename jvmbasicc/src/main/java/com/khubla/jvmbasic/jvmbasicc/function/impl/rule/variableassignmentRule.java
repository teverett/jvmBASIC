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
import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.Opcodes;

import com.khubla.jvmbasic.jvmbasicc.compiler.Dispatcher;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 *         <p>
 *         EQ sets the variable value in the execution context
 *         </p>
 *         <p>
 *         The assignment code looks like
 *         </p>
 *         <p>
 *         <code>
 *          Value x = executionContext.pop();
 *          this.executionContext.setVariable("name", x);
 *         </code>
 *         </p>
 */
public class variableassignmentRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * recurse into the children
          */
         Dispatcher.dispatchChildren(generationContext);
         /*
          * the tree should have 3 sub nodes
          */
         String variableName = null;
         if (generationContext.getParseTree().getChildCount() == 3) {
            /*
             * get the variable name
             */
            variableName = generationContext.getChildValue(0);
            /*
             * get the tree for the value. this should push the value onto the ExecutionContextStack
             */
            final ParseTree subTree = generationContext.getParseTree().getChild(2);
            final GenerationContext subGenerationContext = new GenerationContext(generationContext, subTree);
            Dispatcher.dispatch(subGenerationContext);
         } else {
            throw new Exception("Invalid number of arguments '" + generationContext.getParseTree().getChildCount() + "'");
         }
         /*
          * store the top of the stack into slot 1
          */
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ASTORE, 1);
         /*
          * put the value in slot 1 into the variable in the execution context
          */
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitLdcInsn(variableName);
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 1);
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "setVariable",
               "(Ljava/lang/String;Lcom/khubla/jvmbasic/jvmbasicrt/Value;)V");
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
