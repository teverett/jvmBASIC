package com.khubla.jvmbasic.jvmbasicc.function.impl;

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.function.Function;

/**
 * @author tome
 */
public class FACTORFunction implements Function {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
