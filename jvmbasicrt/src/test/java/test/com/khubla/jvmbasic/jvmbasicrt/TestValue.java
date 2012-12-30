package test.com.khubla.jvmbasic.jvmbasicrt;

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
