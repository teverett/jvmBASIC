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
}
