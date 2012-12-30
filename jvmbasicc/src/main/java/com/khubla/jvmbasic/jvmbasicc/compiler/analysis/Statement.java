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
import org.antlr.runtime.tree.CommonTree;

/**
 * @author tome
 */
public class Statement {
   /**
    * commontree
    */
   private final CommonTree commonTree;
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
   public Statement(CommonTree commonTree, int lineIndex, LineDeclaration lineDeclaration) {
      this.commonTree = commonTree;
      this.lineIndex = lineIndex;
      this.lineDeclaration = lineDeclaration;
   }

   public CommonTree getCommonTree() {
      return commonTree;
   }

   public LineDeclaration getLineDeclaration() {
      return lineDeclaration;
   }

   public int getLineIndex() {
      return lineIndex;
   }
}
