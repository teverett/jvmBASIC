package com.khubla.jvmbasic.jvmbasicc.compiler.analysis.lines;

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

import com.khubla.jvmbasic.jvmbasicc.antlr.VisualBasic6Parser.LineLabelContext;//.jvmBasicParser.LineContext;

/**
 * @author tome
 */
public class LineDeclaration {
   /**
    * code line
    */
   private final int codeLine;
   /**
    * basic line
    */
   private final int basicLine;
   /**
    * label
    */
   private final Label label;
   /**
    * LineContext
    */
   private final LineLabelContext lineContext;

   /**
    * ctor
    */
   public LineDeclaration(LineLabelContext lineContext, int codeLine, int basicLine, Label label) {
      this.codeLine = codeLine;
      this.basicLine = basicLine;
      this.label = label;
      this.lineContext = lineContext;
   }

   public int getBasicLine() {
      return basicLine;
   }

   public int getCodeLine() {
      return codeLine;
   }

   public Label getLabel() {
      return label;
   }

   public LineLabelContext getLineContext() {
      return lineContext;
   }
}
