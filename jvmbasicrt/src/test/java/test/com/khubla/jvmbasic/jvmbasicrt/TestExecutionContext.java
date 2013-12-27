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

import com.khubla.jvmbasic.jvmbasicrt.ExecutionContext;
import com.khubla.jvmbasic.jvmbasicrt.Value;

/**
 * @author tome
 */
public class TestExecutionContext {
   @Test
   public void testVariables() {
      try {
         final ExecutionContext executionContext = new ExecutionContext();
         /*
          * currently empty
          */
         final Value v = executionContext.getVariable("tge");
         Assert.assertTrue(null == v);
         /*
          * set some values
          */
         final Value v1 = new Value(17);
         executionContext.setVariable("v1", v1);
         final Value v2 = new Value("\"v2\"");
         executionContext.setVariable("v2", v2);
         final Value v3 = new Value("v1");
         executionContext.setVariable("v3", v3);
         /*
          * get them back
          */
         final Value vv1 = executionContext.getVariable("v1");
         Assert.assertNotNull(vv1);
         Assert.assertTrue(vv1.getInteger() == 17);
         final Value vvv1 = executionContext.resolveValue(vv1);
         Assert.assertNotNull(vvv1);
         Assert.assertTrue(vvv1.getInteger() == 17);
         final Value vv2 = executionContext.getVariable("v2");
         Assert.assertNotNull(vv2);
         Assert.assertTrue(vv2.getAsString().compareTo("v2") == 0);
         final Value vvv2 = executionContext.resolveValue(vv2);
         Assert.assertNotNull(vvv2);
         Assert.assertTrue(vvv2.getAsString().compareTo("v2") == 0);
         final Value vv3 = executionContext.getVariable("v3");
         Assert.assertNotNull(vv3);
         Assert.assertTrue(vv3.getAsString().compareTo("variable with name 'v1'") == 0);
         final Value vvv3 = executionContext.resolveValue(vv3);
         Assert.assertNotNull(vvv3);
         Assert.assertTrue(vvv3.getAsString().compareTo("17") == 0);
         Assert.assertTrue(vvv3.getInteger() == 17);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
