package com.khubla.jvmbasic.jvmbasicc.compiler.analysis;

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
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.objectweb.asm.Label;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.AmprstmtContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.DatastmtContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LineContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.LinenumberContext;

/**
 * @author tome
 */
public class ProgramStaticAnalysis {
   /**
    * DATA declarations
    */
   private String[] data;
   /**
    * all lines
    */
   private final TreeMap<Integer, LineDeclaration> lines = new TreeMap<Integer, LineDeclaration>();

   /**
    * find all the line numbers and produce labels for them. This is for GOTO, GOSUB etc.
    */
   private void addAllLines(Tree commonTree) throws Exception {
      try {
         if (commonTree.getChildCount() > 0) {
            for (int i = 0; i < commonTree.getChildCount(); i++) {
               final LineContext lineContext = (LineContext) commonTree.getChild(i);
               final LinenumberContext linenumberContext = (LinenumberContext) lineContext.getChild(0);
               final int basicLineNumber = Integer.parseInt(linenumberContext.getText());
               final int codeLineNumber = lineContext.start.getLine();
               addLine(codeLineNumber, basicLineNumber, new Label());
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in labelAllLines", e);
      }
   }

   /**
    * add a label
    */
   private LineDeclaration addLine(int codeLine, int basicLine, Label label) throws Exception {
      if (null == getLine(basicLine)) {
         final LineDeclaration lineDeclaration = new LineDeclaration(codeLine, basicLine, label);
         lines.put(basicLine, lineDeclaration);
         return lineDeclaration;
      } else {
         throw new Exception("There is already a line number for line '" + basicLine + "'.  Does that line number exist twice in the program?");
      }
   }

   /**
    * show the static analysis
    */
   public void dumpStaticAnalysis() throws Exception {
      try {
         /*
          * walk the lines
          */
         for (final LineDeclaration lineDeclaration : lines.values()) {
            /*
             * show the line
             */
            System.out.println("BASIC line '" + lineDeclaration.getBasicLine() + "' on input line '" + lineDeclaration.getCodeLine() + "'");
            /*
             * walk the statements
             */
            for (final Statement statement : lineDeclaration.getStatements()) {
               /*
                * show the statement
                */
               System.out.println("     Statement: '" + statement.getLineIndex() + "' " + statement.getAmprstmtContext().getText());
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in dumpStaticAnalysis", e);
      }
   }

   public String[] getData() {
      return data;
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

   /**
    * iterate over all statements
    */
   public void iterate(StatementProcessor statementProcessor) throws Exception {
      try {
         /*
          * walk the lines
          */
         for (final LineDeclaration lineDeclaration : lines.values()) {
            /*
             * walk the statements
             */
            for (final Statement statement : lineDeclaration.getStatements()) {
               if (false == statementProcessor.processStatement(statement)) {
                  return;
               }
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in iterate", e);
      }
   }

   /**
    * iterate from a specific line
    */
   public void iterateFromLine(int lineNumber, StatementProcessor statementProcessor) throws Exception {
      try {
         /*
          * find the line
          */
         LineDeclaration lineDeclaration = getLine(lineNumber);
         while (null != lineDeclaration) {
            /*
             * walk the statements
             */
            for (final Statement statement : lineDeclaration.getStatements()) {
               if (false == statementProcessor.processStatement(statement)) {
                  return;
               }
            }
            lineDeclaration = getLine(getNextLineNumber(lineDeclaration.getBasicLine()));
         }
      } catch (final Exception e) {
         throw new Exception("Exception in iterate", e);
      }
   }

   /**
    * statically analyse the program
    */
   public void performStaticAnalysis(ParseTree parseTree) throws Exception {
      try {
         /*
          * firstly add all lines and produce ASM labels for every line
          */
         addAllLines(parseTree);
         /*
          * process the DATA declarations
          */
         processDATADeclarations(parseTree);
         /*
          * process every line
          */
         if (parseTree.getChildCount() > 0) {
            for (int i = 0; i < parseTree.getChildCount(); i++) {
               final ParseTree subTree = parseTree.getChild(i);
               processLine(subTree);
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in performStaticAnalysis", e);
      }
   }

   /**
    * find all the DATA declarations
    */
   private void processDATADeclarations(ParseTree parseTree) throws Exception {
      try {
         for (int i = 0; i < parseTree.getChildCount(); i++) {
            final ParseTree subTree = parseTree.getChild(i);
            if (null != subTree) {
               final Object o = subTree.getPayload();
               if (o.getClass() == DatastmtContext.class) {
                  final List<String> dataValues = new ArrayList<String>();
                  for (int j = 0; j < subTree.getChildCount(); j += 2) {
                     final String v = subTree.getChild(j).getText();
                     dataValues.add(v);
                  }
                  final String[] ret = new String[dataValues.size()];
                  dataValues.toArray(ret);
                  data = ret;
               } else {
                  /*
                   * recurse
                   */
                  processDATADeclarations(subTree);
               }
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processDATADeclarations", e);
      }
   }

   /**
    * process a single line of BASIC code
    */
   private void processLine(ParseTree parseTree) throws Exception {
      try {
         /*
          * check that there's a line number
          */
         final LineContext lineContext = (LineContext) parseTree.getPayload();
         /*
          * the line number of the basic program
          */
         final LinenumberContext linenumberContext = (LinenumberContext) lineContext.getChild(0);
         final int basicLineNumber = Integer.parseInt(linenumberContext.getText());
         /*
          * get the line for this line number and do the visit
          */
         final LineDeclaration lineDeclaration = getLine(basicLineNumber);
         if (null != lineDeclaration) {
            /*
             * its possible that there are more than 1 children, for example in cases where colons have been used to put multiple statements on a line.
             */
            for (int i = 0; i < parseTree.getChildCount(); i++) {
               /*
                * parse the sub tree
                */
               final ParseTree subTree = parseTree.getChild(i);
               /*
                * check
                */
               if (subTree.getClass() == AmprstmtContext.class) {
                  /*
                   * create statement
                   */
                  final Statement statement = new Statement((AmprstmtContext) subTree, i, lineDeclaration);
                  /*
                   * add to the line
                   */
                  lineDeclaration.addStatement(statement);
               }
            }
         } else {
            throw new Exception("Could not find label for line number '" + basicLineNumber + "'");
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processLine", e);
      }
   }
}
