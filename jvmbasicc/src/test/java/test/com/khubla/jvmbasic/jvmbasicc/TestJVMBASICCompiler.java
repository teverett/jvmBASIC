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
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

/**
 * test compiler
 * 
 * @author tom
 */
public class TestJVMBASICCompiler {
   /**
    * parse tree dir
    */
   private static final String TESTOUTPUT = "jvmbasic-test-output/";

   @BeforeTest
   public void setup() {
      new File(TESTOUTPUT).mkdirs();
   }

   private void testSingleBASFile(String filename) {
      try {
         /*
          * compile to class file
          */
         final JVMBasicCompiler compiler = new JVMBasicCompiler();
         String classname = compiler.compileToClassfile(filename, TESTOUTPUT, true);
         Assert.assertNotNull(classname);
         File generatedClassFile = new File(TESTOUTPUT + classname + ".class");
         /*
          * make sure the class file was generated
          */
         Assert.assertTrue(generatedClassFile.exists());
         Assert.assertTrue(generatedClassFile.length() > 0);
         /*
          * load the class. this will ensure it's a valid class file
          */
         URL classURL = new URL("file://" + generatedClassFile.getAbsolutePath().substring(0, generatedClassFile.getAbsolutePath().lastIndexOf('/') + 1));
         Class<?> clazz = null;
         URLClassLoader urlClassLoader = new URLClassLoader(new URL[] { classURL });
         try {
            clazz = urlClassLoader.loadClass(classname);
         } catch (Exception e) {
            throw e;
         } finally {
            urlClassLoader.close();
         }
         Assert.assertNotNull(clazz);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test(enabled = false)
   public void testHelloBas() {
      testSingleBASFile("src/test/resources/bas/a/hello.bas");
   }

   @Test(enabled = false)
   public void testEBas() {
      testSingleBASFile("src/test/resources/bas/a/e.bas");
   }

   @Test(enabled = false)
   public void testPrintBas() {
      testSingleBASFile("src/test/resources/bas/a/print.bas");
   }

   @Test(enabled = false)
   public void testIfBas() {
      testSingleBASFile("src/test/resources/bas/a/if.bas");
   }

   @Test(enabled = true)
   public void testForBas() {
      testSingleBASFile("src/test/resources/bas/a/for.bas");
   }
}