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
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.VardeclContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.Dispatcher;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;
import com.khubla.jvmbasic.jvmbasicc.util.VariableNameUtil;

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
 * <p>
 * forstmt : FOR vardecl EQ expression TO expression (STEP expression)? statement NEXT vardecl?; ;
 * </p>
 * 
 * @author tome
 */
public class forstmtRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * variables to collect
          */
         final VardeclContext vardeclContext = (VardeclContext) generationContext.getParseTree().getChild(1);
         final String variableName = VariableNameUtil.getVariableName(vardeclContext);
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
          * If there are no STEP parameters
          */
         final int parameterCount = generationContext.getParseTree().getChildCount();
         if ((parameterCount == 9) || (parameterCount == 8)) {
            /*
             * push the step value of 1
             */
            RTLHelper.push(generationContext, 1);
            /*
             * recurse into the to, to get the value of the from onto the execution context stack
             */
            final GenerationContext toGenerationContext = new GenerationContext(generationContext, generationContext.getParseTree().getChild(5));
            Dispatcher.dispatch(toGenerationContext);
            /*
             * recurse into the from, to get the value of the from onto the execution context stack
             */
            final GenerationContext fromGenerationContext = new GenerationContext(generationContext, generationContext.getParseTree().getChild(3));
            Dispatcher.dispatch(fromGenerationContext);
         }
         /*
          * If there are STEP parameters
          */
         else if ((parameterCount == 11) || (parameterCount == 10)) {
            /*
             * recurse into the step, to get the value of the from onto the execution context stack
             */
            final GenerationContext stepGenerationContext = new GenerationContext(generationContext, generationContext.getParseTree().getChild(7));
            Dispatcher.dispatch(stepGenerationContext);
            /*
             * recurse into the to, to get the value of the from onto the execution context stack
             */
            final GenerationContext toGenerationContext = new GenerationContext(generationContext, generationContext.getParseTree().getChild(5));
            Dispatcher.dispatch(toGenerationContext);
            /*
             * recurse into the from, to get the value of the from onto the execution context stack
             */
            final GenerationContext fromGenerationContext = new GenerationContext(generationContext, generationContext.getParseTree().getChild(3));
            Dispatcher.dispatch(fromGenerationContext);
         } else {
            throw new Exception("Invalid number of parameters to forstmtRule");
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
