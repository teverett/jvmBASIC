package com.khubla.jvmbasic.jvmbasicc.compiler.analysis;

/**
 * @author tome
 */
public interface StatementProcessor {
   /**
    * return true if continue to iterate, false otherwise
    */
   boolean processStatement(Statement statement) throws Exception;
}
