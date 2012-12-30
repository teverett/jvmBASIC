package com.khubla.jvmbasic.jvmbasicc.compiler;

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
