package com.khubla.jvmbasic.jvmbasicc.function;

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
