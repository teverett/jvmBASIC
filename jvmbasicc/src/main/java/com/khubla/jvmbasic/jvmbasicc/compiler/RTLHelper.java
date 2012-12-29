package com.khubla.jvmbasic.jvmbasicc.compiler;

import org.objectweb.asm.Opcodes;

/**
 * common methods to generate code to do various runtime things
 * 
 * @author tome
 */
public class RTLHelper {
   public static final String EXECUTIONCONTEXT_NAME = "executionContext";
   public static final String JASIC_RUNTIME_NAMESPACE = "com/khubla/jvmbasic/jvmbasicrt";
   public static final String JASIC_RUNTIME_EXECUTIONCONTEXT = "com/khubla/jvmbasic/jvmbasicrt/ExecutionContext";
   public static final String JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE = "Lcom/khubla/jvmbasic/jvmbasicrt/ExecutionContext;";
   public static final String JASIC_RUNTIME_VALUE = "com/khubla/jvmbasic/jvmbasicrt/Value";
   public static final String JASIC_RUNTIME_VALUE_TYPE = "Lcom/khubla/jvmbasic/jvmbasicrt/Value;";
   public static final String JASIC_RUNTIME_MATH = "com/khubla/jvmbasic/jvmbasicrt/MathFunctions";

   /**
    * push a value onto the Execution Context stack
    * <p>
    * <code>
    * executionContext.push(db);
    * </code>
    * </p>
    */
   public static void push(GenerationContext generationContext, double db) {
      generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
      generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), EXECUTIONCONTEXT_NAME, JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
      generationContext.getMethodVisitor().visitLdcInsn(new Double(db));
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Double;)V");
   }

   /**
    * push a value onto the Execution Context stack
    * <p>
    * <code>
    * executionContext.push(i);
    * </code>
    * </p>
    */
   public static void push(GenerationContext generationContext, int i) {
      generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
      generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), EXECUTIONCONTEXT_NAME, JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
      generationContext.getMethodVisitor().visitIntInsn(Opcodes.BIPUSH, i);
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/Integer;)V");
   }

   /**
    * push a value onto the Execution Context stack
    * <p>
    * <code>
    * executionContext.push(str);
    * </code>
    * </p>
    */
   public static void push(GenerationContext generationContext, String str) {
      generationContext.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
      generationContext.getMethodVisitor().visitFieldInsn(Opcodes.GETFIELD, generationContext.getClassName(), EXECUTIONCONTEXT_NAME, JASIC_RUNTIME_EXECUTIONCONTEXT_TYPE);
      generationContext.getMethodVisitor().visitLdcInsn(str);
      generationContext.getMethodVisitor().visitMethodInsn(Opcodes.INVOKEVIRTUAL, JASIC_RUNTIME_EXECUTIONCONTEXT, "push", "(Ljava/lang/String;)V");
   }
}
