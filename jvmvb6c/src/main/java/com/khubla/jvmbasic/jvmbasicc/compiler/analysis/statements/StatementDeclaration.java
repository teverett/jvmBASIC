package com.khubla.jvmbasic.jvmbasicc.compiler.analysis.statements;

import com.khubla.jvmbasic.jvmbasicc.antlr.VisualBasic6Parser.StartRuleContext;
//.AppactivateStmtContext;
//.AmprstmtContext;
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
   private final StartRuleContext amprstmtContext;
   /**
    * line index. Index on the line of this statement. A single statement line will have this zero
    */
   private final int lineIndex;
   /**
    * the line. the Line that this statement is on
    */
   private final LineDeclaration lineDeclaration;

   /**
    * ctor
    */
   public StatementDeclaration(StartRuleContext amprstmtContext, int lineIndex, LineDeclaration lineDeclaration) {
      this.amprstmtContext = amprstmtContext;
      this.lineIndex = lineIndex;
      this.lineDeclaration = lineDeclaration;
   }

   public StartRuleContext getAmprstmtContext() {
      return amprstmtContext;
   }

   public LineDeclaration getLineDeclaration() {
      return lineDeclaration;
   }

   public int getLineIndex() {
      return lineIndex;
   }
}
