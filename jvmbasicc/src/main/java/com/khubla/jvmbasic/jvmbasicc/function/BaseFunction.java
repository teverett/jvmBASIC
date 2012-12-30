package com.khubla.jvmbasic.jvmbasicc.function;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
import org.antlr.runtime.tree.CommonTree;
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
         final CommonTree ct = generationContext.getCommonTree();
         if (ct != null) {
            if (ct.getChildCount() > 0) {
               for (int i = 0; i < ct.getChildCount(); i++) {
                  final CommonTree subTree = (CommonTree) ct.getChild(i);
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
