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
 * @author tome
 *         <p>
 *         <code>
 * System.out.print(executionContext.pop().getAsString());
 * </code>
 *         </p>
 *         <p>
 *         <code>
 *       executionContext.push("\"" + new BufferedReader(new InputStreamReader(System.in)).readLine() + "\""); 
 *         </code>
 *         </p>
 *         <p>
 *         <code>
 *           executionContext.setVariable(executionContext.pop().getString(), executionContext.pop());
 *         </code>
 *         </p>
 */
public class inputstmtRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * process the contained nodes. This will push the String prompt onto the stack, and a variable name
          */
         Dispatcher.dispatchChildren(generationContext);
         /*
          * input with a prompt? INPUT <prompt> , <variable>
          */
         if (generationContext.getParseTree().getChildCount() == 4) {
            /*
             * swap the stack arguments so we have the prompt on top and the variable name next
             */
            generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
            generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "swap", "()V");
            /*
             * print the prompt
             */
            generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
            generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "pop", "()Lcom/khubla/jvmbasic/jvmbasicrt/Value;");
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "com/khubla/jvmbasic/jvmbasicrt/Value", "getAsString", "()Ljava/lang/String;");
            generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "print", "(Ljava/lang/String;)V");
         }
         /*
          * read a line and push onto value stack
          */
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), RTLHelper.EXECUTIONCONTEXT_NAME, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
         generationContext.getMethodVisitor().visitTypeInsn(Opcodes.NEW, "java/lang/StringBuilder");
         generationContext.getMethodVisitor().visitInsn(Opcodes.DUP);
         generationContext.getMethodVisitor().visitLdcInsn("\"");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
         generationContext.getMethodVisitor().visitTypeInsn(Opcodes.NEW, "java/io/BufferedReader");
         generationContext.getMethodVisitor().visitInsn(Opcodes.DUP);
         generationContext.getMethodVisitor().visitTypeInsn(Opcodes.NEW, "java/io/InputStreamReader");
         generationContext.getMethodVisitor().visitInsn(Opcodes.DUP);
         generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
         generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), "inputStream", "Ljava/io/InputStream;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESPECIAL, "java/io/InputStreamReader", "<init>", "(Ljava/io/InputStream;)V");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESPECIAL, "java/io/BufferedReader", "<init>", "(Ljava/io/Reader;)V");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/BufferedReader", "readLine", "()Ljava/lang/String;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
         generationContext.getMethodVisitor().visitLdcInsn("\"");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
         generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, RTLHelper.JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/String;)V");
         /*
          * swap the stack arguments so we have the variable name on top and the value below it
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
