package test.com.khubla.jvmbasic.jvmbasicmojo;

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
import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

import com.khubla.jvmbasic.jvmbasicmojo.JVMBasicMojo;

/**
 * @author tome
 */
public class TestJVMBasicMojo extends AbstractMojoTestCase {
   /**
    * file
    */
   private static final String POMFILE = "src/test/resources/TestJVMBasicMojo-pom.xml";
   /**
    * goal
    */
   private static final String GOAL = "jvmbasic";

   @Override
   protected void setUp() throws Exception {
      // required
      super.setUp();
   }

   @Override
   protected void tearDown() throws Exception {
      // required
      super.tearDown();
   }

   /**
    * Basic test of execution
    */
   public void testExecution() throws Exception {
      try {
         final File pom = getTestFile(POMFILE);
         assertNotNull(pom);
         assertTrue(pom.exists());
         final JVMBasicMojo jvmBasicMojo = (JVMBasicMojo) lookupMojo(GOAL, pom);
         assertNotNull(jvmBasicMojo);
         jvmBasicMojo.execute();
      } catch (final Exception e) {
         e.printStackTrace();
         fail();
      }
   }

   /**
    * Basic test of instatiation
    */
   public void testInstatiation() throws Exception {
      try {
         final File pom = getTestFile(POMFILE);
         assertNotNull(pom);
         assertTrue(pom.exists());
         final JVMBasicMojo jvmBasicMojo = (JVMBasicMojo) lookupMojo(GOAL, pom);
         assertNotNull(jvmBasicMojo);
      } catch (final Exception e) {
         e.printStackTrace();
         fail();
      }
   }
}