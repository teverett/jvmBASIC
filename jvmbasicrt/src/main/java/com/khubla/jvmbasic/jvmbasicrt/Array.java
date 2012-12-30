package com.khubla.jvmbasic.jvmbasicrt;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
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
