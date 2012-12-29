package com.khubla.jvmbasic.jvmbasicc.compiler.analysis;

/**
 * @author tome
 */
public class ForDeclaration {
   private final String basicVariableName;
   private final int fromLocalVariableIndex;
   private final int toLocalVariableIndex;
   private final int stepLocalVariableIndex;
   private final int counterLocalVariableIndex;
   /**
    * basic line number that the loop is declared on
    */
   private final int lineNumber;

   public ForDeclaration(String basicVariableName, int fromLocalVariableIndex, int toLocalVariableIndex, int stepLocalVariableIndex, int counterLocalVariableIndex, int lineNumber) {
      this.basicVariableName = basicVariableName;
      this.fromLocalVariableIndex = fromLocalVariableIndex;
      this.toLocalVariableIndex = toLocalVariableIndex;
      this.stepLocalVariableIndex = stepLocalVariableIndex;
      this.lineNumber = lineNumber;
      this.counterLocalVariableIndex = counterLocalVariableIndex;
   }

   public String getBasicVariableName() {
      return basicVariableName;
   }

   public int getCounterLocalVariableIndex() {
      return counterLocalVariableIndex;
   }

   public int getFromLocalVariableIndex() {
      return fromLocalVariableIndex;
   }

   public int getLineNumber() {
      return lineNumber;
   }

   public int getStepLocalVariableIndex() {
      return stepLocalVariableIndex;
   }

   public int getToLocalVariableIndex() {
      return toLocalVariableIndex;
   }
}
