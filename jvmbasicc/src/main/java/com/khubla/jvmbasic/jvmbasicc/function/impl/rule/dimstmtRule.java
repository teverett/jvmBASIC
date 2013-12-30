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
import com.khubla.jvmbasic.jvmbasicc.compiler.Dispatcher;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * a DIM in BASIC declares an array. the RT code stores arrays as Hashtables, so we dont actually care how many dimensions there are.
 * 
 * @author tome
 */
public class dimstmtRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * so the subtree under the <DIM> here will be <varname> <NUMBER> )
          */
         if (generationContext.getParseTree().getChildCount() == 2) {
            /*
             * get the variable name onto the execution context
             */
            Dispatcher.dispatchChildren(generationContext);
            /*
             * executionContext.setVariable(executionContext.pop().getString(), new Value(new Array()));
             */
            generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
            generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
            generationContext.getMethodVisitor().visitVarInsn(ALOAD, 0);
            generationContext.getMethodVisitor().visitFieldInsn(GETFIELD, generationContext.getClassName(), "executionContext", "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;");
            generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
            generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getString", "()Ljava/lang/String;");
            generationContext.getMethodVisitor().visitTypeInsn(NEW, "com/khubla/jvmbasic/jvmbasicrt/Value");
            generationContext.getMethodVisitor().visitInsn(DUP);
            generationContext.getMethodVisitor().visitTypeInsn(NEW, "com/khubla/jvmbasic/jvmbasicrt/Array");
            generationContext.getMethodVisitor().visitInsn(DUP);
            generationContext.getMethodVisitor().visitMethodInsn(INVOKESPECIAL, "com/khubla/jvmbasic/jvmbasicrt/Array", "<init>", "()V");
            generationContext.getMethodVisitor().visitMethodInsn(INVOKESPECIAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "<init>", "(Lcom/khubla/jvmbasic/jvmbasicrt/Array;)V");
            generationContext.getMethodVisitor().visitMethodInsn(INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext", "setVariable",
                  "(Ljava/lang/String;Lcom/khubla/jvmbasic/jvmbasicrt/Value;)V");
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
