package com.khubla.jvmbasic.jvmbasicc.compiler.analysis;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
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
