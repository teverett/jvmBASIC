package test.com.khubla.jvmbasic.jvmbasicrt;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.jvmbasic.jvmbasicrt.StringFunctions;
import com.khubla.jvmbasic.jvmbasicrt.Value;

/**
 * @author tom
 */
public class TestStringFunctions {
   @Test
   public void testConcat() {
      try {
         final Value v1 = new Value("\"abc\"");
         final Value v2 = new Value("\"123\"");
         final String result = StringFunctions.concat(v1, v2);
         Assert.assertTrue(result.compareTo("\"123abc\"") == 0);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testLEFT() {
      try {
         final Value v1 = new Value("\"abc\"");
         final Value v2 = new Value(2);
         final String result = StringFunctions.LEFT(v2, v1);
         Assert.assertTrue(result.compareTo("\"ab\"") == 0);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testLEN() {
      try {
         final Value v1 = new Value("\"abc\"");
         final Integer result = StringFunctions.LEN(v1);
         Assert.assertTrue(result == 3);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testMID() {
      try {
         final Value v1 = new Value("\"abcdef\"");
         final Value v2 = new Value(2);
         final Value v3 = new Value(3);
         final String result = StringFunctions.MID(v2, v3, v1);
         Assert.assertTrue(result.compareTo("\"de\"") == 0);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testRIGHT() {
      try {
         final Value v1 = new Value("\"abc\"");
         final Value v2 = new Value(2);
         final String result = StringFunctions.RIGHT(v2, v1);
         Assert.assertTrue(result.compareTo("\"bc\"") == 0);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testVAL() {
      try {
         final Value v1 = new Value(12);
         final String result = StringFunctions.VAL(v1);
         Assert.assertTrue(result.compareTo("\"12\"") == 0);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
