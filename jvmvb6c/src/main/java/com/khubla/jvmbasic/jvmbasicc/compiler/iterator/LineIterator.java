package com.khubla.jvmbasic.jvmbasicc.compiler.iterator;

import org.antlr.v4.runtime.tree.ParseTree;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LineContext;

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
public class LineIterator {
   public static void iterate(ParseTree parseTree, LineIteratorCallback lineIteratorCallback) {
      for (int i = 0; i < parseTree.getChildCount(); i++) {
         final Object o = parseTree.getChild(i).getPayload();
         if (o.getClass() == LineContext.class) {
            lineIteratorCallback.line((LineContext) o);
         }
      }
   }
}