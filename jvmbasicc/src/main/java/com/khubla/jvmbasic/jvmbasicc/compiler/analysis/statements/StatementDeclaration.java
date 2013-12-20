package com.khubla.jvmbasic.jvmbasicc.compiler.analysis.statements;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.AmprstmtContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.lines.LineDeclaration;

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
 * @author tome
 */
public class StatementDeclaration {
   /**
    * AmprstmtContext
    */
   private final AmprstmtContext amprstmtContext;
   /**
    * line index
    */
   private final int lineIndex;
   /**
    * the line
    */
   private final LineDeclaration lineDeclaration;

   /**
    * ctor
    */
   public StatementDeclaration(AmprstmtContext amprstmtContext, int lineIndex, LineDeclaration lineDeclaration) {
      this.amprstmtContext = amprstmtContext;
      this.lineIndex = lineIndex;
      this.lineDeclaration = lineDeclaration;
   }

   public AmprstmtContext getAmprstmtContext() {
      return amprstmtContext;
   }

   public LineDeclaration getLineDeclaration() {
      return lineDeclaration;
   }

   public int getLineIndex() {
      return lineIndex;
   }
}
