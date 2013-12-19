package com.khubla.jvmbasic.jvmbasicc.compiler;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
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
import org.antlr.v4.runtime.tree.ParseTree;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;

public class TreePrinter {
   /**
    * indent level
    */
   private static final int INDENT_LEVEL = 2;

   /**
    * print a parse tree to the console
    */
   public static void printTree(ParseTree t) {
      printTree(t, INDENT_LEVEL);
   }

   /**
    * print a parse tree to the console
    */
   private static void printTree(ParseTree t, int indent) {
      if (t != null) {
         StringBuffer sb = new StringBuffer(indent);
         for (int i = 0; i < indent; i++) {
            sb = sb.append(" ");
         }
         for (int i = 0; i < t.getChildCount(); i++) {
            ParseTree childTree = t.getChild(i);
            Object o = childTree.getPayload();
            if (o.getClass() == CommonToken.class) {
               CommonToken commonToken = (CommonToken) o;
               if (commonToken.getType() != -1) {
                  System.out.println(sb.toString() + "[" + commonToken.getType() + " " + jvmBasicParser.tokenNames[commonToken.getType()] + "] " + childTree.getText());
               }
            } else {
               ParserRuleContext parserRuleContext = (ParserRuleContext) o;
               System.out.println(sb.toString() + "[" + parserRuleContext.getRuleIndex() + " " + jvmBasicParser.ruleNames[parserRuleContext.getRuleIndex()] + "]");
               /*
                * recurse
                */
               printTree(childTree, indent + 1);
            }
         }
      }
   }
}
