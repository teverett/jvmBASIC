package test.com.khubla.jvmbasic.jvmbasicmojo;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

import com.khubla.jvmbasic.jvmbasicmojo.CompileMojo;

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
   private static final String GOAL = "compile";

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
         final CompileMojo jvmBasicMojo = (CompileMojo) lookupMojo(GOAL, pom);
         assertNotNull(jvmBasicMojo);
         jvmBasicMojo.execute();
      } catch (final Exception e) {
         e.printStackTrace();
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
         final CompileMojo jvmBasicMojo = (CompileMojo) lookupMojo(GOAL, pom);
         assertNotNull(jvmBasicMojo);
      } catch (final Exception e) {
         e.printStackTrace();
      }
   }
}