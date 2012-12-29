package com.khubla.jvmbasic.jvmbasicrt;

/**
 * @author tome
 */
public class StringFunctions {
   /**
    * String concat
    */
   public static String concat(Value v1, Value v2) {
      if ((null != v1) && (null != v2)) {
         /*
          * enclose the result to signal to the ctor of Value that this is a string literal, not a variable name
          */
         return "\"" + v2.getAsString() + v1.getAsString() + "\"";
      }
      return null;
   }

   /**
    * LEFT$(String, start, len)
    */
   public static String LEFT(Value len, Value str) {
      if ((null != str) & (null != len)) {
         return "\"" + str.getAsString().substring(0, len.getInteger()) + "\"";
      }
      return null;
   }

   /**
    * string length
    */
   public static Integer LEN(Value v) {
      if (null != v) {
         return v.getAsString().length();
      }
      return null;
   }

   /**
    * MID$(String, start, len)
    */
   public static String MID(Value len, Value start, Value str) {
      if ((null != str) && ((null != start) & (null != len))) {
         return "\"" + str.getAsString().substring(start.getInteger(), len.getInteger() + start.getInteger()) + "\"";
      }
      return null;
   }

   /**
    * RIGHT$(String, start, len)
    */
   public static String RIGHT(Value len, Value str) {
      if ((null != str) & (null != len)) {
         final int beginIndex = str.getAsString().length() - len.getInteger();
         return "\"" + str.getAsString().substring(beginIndex, str.getAsString().length()) + "\"";
      }
      return null;
   }

   /**
    * STR$
    */
   public static String STR(Value v) {
      if (null != v) {
         return "\"" + v.getAsString() + "\"";
      }
      return null;
   }

   /**
    * VAL
    */
   public static String VAL(Value v) {
      if (null != v) {
         return "\"" + v.getInteger() + "\"";
      }
      return null;
   }
}
