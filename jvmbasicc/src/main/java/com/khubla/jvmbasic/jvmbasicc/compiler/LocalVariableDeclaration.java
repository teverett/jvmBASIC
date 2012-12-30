package com.khubla.jvmbasic.jvmbasicc.compiler;

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
public class LocalVariableDeclaration {
   /**
    * the BASIC line it's declared on
    */
   private final int basicLine;
   /**
    * the name
    */
   private final String name;
   /**
    * the index
    */
   private final int index;

   /**
    * ctor
    */
   public LocalVariableDeclaration(int basicLine, String name, int index) {
      this.basicLine = basicLine;
      this.name = name;
      this.index = index;
   }

   public int getBasicLine() {
      return basicLine;
   }

   public int getIndex() {
      return index;
   }

   public String getName() {
      return name;
   }
}
