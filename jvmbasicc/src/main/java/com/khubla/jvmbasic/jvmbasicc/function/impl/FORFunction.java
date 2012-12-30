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

import com.khubla.jvmbasic.jvmbasicc.compiler.Dispatcher;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * A typical for loop looks like:
 * <p>
 * 
 * <pre>
 * FOR I = <x> TO <y> STEP <z>", and then "NEXT I"
 * </pre>
 * 
 * </p>
 * The impl in the FOR looks like the below. This will allocate 3 local variables in the frame.
 * <p>
 * 
 * <pre>
 * int start = executionContext.resolveValue(executionContext.pop()).getInteger();
 * int end = executionContext.resolveValue(executionContext.pop()).getInteger();
 * int step = executionContext.resolveValue(executionContext.pop()).getInteger();
 * int i = start;
 * executionContext.setVariable('I', i);
 * 
 * </pre>
 * 
 * </p>
 * The loop code, in the next looks like
 * <p>
 * 
 * <pre>
 *   if (i < end) {
 *    i=i+step;
 *    executionContext.setVariable('I', i);
 *    JMP <label>
 * }
 * </pre>
 * 
 * </p>
 * The JMP is implemented with a goto
 * 
 * <pre>
 * generationContext.getMethodVisitor().visitJumpInsn(Opcodes.GOTO, loopTargetLabel);
 * </pre>
 * 
 * @author tome
 */
/**
 * <p>
 * <code>
 *  
 * </code>
 * </p>
 * 
 * @author tome
 */
public class FORFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * variables to collect
          */
         final String variableName = generationContext.getChildValue(0);
         // String fromName = generationContext.getChildValue(2);
         // String toName = generationContext.getChildValue(4);
         // String stepName;
         // if (generationContext.getCommonTree().getChildCount() == 5) {
         // stepName = "1";
         // } else {
         // stepName = generationContext.getChildValue(6);
         // }
         /*
          * get the indices
          */
         final int fromLocalVariableIndex = GenerationContext.nextLocalVariableIndex();
         final int toLocalVariableIndex = GenerationContext.nextLocalVariableIndex();
         final int stepLocalVariableIndex = GenerationContext.nextLocalVariableIndex();
         final int counterLocalVariableIndex = GenerationContext.nextLocalVariableIndex();
         /*
          * store the local variable declarations
          */
         GenerationContext.addLocalVariable(generationContext.getLineNumber(), "LINE" + generationContext.getLineNumber() + "from", fromLocalVariableIndex);
         GenerationContext.addLocalVariable(generationContext.getLineNumber(), "LINE" + generationContext.getLineNumber() + "to", toLocalVariableIndex);
         GenerationContext.addLocalVariable(generationContext.getLineNumber(), "LINE" + generationContext.getLineNumber() + "step", stepLocalVariableIndex);
         GenerationContext.addLocalVariable(generationContext.getLineNumber(), "LINE" + generationContext.getLineNumber() + "counter", counterLocalVariableIndex);
         /*
          * If there are 5 parameters they are "<variablename> = <fromfar> TO <tovar>
          */
         if (generationContext.getCommonTree().getChildCount() == 5) {
            /*
             * push the step value of 1
             */
            RTLHelper.push(generationContext, 1);
            /*
             * recurse into the to, to get the value of the from onto the execution context stack
             */
            final GenerationContext toGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(4));
            Dispatcher.dispatch(toGenerationContext);
            /*
             * recurse into the from, to get the value of the from onto the execution context stack
             */
            final GenerationContext fromGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(2));
            Dispatcher.dispatch(fromGenerationContext);
         }
         /*
          * If there are 5 parameters they are "<variablename> = <fromfar> TO <tovar> STEP <varname>
          */
         else if (generationContext.getCommonTree().getChildCount() == 7) {
            /*
             * recurse into the step, to get the value of the from onto the execution context stack
             */
            final GenerationContext stepGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(6));
            Dispatcher.dispatch(stepGenerationContext);
            /*
             * recurse into the to, to get the value of the from onto the execution context stack
             */
            final GenerationContext toGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(4));
            Dispatcher.dispatch(toGenerationContext);
            /*
             * recurse into the from, to get the value of the from onto the execution context stack
             */
            final GenerationContext fromGenerationContext = new GenerationContext(generationContext, (CommonTree) generationContext.getCommonTree().getChild(2));
            Dispatcher.dispatch(fromGenerationContext);
         } else {
            throw new Exception("Invalid number of parameters to FOR");
         }
         /*
          * store this loop
          */
         generationContext.addForDeclaration(variableName, fromLocalVariableIndex, toLocalVariableIndex, stepLocalVariableIndex, counterLocalVariableIndex, generationContext.getLineNumber());
         /*
          * int start = executionContext.resolveValue(executionContext.pop()).getInteger();
          */
         generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
         generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "resolveValue",
               "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getInteger", "()Ljava/lang/Integer;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I");
         generationContext.getMethodVisitor().visitVarInsn(ISTORE, fromLocalVariableIndex);
         /*
          * int end = executionContext.resolveValue(executionContext.pop()).getInteger();
          */
         generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
         generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "resolveValue",
               "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getInteger", "()Ljava/lang/Integer;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I");
         generationContext.getMethodVisitor().visitVarInsn(ISTORE, toLocalVariableIndex);
         /*
          * int step = executionContext.resolveValue(executionContext.pop()).getInteger();
          */
         generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
         generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "resolveValue",
               "(Lcom/khubla/jvmbasic/jvmbasicrt/Value;)Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getInteger", "()Ljava/lang/Integer;");
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I");
         generationContext.getMethodVisitor().visitVarInsn(ISTORE, stepLocalVariableIndex);
         /*
          * int i = start;
          */
         generationContext.getMethodVisitor().visitVarInsn(ILOAD, fromLocalVariableIndex);
         generationContext.getMethodVisitor().visitVarInsn(ISTORE, counterLocalVariableIndex);
         /*
          * executionContext.setVariable('I', i);
          */
         generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
         generationContext.getMethodVisitor().visitLdcInsn(variableName);
         generationContext.getMethodVisitor().visitVarInsn(ILOAD, fromLocalVariableIndex);
         generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "setVariable", "(Ljava/lang/String;I)V");
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
