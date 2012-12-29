package com.khubla.jvmbasic.jvmbasicc.function.impl;

import com.khubla.jvmbasic.jvmbasicc.compiler.DefaultStatementProcessor;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 */
public class PROGFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * walk the statements
          */
         final DefaultStatementProcessor defaultStatementProcessor = new DefaultStatementProcessor(generationContext);
         GenerationContext.getProgramStaticAnalysis().iterate(defaultStatementProcessor);
         /*
          * keep going
          */
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
