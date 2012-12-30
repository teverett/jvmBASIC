package com.khubla.jvmbasic.jvmbasicc.function.impl;

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
