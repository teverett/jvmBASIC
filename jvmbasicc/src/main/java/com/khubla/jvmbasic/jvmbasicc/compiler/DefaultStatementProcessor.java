package com.khubla.jvmbasic.jvmbasicc.compiler;

import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.Statement;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.StatementProcessor;

/**
 * @author tome
 */
public class DefaultStatementProcessor implements StatementProcessor {
   /**
    * the generation context
    */
   private final GenerationContext generationContext;

   /**
    * ctor
    */
   public DefaultStatementProcessor(GenerationContext generationContext) {
      this.generationContext = generationContext;
   }

   @Override
   public boolean processStatement(Statement statement) throws Exception {
      try {
         /*
          * first statement on the line?
          */
         if (0 == statement.getLineIndex()) {
            /*
             * make the label
             */
            generationContext.getMethodVisitor().visitLabel(statement.getLineDeclaration().getLabel());
            /*
             * save the line number
             */
            generationContext.getMethodVisitor().visitLineNumber(statement.getLineDeclaration().getBasicLine(), statement.getLineDeclaration().getLabel());
         }
         /*
          * process the statement
          */
         final GenerationContext subGenerationContext = new GenerationContext(generationContext, statement.getCommonTree(), statement.getLineDeclaration().getBasicLine());
         return Dispatcher.dispatch(subGenerationContext);
      } catch (final Exception e) {
         throw new Exception("Exception in processStatement", e);
      }
   }
}
