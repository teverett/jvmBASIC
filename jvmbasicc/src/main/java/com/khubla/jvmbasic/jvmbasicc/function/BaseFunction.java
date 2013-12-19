package com.khubla.jvmbasic.jvmbasicc.function;

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
import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.Opcodes;

import com.khubla.jvmbasic.jvmbasicc.compiler.Dispatcher;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;

/**
 * @author tome
 */
public abstract class BaseFunction implements Function, Opcodes {
   /**
    * process a tree
    */
   protected void processTree(GenerationContext generationContext) throws Exception {
      try {
         final ParseTree ct = generationContext.getParseTree();
         if (ct != null) {
            if (ct.getChildCount() > 0) {
               for (int i = 0; i < ct.getChildCount(); i++) {
                  final ParseTree subTree = ct.getChild(i);
                  final GenerationContext subGenerationContext = new GenerationContext(generationContext, subTree);
                  Dispatcher.dispatch(subGenerationContext);
               }
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processTree", e);
      }
   }
}
