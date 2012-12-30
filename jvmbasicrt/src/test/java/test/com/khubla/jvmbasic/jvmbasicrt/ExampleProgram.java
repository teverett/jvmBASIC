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
import java.io.InputStream;
import java.io.PrintStream;

import com.khubla.jvmbasic.jvmbasicrt.Array;
import com.khubla.jvmbasic.jvmbasicrt.ExecutionContext;
import com.khubla.jvmbasic.jvmbasicrt.Value;

/**
 * @author tome
 */
public class ExampleProgram {
   public static void main(String[] args) {
      final ExampleProgram exampleProgram = new ExampleProgram();
      try {
         exampleProgram.inputStream = System.in;
         exampleProgram.outputStream = System.out;
         exampleProgram.program();
      } catch (final Exception e) {
         e.printStackTrace();
      }
   }

   public ExecutionContext executionContext = new ExecutionContext();
   public InputStream inputStream;
   public PrintStream outputStream;

   public void forExample() throws Exception {
      /*
       * FOR
       */
      final int start = executionContext.resolveValue(executionContext.pop()).getInteger();
      final int end = executionContext.resolveValue(executionContext.pop()).getInteger();
      final int step = executionContext.resolveValue(executionContext.pop()).getInteger();
      int i = start;
      executionContext.setVariable("I", i);
      /*
       * NEXT
       */
      if (i < end) {
         i = i + step;
         executionContext.setVariable("I", i);
      }
   }

   public void program() throws Exception {
      executionContext.setVariable(executionContext.pop().getString(), new Value(new Array()));
   }
}
