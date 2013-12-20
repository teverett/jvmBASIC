package com.khubla.jvmbasic.jvmbasicc.compiler.analysis.lines;

import java.util.TreeMap;

import org.objectweb.asm.Label;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LineContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LinenumberContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.ProgContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.Analyser;
import com.khubla.jvmbasic.jvmbasicc.compiler.iterator.LineIterator;
import com.khubla.jvmbasic.jvmbasicc.compiler.iterator.LineIteratorCallback;

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
public class LinesDatabase implements LineIteratorCallback, Analyser {
   /**
    * all lines
    */
   private final TreeMap<Integer, LineDeclaration> lines = new TreeMap<Integer, LineDeclaration>();

   /**
    * add a label
    */
   private LineDeclaration addLine(LineContext lineContext, int codeLine, int basicLine) {
      if (null == getLine(basicLine)) {
         final LineDeclaration lineDeclaration = new LineDeclaration(lineContext, codeLine, basicLine, new Label());
         lines.put(basicLine, lineDeclaration);
         return lineDeclaration;
      } else {
         return null;
      }
   }

   @Override
   public void analyse(ProgContext progContext) throws Exception {
      LineIterator.iterate(progContext, this);
   }

   @Override
   public void dumpAnalysis() throws Exception {
      for (final LineDeclaration lineDeclaraction : lines.values()) {
         System.out.println("[" + lineDeclaraction.getCodeLine() + ":" + lineDeclaraction.getBasicLine() + "] " + lineDeclaraction.getLineContext().getText());
      }
   }

   /**
    * get line
    */
   public LineDeclaration getLine(int lineNumber) {
      return lines.get(lineNumber);
   }

   /**
    * get next line number
    */
   public int getNextLineNumber(int lineNumber) {
      return lines.higherKey(lineNumber);
   }

   @Override
   public void line(LineContext lineContext) {
      final LinenumberContext linenumberContext = (LinenumberContext) lineContext.getChild(0);
      final int basicLineNumber = Integer.parseInt(linenumberContext.getText());
      final int codeLineNumber = lineContext.start.getLine();
      addLine(lineContext, codeLineNumber, basicLineNumber);
   }
}
