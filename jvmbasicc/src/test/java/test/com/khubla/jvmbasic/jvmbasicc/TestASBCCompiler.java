package test.com.khubla.jvmbasic.jvmbasicc;

import java.io.FileInputStream;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

/**
 * test compiler
 * 
 * @author tom
 */
public class TestASBCCompiler {
   @Test
   public void test1() {
      try {
         final String fileName = "src/test/resources/bas/easy/print.bas";
         final InputStream inputStream = new FileInputStream(fileName);
         final JVMBasicCompiler compiler = new JVMBasicCompiler();
         final byte[] bytecode = compiler.compile(inputStream, "print", true);
         Assert.assertNotNull(bytecode);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}