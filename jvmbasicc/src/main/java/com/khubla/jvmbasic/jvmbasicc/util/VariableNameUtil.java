package com.khubla.jvmbasic.jvmbasicc.util;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.VardeclContext;

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
 * @author tom
 */
public class VariableNameUtil {
   /**
    * get a variable name from the VardeclContext. The grammar looks like this "var: varname varsuffix?;"
    */
   public static String getVariableName(VardeclContext vardeclContext) {
      /*
       * get the name, which consists of a varname node and optionally a varsuffix such as "$" or "%"
       */
      String varName = vardeclContext.getChild(0).getText();
      if (vardeclContext.getChildCount() == 2) {
         varName += vardeclContext.getChild(1).getText();
      }
      return varName;
   }
}
