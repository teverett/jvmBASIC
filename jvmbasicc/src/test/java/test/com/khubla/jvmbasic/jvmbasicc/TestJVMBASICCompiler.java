package test.com.khubla.jvmbasic.jvmbasicc;
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
public class TestJVMBASICCompiler {
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