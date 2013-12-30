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
import java.io.ByteArrayOutputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author tom
 */
public class TestA extends BaseCompilerTest {
   @Test(enabled = true)
   public void testDataBas() {
      testSingleBASFile("src/test/resources/bas/a/data.bas");
   }

   @Test(enabled = true)
   public void testDimBas() {
      testSingleBASFile("src/test/resources/bas/a/dim.bas");
   }

   @Test(enabled = true)
   public void testEBas() {
      testSingleBASFile("src/test/resources/bas/a/e.bas");
   }

   @Test(enabled = true)
   public void testExpressionsBas() {
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      testSingleBASFile("src/test/resources/bas/a/expressions.bas", System.in, baos);
      final String[] results = baos.toString().split("\n");
      Assert.assertTrue(results[0].compareTo("3.0") == 0);
      Assert.assertTrue(results[1].compareTo("-2.0") == 0);
      Assert.assertTrue(results[2].compareTo("35.0") == 0);
      Assert.assertTrue(results[3].compareTo("1.4") == 0);
      Assert.assertTrue(results[4].compareTo("4.0") == 0);
      Assert.assertTrue(results[5].compareTo("0.0") == 0);
      Assert.assertTrue(results[6].compareTo("20.0") == 0);
   }

   @Test(enabled = true)
   public void testForBas() {
      testSingleBASFile("src/test/resources/bas/a/for.bas");
   }

   @Test(enabled = true)
   public void testGosubBas() {
      testSingleBASFile("src/test/resources/bas/a/gosub.bas");
   }

   @Test(enabled = false)
   public void testGotoBas() {
      testSingleBASFile("src/test/resources/bas/a/goto.bas");
   }

   @Test(enabled = true)
   public void testHelloBas() {
      testSingleBASFile("src/test/resources/bas/a/hello.bas");
   }

   @Test(enabled = false)
   public void testIfBas() {
      testSingleBASFile("src/test/resources/bas/a/if.bas");
   }

   @Test(enabled = true)
   public void testIncludeBas() {
      testSingleBASFile("src/test/resources/bas/a/include.bas");
   }

   @Test(enabled = false)
   public void testInputBas() {
      testSingleBASFile("src/test/resources/bas/a/input.bas");
   }

   @Test(enabled = true)
   public void testMathBas() {
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      testSingleBASFile("src/test/resources/bas/a/math.bas", System.in, baos);
      final String[] results = baos.toString().split("\n");
      Assert.assertTrue(results[0].compareTo("-0.4161468365471424") == 0);
      Assert.assertTrue(results[1].compareTo("1.1071487177940904") == 0);
      Assert.assertTrue(results[2].compareTo("0.6931471805599453") == 0);
      Assert.assertTrue(results[3].compareTo("0.9092974268256817") == 0);
      Assert.assertTrue(results[4].compareTo("-2.185039863261519") == 0);
      Assert.assertTrue(results[5].compareTo("4.0") == 0);
      Assert.assertTrue(results[6].compareTo("2.0") == 0);
      Assert.assertTrue(results[8].compareTo("12.0") == 0);
   }

   @Test(enabled = false)
   public void testPrintBas() {
      testSingleBASFile("src/test/resources/bas/a/print.bas");
   }

   @Test(enabled = true)
   public void testSimpleIfBas() {
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      testSingleBASFile("src/test/resources/bas/a/simpleif.bas", System.in, baos);
      final String[] results = baos.toString().split("\n");
      Assert.assertTrue(results[0].compareTo("hi") == 0);
   }

   @Test(enabled = true)
   public void testStringsBas() {
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      testSingleBASFile("src/test/resources/bas/a/strings.bas", System.in, baos);
      final String[] results = baos.toString().split("\n");
      Assert.assertTrue(results[0].compareTo("6") == 0);
      Assert.assertTrue(results[1].compareTo("23") == 0);
      Assert.assertTrue(results[2].compareTo("ab") == 0);
      Assert.assertTrue(results[3].compareTo("b") == 0);
      Assert.assertTrue(results[4].compareTo("abcxyz") == 0);
      Assert.assertTrue(results[5].compareTo("11.2") == 0);
      Assert.assertTrue(results[6].compareTo("500") == 0);
   }
}