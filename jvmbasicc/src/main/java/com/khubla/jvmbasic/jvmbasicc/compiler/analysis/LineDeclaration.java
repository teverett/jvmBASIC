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
