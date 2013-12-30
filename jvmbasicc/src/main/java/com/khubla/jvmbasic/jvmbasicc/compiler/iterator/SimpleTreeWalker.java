package com.khubla.jvmbasic.jvmbasicc.compiler.iterator;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

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
public class SimpleTreeWalker {
   public static void iterate(ParseTree parseTree, SimpleTreeWalkerCallback simpleTreeWalkerCallback) {
      iterate(parseTree, simpleTreeWalkerCallback, 0);
   }

   private static void iterate(ParseTree parseTree, SimpleTreeWalkerCallback tokenCallback, int ctxlevel) {
      for (int i = 0; i < parseTree.getChildCount(); i++) {
         final Object o = parseTree.getChild(i).getPayload();
         if (o.getClass() == CommonToken.class) {
            tokenCallback.token((CommonToken) o, ctxlevel);
         } else {
            tokenCallback.parserRule((ParserRuleContext) o, ctxlevel);
            iterate((ParseTree) o, tokenCallback, ctxlevel + 1);
         }
      }
   }
}
