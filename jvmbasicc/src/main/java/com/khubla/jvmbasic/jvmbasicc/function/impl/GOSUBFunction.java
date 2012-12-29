package com.khubla.jvmbasic.jvmbasicc.function.impl;

import com.khubla.jvmbasic.jvmbasicc.compiler.DefaultStatementProcessor;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
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
         if (generationContext.getCommonTree().getChildCount() == 1) {
            /*
             * get the line number
             */
            final int lineNumber = Integer.parseInt(generationContext.getChildValue(0));
            /*
             * iterate from the line number to a RETURN
             */
            final DefaultStatementProcessor defaultStatementProcessor = new DefaultStatementProcessor(generationContext);
            GenerationContext.getProgramStaticAnalysis().iterateFromLine(lineNumber, defaultStatementProcessor);
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
