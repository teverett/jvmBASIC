package com.khubla.jvmbasic.jvmbasicc.exception;

public class JVMBasicException extends Exception {
   private static final long serialVersionUID = 1L;

   public JVMBasicException(Exception e) {
      super(e);
   }

   public JVMBasicException(String message) {
      super(message);
   }

   public JVMBasicException(String message, Exception e) {
      super(message, e);
   }
}