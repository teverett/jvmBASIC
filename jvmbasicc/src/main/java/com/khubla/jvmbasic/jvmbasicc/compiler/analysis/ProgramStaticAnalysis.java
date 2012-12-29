package com.khubla.jvmbasic.jvmbasicc.compiler.analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.antlr.runtime.tree.CommonTree;
import org.objectweb.asm.Label;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;

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
   private void addAllLines(CommonTree commonTree) throws Exception {
      try {
         if (commonTree.getChildCount() > 0) {
            for (int i = 0; i < commonTree.getChildCount(); i++) {
               final CommonTree subTree = (CommonTree) commonTree.getChild(i);
               final int basicLineNumber = Integer.parseInt(subTree.getText());
               int codeLineNumber = 0;
               if (null != subTree.token) {
                  codeLineNumber = subTree.token.getLine();
               }
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
               System.out.println("     Statement: '" + statement.getLineIndex() + "' " + statement.getCommonTree().getText());
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
   public void performStaticAnalysis(CommonTree commonTree) throws Exception {
      try {
         /*
          * firstly add all lines and produce ASM labels for every line
          */
         addAllLines(commonTree);
         /*
          * process the DATA declarations
          */
         processDATADeclarations(commonTree);
         /*
          * process every line
          */
         if (commonTree.getChildCount() > 0) {
            for (int i = 0; i < commonTree.getChildCount(); i++) {
               final CommonTree subTree = (CommonTree) commonTree.getChild(i);
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
   private void processDATADeclarations(CommonTree commonTree) throws Exception {
      try {
         for (int i = 0; i < commonTree.getChildCount(); i++) {
            final CommonTree subTree = (CommonTree) commonTree.getChild(i);
            if (null != subTree) {
               if (jvmBasicParser.DATA == subTree.getType()) {
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
   private void processLine(CommonTree commonTree) throws Exception {
      try {
         /*
          * check that there's a line number
          */
         if (commonTree.getToken().getType() == jvmBasicParser.NUMBER) {
            /*
             * the line number of the basic program
             */
            final int basicLineNumber = Integer.parseInt(commonTree.getText());
            /*
             * get the line for this line number and do the visit
             */
            final LineDeclaration lineDeclaration = getLine(basicLineNumber);
            if (null != lineDeclaration) {
               /*
                * its possible that there are more than 1 children, for example in cases where colons have been used to put multiple statements on a line.
                */
               for (int i = 0; i < commonTree.getChildCount(); i++) {
                  /*
                   * parse the sub tree
                   */
                  final CommonTree subTree = (CommonTree) commonTree.getChild(i);
                  /*
                   * create statement
                   */
                  final Statement statement = new Statement(subTree, i, lineDeclaration);
                  /*
                   * add to the line
                   */
                  lineDeclaration.addStatement(statement);
               }
            } else {
               throw new Exception("Could not find label for line number '" + basicLineNumber + "'");
            }
         } else {
            throw new Exception("Expected line number");
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processLine", e);
      }
   }
}
