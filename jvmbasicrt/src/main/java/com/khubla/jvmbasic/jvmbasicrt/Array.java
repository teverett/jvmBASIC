package com.khubla.jvmbasic.jvmbasicrt;

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
import java.util.Hashtable;

/**
 * implements a BASIC-like multidimensional array of Values. The indices are arbitrary indices on orthogonal axes.
 *
 * @author tome
 */
public class Array {
   /**
    * the actual store is a Hashtable
    */
   private final Hashtable<String, Value> data = new Hashtable<String, Value>();

   /**
    * generate a key
    */
   private String generateKey(int[] indices) {
      String ret = "";
      for (int i = 0; i < indices.length; i++) {
         ret += indices[i];
         if (i != (indices.length - 1)) {
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
