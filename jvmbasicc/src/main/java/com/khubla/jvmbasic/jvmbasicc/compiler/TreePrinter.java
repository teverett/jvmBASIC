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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;
import com.khubla.jvmbasic.jvmbasicc.compiler.iterator.SimpleTreeWalker;
import com.khubla.jvmbasic.jvmbasicc.compiler.iterator.SimpleTreeWalkerCallback;

/**
 * @author tom
 */
public class TreePrinter implements SimpleTreeWalkerCallback {
   /**
    * logger
    */
   private static final Logger logger = LoggerFactory.getLogger(TreePrinter.class);

   private String indentString(int ctxlevel) {
      StringBuffer sb = new StringBuffer(ctxlevel);
      for (int i = 0; i < ctxlevel; i++) {
         sb = sb.append(" ");
      }
      return sb.toString();
   }

   @Override
   public void parserRule(ParserRuleContext parserRuleContext, int ctxlevel) {
      logger.info(indentString(ctxlevel) + "[" + parserRuleContext.getRuleIndex() + " " + jvmBasicParser.ruleNames[parserRuleContext.getRuleIndex()] + "]");
   }

   /**
    * print a parse tree to the console
    */
   public void printTree(ParseTree t) {
      SimpleTreeWalker.iterate(t, this);
   }

   @Override
   public void token(CommonToken commonToken, int ctxlevel) {
      if (commonToken.getType() != -1) {
         logger.info(indentString(ctxlevel) + "[" + commonToken.getType() + " " + jvmBasicParser.VOCABULARY.getDisplayName(commonToken.getType()) + "] " + commonToken.getText());
      }
   }
}
