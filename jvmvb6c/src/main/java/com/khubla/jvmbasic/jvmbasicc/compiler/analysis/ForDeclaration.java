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
