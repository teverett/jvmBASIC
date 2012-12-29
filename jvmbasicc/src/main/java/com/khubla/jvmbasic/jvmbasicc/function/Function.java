package com.khubla.jvmbasic.jvmbasicc.function;

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;

/**
 * @author tome
 */
public interface Function {
   /**
    * return true to continue execution, false to end
    */
   boolean execute(GenerationContext generationContext) throws Exception;
}
