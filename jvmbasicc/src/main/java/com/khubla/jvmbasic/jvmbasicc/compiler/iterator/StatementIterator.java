package com.khubla.jvmbasic.jvmbasicc.compiler.iterator;

import org.antlr.v4.runtime.tree.ParseTree;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.AmprstmtContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LineContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LinenumberContext;

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
   private StatementIteratorCallback statementIteratorCallback;

   public void iterate(ParseTree parseTree, StatementIteratorCallback statementIteratorCallback) {
      LineIterator.iterate(parseTree, this);
   }

   @Override
   public void line(LineContext lineContext) {
      final LinenumberContext linenumberContext = (LinenumberContext) lineContext.getChild(0);
      final int basicLineNumber = Integer.parseInt(linenumberContext.getText());
      final int codeLineNumber = lineContext.start.getLine();
      for (int i = 0; i < lineContext.getChildCount(); i++) {
         /*
          * parse the sub tree
          */
         final ParseTree subTree = lineContext.getChild(i);
         /*
          * check
          */
         if (subTree.getClass() == AmprstmtContext.class) {
            statementIteratorCallback.line(lineContext, (AmprstmtContext) subTree, basicLineNumber, codeLineNumber);
         }
      }
   }
}