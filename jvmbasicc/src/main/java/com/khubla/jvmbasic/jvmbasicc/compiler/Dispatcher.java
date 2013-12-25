package com.khubla.jvmbasic.jvmbasicc.compiler;

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
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;

import com.khubla.jvmbasic.jvmbasicc.function.Function;
import com.khubla.jvmbasic.jvmbasicc.function.FunctionRegistry;

/**
 * dispatcher
 */
public class Dispatcher {
   /**
    * dispatch
    */
   public static boolean dispatch(GenerationContext generationContext) throws Exception {
      try {
         if (null != generationContext.getParseTree()) {
            final Object o = generationContext.getParseTree().getPayload();
            if (o.getClass() == CommonToken.class) {
               final CommonToken commonToken = (CommonToken) o;
               final Function function = FunctionRegistry.getInstance().getTokenFunction(commonToken.getType());
               return function.execute(generationContext);
            } else {
               final ParserRuleContext parserRuleContext = (ParserRuleContext) o;
               final Function function = FunctionRegistry.getInstance().getRuleFunction(parserRuleContext.getRuleIndex());
               return function.execute(generationContext);
            }
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in dispatch at line " + generationContext.getLineNumber(), e);
      }
   }
}
