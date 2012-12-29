package com.khubla.jvmbasic.jvmbasicc.function.impl;

import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 */
public class GOTOFunction extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * we expect a single argument, a line number
          */
         if (generationContext.getCommonTree().getChildCount() == 1) {
            /*
             * get the line number
             */
            final int lineNumber = Integer.parseInt(generationContext.getChildValue(0));
            /*
             * find the label for the line number
             */
            final Label label = GenerationContext.getProgramStaticAnalysis().getLine(lineNumber).getLabel();
            /*
             * check
             */
            if (null != label) {
               /*
                * generate the goto jmp to the label
                */
               generationContext.getMethodVisitor().visitJumpInsn(Opcodes.GOTO, label);
            } else {
               throw new Exception("Could not find label for BASIC line number '" + lineNumber + "'");
            }
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
