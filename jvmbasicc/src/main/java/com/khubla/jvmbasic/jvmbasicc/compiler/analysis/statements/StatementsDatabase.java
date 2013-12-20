package com.khubla.jvmbasic.jvmbasicc.compiler.analysis.statements;

import java.util.TreeMap;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.AmprstmtContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.ProgContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.Analyser;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.lines.LineDeclaration;
import com.khubla.jvmbasic.jvmbasicc.compiler.iterator.StatementIterator;
import com.khubla.jvmbasic.jvmbasicc.compiler.iterator.StatementIteratorCallback;

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
/**
 * @author tom
 */
public class StatementsDatabase implements Analyser, StatementIteratorCallback {
   /**
    * all lines
    */
   private final TreeMap<Integer, StatementDeclaration> statements = new TreeMap<Integer, StatementDeclaration>();

   @Override
   public void analyse(ProgContext progContext) throws Exception {
      final StatementIterator statementIterator = new StatementIterator();
      statementIterator.iterate(progContext, this);
   }

   public TreeMap<Integer, StatementDeclaration> getStatements() {
      return statements;
   }

   /**
    * show the static analysis
    */
   public void showAllStatements() throws Exception {
      try {
         /*
          * walk the statements
          */
         for (final StatementDeclaration statementDeclaration : statements.values()) {
            /*
             * show the statement
             */
            System.out.println("Line '" + statementDeclaration.getLineIndex() + " " + statementDeclaration.getAmprstmtContext().getText());
         }
      } catch (final Exception e) {
         throw new Exception("Exception in dumpStaticAnalysis", e);
      }
   }

   @Override
   public void statement(LineDeclaration lineDeclaration, AmprstmtContext amprstmtContext, int codeLine, int fileLine) {
      final StatementDeclaration statementDeclaration = new StatementDeclaration(amprstmtContext, codeLine, lineDeclaration);
      statements.put(codeLine, statementDeclaration);
   }
}
