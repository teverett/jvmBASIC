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
/**
 * @author tome
 */
public class MathFunctions {
   /**
    * absolute value
    */
   public static Double ABS(Value v) {
      if (null != v) {
         Double db1 = v.getDouble();
         if (db1 < 0) {
            db1 = db1 * -1;
         }
         return db1;
      }
      return null;
   }

   /**
    * ACOS function
    */
   public static Double ACOS(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.acos(db1);
         }
      }
      return null;
   }

   /**
    * ASIN function
    */
   public static Double ASIN(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.asin(db1);
         }
      }
      return null;
   }

   /**
    * ATAN function
    */
   public static Double ATAN(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.atan(db1);
         }
      }
      return null;
   }

   /**
    * COS function
    */
   public static Double COS(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.cos(db1);
         }
      }
      return null;
   }

   /**
    * EXP function
    */
   public static Double EXP(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.exp(db1);
         }
      }
      return null;
   }

   public static Boolean GT(Value v1, Value v2) {
      if ((null != v1) && (null != v2)) {
         final Double db1 = v1.getDouble();
         final Double db2 = v2.getDouble();
         if ((null != db1) && (null != db2)) {
            return db2 > db1;
         }
      }
      return null;
   }

   public static Boolean GTE(Value v1, Value v2) {
      if ((null != v1) && (null != v2)) {
         final Double db1 = v1.getDouble();
         final Double db2 = v2.getDouble();
         if ((null != db1) && (null != db2)) {
            return db2 >= db1;
         }
      }
      return null;
   }

   /**
    * INT function
    */
   public static Double INT(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.floor(db1);
         }
      }
      return null;
   }

   /**
    * LOG function
    */
   public static Double LOG(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.log(db1);
         }
      }
      return null;
   }

   public static Boolean LT(Value v1, Value v2) {
      if ((null != v1) && (null != v2)) {
         final Double db1 = v1.getDouble();
         final Double db2 = v2.getDouble();
         if ((null != db1) && (null != db2)) {
            return db2 < db1;
         }
      }
      return null;
   }

   public static Boolean LTE(Value v1, Value v2) {
      if ((null != v1) && (null != v2)) {
         final Double db1 = v1.getDouble();
         final Double db2 = v2.getDouble();
         if ((null != db1) && (null != db2)) {
            return db2 <= db1;
         }
      }
      return null;
   }

   /**
    * SIN function
    */
   public static Double SIN(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.sin(db1);
         }
      }
      return null;
   }

   /**
    * square function
    */
   public static Double SQR(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return db1 * db1;
         }
      }
      return null;
   }

   /**
    * TAN function
    */
   public static Double TAN(Value v1) {
      if (null != v1) {
         final Double db1 = v1.getDouble();
         if (null != db1) {
            return Math.tan(db1);
         }
      }
      return null;
   }
}
