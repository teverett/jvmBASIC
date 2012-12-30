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
import org.antlr.runtime.Token;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;
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
         if (null != generationContext.getCommonTree()) {
            final Token token = generationContext.getCommonTree().getToken();
            final String tokenName = jvmBasicParser.tokenNames[token.getType()];
            final Function function = FunctionRegistry.getInstance().getFunction(tokenName);
            return function.execute(generationContext);
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in dispatch at line " + generationContext.getLineNumber(), e);
      }
   }
}
