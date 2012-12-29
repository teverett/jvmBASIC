package test.com.khubla.jvmbasic.jvmbasicrt;

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
