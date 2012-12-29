package com.khubla.jvmbasic.jvmbasicc.compiler;

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
