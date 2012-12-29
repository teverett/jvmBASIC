package com.khubla.jvmbasic.jvmbasicrt;

import java.util.Hashtable;

/**
 * implements a BASIC-like multidimensional array
 * 
 * @author tome
 */
public class Array {
   /**
    * the actual store is a hashtable
    */
   private final Hashtable<String, Value> data = new Hashtable<String, Value>();

   /**
    * generate a key
    */
   private String generateKey(int[] indices) {
      String ret = "";
      for (int i = 0; i < indices.length; i++) {
         ret += indices;
         if (i != indices.length) {
            ret += ":";
         }
      }
      return ret;
   }

   public Value getValue(int[] indices) {
      return data.get(generateKey(indices));
   }

   public void putValue(Value value, int[] indices) {
      data.put(generateKey(indices), value);
   }

   public int size() {
      return data.size();
   }
}
