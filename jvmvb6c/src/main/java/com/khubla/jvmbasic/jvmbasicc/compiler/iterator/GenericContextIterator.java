package com.khubla.jvmbasic.jvmbasicc.compiler.iterator;

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
public class GenericContextIterator<T> {
   private final Class<?> clazz;

   public GenericContextIterator(Class<?> clazz) {
      this.clazz = clazz;
   }

   @SuppressWarnings("unchecked")
   public void interate(ParseTree parseTree, GenericContextIteratorCallback<T> genericContextIteratorCallback) throws Exception {
      try {
         for (int i = 0; i < parseTree.getChildCount(); i++) {
            final ParseTree subTree = parseTree.getChild(i);
            if (null != subTree) {
               final Object o = subTree.getPayload();
               if (o.getClass() == clazz) {
                  genericContextIteratorCallback.context((T) o);
               } else {
                  /*
                   * recurse
                   */
                  interate(subTree, genericContextIteratorCallback);
               }
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processDATADeclarations", e);
      }
   }
}
