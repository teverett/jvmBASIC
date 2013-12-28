package test.com.khubla.jvmbasic.jvmbasicc;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;
import com.khubla.jvmbasic.jvmbasicrt.support.Loader;

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
 * test compiler
 * 
 * @author tom
 */
public abstract class BaseCompilerTest {
   /**
    * parse tree dir
    */
   protected static final String TESTOUTPUT = "jvmbasic-test-output/";

   @BeforeTest
   public void setup() {
      new File(TESTOUTPUT).mkdirs();
   }

   /**
    * try running the generated class file
    */
   private void testInvocation(Object instance) throws IllegalAccessException, Exception {
      Loader.setInputStream(instance, System.in);
      Loader.setOutputStreamField(instance, System.out);
      Loader.invokeMainMethod(instance);
   }

   public void testSingleBASFile(String filename) {
      try {
         /*
          * compile to class file
          */
         final JVMBasicCompiler compiler = new JVMBasicCompiler();
         final String classname = compiler.compileToClassfile(filename, TESTOUTPUT, true);
         Assert.assertNotNull(classname);
         final File generatedClassFile = new File(TESTOUTPUT + classname + ".class");
         /*
          * make sure the class file was generated
          */
         Assert.assertTrue(generatedClassFile.exists());
         Assert.assertTrue(generatedClassFile.length() > 0);
         /*
          * directory
          */
         final String dir = generatedClassFile.getAbsolutePath().substring(0, generatedClassFile.getAbsolutePath().lastIndexOf('/') + 1);
         /*
          * load the class. this will ensure it's a valid class file
          */
         final Object o = Loader.load(classname, dir);
         Assert.assertNotNull(o);
         /*
          * try it
          */
         System.out.println("Running class '" + classname + "'");
         testInvocation(o);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
