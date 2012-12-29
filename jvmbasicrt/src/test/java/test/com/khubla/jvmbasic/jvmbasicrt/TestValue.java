package test.com.khubla.jvmbasic.jvmbasicrt;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.jvmbasic.jvmbasicrt.Array;
import com.khubla.jvmbasic.jvmbasicrt.Value;

/**
 * @author tome
 */
public class TestValue {
   @Test
   public void testArray() {
      try {
         final Value v = new Value(new Array());
         Assert.assertTrue(v.getType() == Value.Type.ARRAY);
         Assert.assertTrue(v.arraySize() == 0);
         final int[] indices = new int[1]; // a single dimensional array
         indices[0] = 13; // 13'th element in the first dimension
         Assert.assertTrue(v.getArrayValue(indices) == null);
         final Value db = new Value(13.3);
         v.setArrayValue(indices, db);
         Assert.assertTrue(v.getArrayValue(indices).getDouble() == 13.3);
         Assert.assertTrue(v.arraySize() == 1);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testSetDouble() {
      try {
         final Value v = new Value("12.2");
         Assert.assertTrue(v.getType() == Value.Type.DOUBLE);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testSetInteger() {
      try {
         final Value v = new Value("12");
         Assert.assertTrue(v.getType() == Value.Type.INTEGER);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testSetStringLiteral() {
      try {
         final Value v = new Value("\"hi\"");
         Assert.assertTrue(v.getType() == Value.Type.STRING);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testSetVariableName() {
      try {
         final Value v = new Value("hi");
         Assert.assertTrue(v.getType() == Value.Type.VARIABLE);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
