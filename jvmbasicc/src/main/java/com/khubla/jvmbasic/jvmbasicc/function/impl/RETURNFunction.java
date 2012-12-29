package com.khubla.jvmbasic.jvmbasicc.function.impl;

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 */
public class RETURNFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * signal that we are done iterating lines
          */
         return false;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
