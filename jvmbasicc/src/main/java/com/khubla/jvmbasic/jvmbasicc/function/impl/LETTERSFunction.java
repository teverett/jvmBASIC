package com.khubla.jvmbasic.jvmbasicc.function.impl;

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 */
public class LETTERSFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * push the letter
          */
         String letter = generationContext.getCommonTree().getToken().getText();
         /*
          * is there a suffix like "$" or "%" on this letters?
          */
         if (generationContext.getCommonTree().getChildCount() == 1) {
            letter += generationContext.getChildValue(0);
         }
         /*
          * push onto value stack
          */
         RTLHelper.push(generationContext, letter);
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
