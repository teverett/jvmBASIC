package test.com.khubla.jvmbasic.jvmbasicrt;

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
         /*
          * create array
          */
         final Array array = new Array();
         /*
          * currently empty
          */
         final int[] indices = { 1, 2, };
         Assert.assertNull(array.getValue(indices));
         Assert.assertTrue(array.size() == 0);
         /*
          * a value
          */
         final Value value = new Value("343434");
         array.putValue(value, indices);
         Assert.assertNotNull(array.getValue(indices));
         Assert.assertTrue(array.size() == 1);
         /*
          * get back an empty cell
          */
         Value v = array.getValue(new int[] { 6, 1 });
         Assert.assertTrue(null == v);
         /*
          * get back the cell we put
          */
         v = array.getValue(new int[] { 1, 2 });
         Assert.assertTrue(v.getInteger() == 343434);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
