package test.com.khubla.jvmbasic.jvmbasicrt;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.jvmbasic.jvmbasicrt.Array;
import com.khubla.jvmbasic.jvmbasicrt.Value;

/**
 * @author tome
 */
public class TestArray {
   @Test
   public void testArray() {
      try {
         final Array array = new Array();
         final int[] indices = { 1, 2, };
         Assert.assertNull(array.getValue(indices));
         final Value value = new Value("343434");
         array.putValue(value, indices);
         Assert.assertNotNull(array.getValue(indices));
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
