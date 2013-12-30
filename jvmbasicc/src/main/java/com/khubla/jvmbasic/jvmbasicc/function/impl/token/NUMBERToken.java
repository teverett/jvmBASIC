package com.khubla.jvmbasic.jvmbasicc.function.impl.token;

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
import org.antlr.v4.runtime.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 */
public class NUMBERToken extends BaseFunction {
   /**
    * logger
    */
   private static final Logger logger = LoggerFactory.getLogger(NUMBERToken.class);

   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * num
          */
         final Token token = (Token) generationContext.getParseTree().getPayload();
         final String num = token.getText();
         /*
          * found number
          */
         logger.info("Found number '" + num + "'");
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
