package test.com.khubla.jvmbasic.jvmbasicc;

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
import org.testng.annotations.Test;

/**
 * @author tom
 */
public class TestA extends BaseCompilerTest {
   @Test(enabled = true)
   public void testEBas() {
      testSingleBASFile("src/test/resources/bas/a/e.bas");
   }

   @Test(enabled = false)
   public void testForBas() {
      testSingleBASFile("src/test/resources/bas/a/for.bas");
   }

   @Test(enabled = true)
   public void testHelloBas() {
      testSingleBASFile("src/test/resources/bas/a/hello.bas");
   }

   @Test(enabled = false)
   public void testIfBas() {
      testSingleBASFile("src/test/resources/bas/a/if.bas");
   }

   @Test(enabled = false)
   public void testPrintBas() {
      testSingleBASFile("src/test/resources/bas/a/print.bas");
   }

   @Test(enabled = false)
   public void testSimpleIfBas() {
      testSingleBASFile("src/test/resources/bas/a/simpleif.bas");
   }

   @Test(enabled = true)
   public void testMathBas() {
      testSingleBASFile("src/test/resources/bas/a/math.bas");
   }

   @Test(enabled = true)
   public void testStringsBas() {
      testSingleBASFile("src/test/resources/bas/a/strings.bas");
   }

   @Test(enabled = true)
   public void testExpressionsBas() {
      testSingleBASFile("src/test/resources/bas/a/expressions.bas");
   }

   @Test(enabled = true)
   public void testIncludeBas() {
      testSingleBASFile("src/test/resources/bas/a/include.bas");
   }

   @Test(enabled = true)
   public void testInputBas() {
      testSingleBASFile("src/test/resources/bas/a/input.bas");
   }
}