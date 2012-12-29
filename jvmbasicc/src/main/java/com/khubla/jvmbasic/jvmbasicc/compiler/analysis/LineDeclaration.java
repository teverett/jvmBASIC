package com.khubla.jvmbasic.jvmbasicc.compiler.analysis;

import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.Label;

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
    * statements
    */
   private final List<Statement> statements = new ArrayList<Statement>();

   /**
    * ctor
    */
   public LineDeclaration(int codeLine, int basicLine, Label label) {
      this.codeLine = codeLine;
      this.basicLine = basicLine;
      this.label = label;
   }

   public void addStatement(Statement statement) {
      statements.add(statement);
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

   public List<Statement> getStatements() {
      return statements;
   }
}
