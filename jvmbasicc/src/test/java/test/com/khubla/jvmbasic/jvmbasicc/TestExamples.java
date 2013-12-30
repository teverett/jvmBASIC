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
public class TestExamples extends BaseCompilerTest {
   @Test(enabled = false)
   public void testBeerBas() {
      testSingleBASFile("src/test/resources/bas/examples/beer.bas");
   }

   @Test(enabled = false)
   public void testExample1Bas() {
      testSingleBASFile("src/test/resources/bas/examples/example1.bas");
   }

   @Test(enabled = true)
   public void testPrintBas() {
      testSingleBASFile("src/test/resources/bas/examples/print.bas");
   }

   @Test(enabled = true)
   public void testsSubprintBas() {
      testSingleBASFile("src/test/resources/bas/examples/subprint.bas");
   }
}