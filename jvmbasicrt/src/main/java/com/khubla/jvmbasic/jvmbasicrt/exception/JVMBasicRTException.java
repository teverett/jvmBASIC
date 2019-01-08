package com.khubla.jvmbasic.jvmbasicrt.exception;

public class JVMBasicRTException extends Exception {
   private static final long serialVersionUID = 1L;

   public JVMBasicRTException(Exception e) {
      super(e);
   }

   public JVMBasicRTException(String message) {
      super(message);
   }

   public JVMBasicRTException(String message, Exception e) {
      super(message, e);
   }
}