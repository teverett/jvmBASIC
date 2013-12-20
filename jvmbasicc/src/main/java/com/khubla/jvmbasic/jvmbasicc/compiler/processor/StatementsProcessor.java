package com.khubla.jvmbasic.jvmbasicc.compiler.processor;

import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.StaticAnalysis;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.lines.LineDeclaration;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.statements.StatementDeclaration;

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
public class StatementsProcessor {
   private final StaticAnalysis programStaticAnalysis;

   public StatementsProcessor(StaticAnalysis programStaticAnalysis) {
      this.programStaticAnalysis = programStaticAnalysis;
   }

   /**
    * iterate over all statements
    */
   public void process(StatementProcessor statementProcessor) throws Exception {
      try {
         /*
          * walk the statements
          */
         for (final StatementDeclaration statementDeclaration : programStaticAnalysis.getStatementsDatabase().getStatements().values()) {
            statementProcessor.processStatement(statementDeclaration);
         }
      } catch (final Exception e) {
         throw new Exception("Exception in process", e);
      }
   }

   /**
    * process from a specific line
    */
   public void ProcessFromLine(int lineNumber, StatementProcessor statementProcessor) throws Exception {
      try {
         /*
          * find the line
          */
         final LineDeclaration lineDeclaration = programStaticAnalysis.getLinesDatabase().getLine(lineNumber);
         while (null != lineDeclaration) {
            /*
             * walk the statements
             */
            // for (final Statement statement : lineDeclaration.getStatements()) {
            // if (false == statementProcessor.processStatement(statement)) {
            // return;
            // }
            // }
            // lineDeclaration = getLine(getNextLineNumber(lineDeclaration.getBasicLine()));
         }
      } catch (final Exception e) {
         throw new Exception("Exception in process", e);
      }
   }
}
