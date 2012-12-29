package com.khubla.jvmbasic.jvmbasicc.function.impl;

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 */
public class NUMBERFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * num
          */
         final String num = generationContext.getCommonTree().getToken().getText();
         /*
          * check for decimal
          */
         if (-1 != num.indexOf('.')) {
            /*
             * push the double
             */
            final double value = Double.parseDouble(num);
            RTLHelper.push(generationContext, value);
         } else {
            /*
             * push the int
             */
            final int value = Integer.parseInt(num);
            RTLHelper.push(generationContext, value);
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
