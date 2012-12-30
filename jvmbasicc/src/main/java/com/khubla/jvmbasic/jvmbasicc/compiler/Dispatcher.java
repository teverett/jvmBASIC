package com.khubla.jvmbasic.jvmbasicc.compiler;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
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
