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
/**
 * a BASIC-esque dynamic value
 * <p>
 * Arrays are implemented as java static arrays
 * </p>
 */
public class Value {
   /**
    * types of values we are interested in
    * <p>
    * The difference b/t a STRING and a VARIABLE is that a string is enclosed in quotes, a variable is not
    * </p>
    */
   public enum Type {
      STRING, DOUBLE, INTEGER, BOOLEAN, VARIABLE, ARRAY;
   }

   /**
    * value type
    */
   private final Type type;
   /**
    * value value
    */
   private final Object value;

   public Value(Array array) {
      type = Type.ARRAY;
      value = array;
   }

   public Value(boolean value) {
      type = Type.BOOLEAN;
      this.value = value;
   }

   public Value(double value) {
      type = Type.DOUBLE;
      this.value = value;
   }

   public Value(int value) {
      type = Type.INTEGER;
      this.value = value;
   }

   /**
    * set from a string literal or a variable name.
    * <p>
    * If the value is enclosed in quotes it is interpreted as a string literal. If it starts with a digit it's numeric, otherwise it is a variable name.
    * </p>
    */
   public Value(String value) {
      final String str = value.toString();
      /*
       * anything enclosed in quotes is a string
       */
      if (str.startsWith("\"")) {
         this.value = removeQuotes(str);
         type = Type.STRING;
      } else {
         /*
          * ok, so its not enclosed in quotes; it could be a number or a variable
          */
         if (Character.isDigit(value.charAt(0))) {
            if (value.contains(".")) {
               /*
                * its a double
                */
               this.value = Double.parseDouble(value);
               type = Type.DOUBLE;
            } else {
               /*
                * its an integer
                */
               this.value = Integer.parseInt(value);
               type = Type.INTEGER;
            }
         } else {
            /*
             * it's a variable
             */
            this.value = value;
            type = Type.VARIABLE;
         }
      }
   }

   /**
    * get the size of array
    */
   public int arraySize() {
      if (type == Type.ARRAY) {
         final Array array = (Array) value;
         return array.size();
      } else {
         return 0;
      }
   }

   public Value getArrayValue(int[] indices) {
      if (type == Type.ARRAY) {
         final Array array = (Array) value;
         return array.getValue(indices);
      }
      return null;
   }

   public String getAsString() {
      if (type == Type.DOUBLE) {
         return Double.toString((Double) value);
      } else if (type == Type.INTEGER) {
         return Integer.toString((Integer) value);
      } else if (type == Type.STRING) {
         return (String) value;
      } else if (type == Type.VARIABLE) {
         return "variable with name '" + (String) value + "'";
      } else if (type == Type.BOOLEAN) {
         final Boolean b = (Boolean) value;
         return b.toString();
      } else if (type == Type.ARRAY) {
         return "array of length '" + arraySize() + "'";
      } else {
         return null;
      }
   }

   public Boolean getBoolean() {
      if (type == Type.BOOLEAN) {
         return (Boolean) value;
      } else {
         return null;
      }
   }

   public Double getDouble() {
      if (type == Type.DOUBLE) {
         return (Double) value;
      } else if (type == Type.INTEGER) {
         return new Double((Integer) value);
      } else if (type == Type.STRING) {
         try {
            return Double.parseDouble((String) value);
         } catch (final Exception e) {
            return null;
         }
      }
      return null;
   }

   public Integer getInteger() {
      if (type == Type.DOUBLE) {
         final Double db = (Double) value;
         return new Integer(db.intValue());
      } else if (type == Type.INTEGER) {
         return (Integer) value;
      } else if (type == Type.STRING) {
         try {
            return Integer.parseInt((String) value);
         } catch (final Exception e) {
            return null;
         }
      }
      return null;
   }

   public String getString() {
      return (String) value;
   }

   public Type getType() {
      return type;
   }

   public Object getValue() {
      return value;
   }

   private String removeQuotes(String str) {
      return str.substring(1, str.length() - 1);
   }

   public void setArrayValue(int[] indices, Value vv) {
      if (type == Type.ARRAY) {
         final Array array = (Array) value;
         array.putValue(vv, indices);
      }
   }

   @Override
   public String toString() {
      switch (type) {
         case STRING:
            return (String) value;
         case DOUBLE:
            return Double.toString((Double) value);
         case INTEGER:
            return Integer.toString((Integer) value);
         case BOOLEAN:
            return Boolean.toString((Boolean) value);
         default:
            return null;
      }
   }
}
