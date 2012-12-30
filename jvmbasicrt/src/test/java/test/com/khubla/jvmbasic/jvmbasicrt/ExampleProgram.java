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
