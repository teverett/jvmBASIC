package com.khubla.jvmbasic.jvmbasicc.function.impl.rule;

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
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;

import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;

/**
 * @author tome
 */
public class gotostmtRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * we expect 2 arguments
          */
         if (generationContext.getParseTree().getChildCount() == 2) {
            /*
             * get the line number
             */
            final int lineNumber = Integer.parseInt(generationContext.getChildValue(1));
            /*
             * find the label for the line number
             */
            final Label label = GenerationContext.getProgramStaticAnalysis().getLinesDatabase().getLine(lineNumber).getLabel();
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
