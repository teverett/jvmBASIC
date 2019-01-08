package com.khubla.jvmbasic.jvmbasicc.exception;

public class JVMBasicFunctionException extends JVMBasicException {
   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public JVMBasicFunctionException(Exception e) {
      super(e);
   }

   public JVMBasicFunctionException(String message) {
      super(message);
   }

   public JVMBasicFunctionException(String message, Exception e) {
      super(message, e);
   }
}
