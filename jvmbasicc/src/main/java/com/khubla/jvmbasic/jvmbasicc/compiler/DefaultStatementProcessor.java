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
