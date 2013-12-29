package com.khubla.jvmbasic.jvmbasicc.compiler.iterator;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.AmprstmtContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LineContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LinenumberContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.lines.LineDeclaration;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.lines.LinesDatabase;

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
public class StatementIterator implements LineIteratorCallback {
   private final LinesDatabase linesDatabase;
   private StatementIteratorCallback statementIteratorCallback;

   public StatementIterator(LinesDatabase linesDatabase) {
      this.linesDatabase = linesDatabase;
   }

   public void iterate(ParseTree parseTree, StatementIteratorCallback statementIteratorCallback) {
      this.statementIteratorCallback = statementIteratorCallback;
      LineIterator.iterate(parseTree, this);
   }

   @Override
   public void line(LineContext lineContext) {
      final ParseTree subTree = lineContext.getChild(0);
      if (subTree.getClass() != TerminalNodeImpl.class) {
         final LinenumberContext linenumberContext = (LinenumberContext) lineContext.getChild(0);
         final int basicLineNumber = Integer.parseInt(linenumberContext.getText());
         lineContext.start.getLine();
         int lineIndex = 0;
         for (int i = 0; i < lineContext.getChildCount(); i++) {
            /*
             * parse the sub tree
             */
            final ParseTree subTree2 = lineContext.getChild(i);
            /*
             * check
             */
            if (subTree2.getClass() == AmprstmtContext.class) {
               /*
                * get the line declaration
                */
               final LineDeclaration lineDeclaration = linesDatabase.getLine(basicLineNumber);
               /*
                * Line declaration
                */
               statementIteratorCallback.statement(lineDeclaration, (AmprstmtContext) subTree2, lineIndex);
               /*
                * next statement on the line
                */
               lineIndex++;
            }
         }
      }
   }
}