package com.khubla.jvmbasic.jvmbasicc.function.impl;

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
import com.khubla.jvmbasic.jvmbasicc.compiler.DefaultStatementProcessor;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.processor.StatementsProcessor;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * The syntax of a GOSUB is "GOSUB <linenumber>. The subroutine is done when it reaches a return instruction.
 * <p>
 * In order to be simple reliable, we inline the GOSUBs. It's not possible to implement gosub as methods since there could be a GOTO into the middle of any GOSUB. Such is BASIC! *
 * </p>
 * 
 * @author tome
 */
public class GOSUBFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * we expect a single argument, a line number
          */
         if (generationContext.getParseTree().getChildCount() == 1) {
            /*
             * get the line number
             */
            final int lineNumber = Integer.parseInt(generationContext.getChildValue(0));
            /*
             * iterate from the line number to a RETURN
             */
            final DefaultStatementProcessor defaultStatementProcessor = new DefaultStatementProcessor(generationContext);
            final StatementsProcessor statementsProcessor = new StatementsProcessor(GenerationContext.getProgramStaticAnalysis());
            statementsProcessor.ProcessFromLine(lineNumber, defaultStatementProcessor);
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
