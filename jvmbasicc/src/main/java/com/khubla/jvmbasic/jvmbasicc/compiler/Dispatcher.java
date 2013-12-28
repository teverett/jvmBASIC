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
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;
import com.khubla.jvmbasic.jvmbasicc.function.Function;
import com.khubla.jvmbasic.jvmbasicc.function.FunctionRegistry;

/**
 * dispatcher
 */
public class Dispatcher {
   /**
    * logger
    */
   private static final Logger logger = LoggerFactory.getLogger(Dispatcher.class);

   /**
    * dispatch
    */
   public static boolean dispatch(GenerationContext generationContext) throws Exception {
      try {
         if (null != generationContext.getParseTree()) {
            final Object o = generationContext.getParseTree().getPayload();
            if (o.getClass() == CommonToken.class) {
               final CommonToken commonToken = (CommonToken) o;
               final Function function = FunctionRegistry.getInstance().getTokenFunction(commonToken.getType());
               logger.info("Dispatching to '" + function.getClass().getSimpleName() + "' for token '" + jvmBasicParser.tokenNames[commonToken.getType()] + "'");
               return function.execute(generationContext);
            } else {
               final ParserRuleContext parserRuleContext = (ParserRuleContext) o;
               final Function function = FunctionRegistry.getInstance().getRuleFunction(parserRuleContext.getRuleIndex());
               logger.info("Dispatching to '" + function.getClass().getSimpleName() + "' for rule '" + jvmBasicParser.ruleNames[parserRuleContext.getRuleIndex()] + "'");
               return function.execute(generationContext);
            }
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in dispatch at line " + generationContext.getLineNumber(), e);
      }
   }

   /**
    * dispatch to all children of the current context
    */
   public static boolean dispatchChildren(GenerationContext generationContext) throws Exception {
      try {
         if (null != generationContext.getParseTree()) {
            for (int i = 0; i < generationContext.getParseTree().getChildCount(); i++) {
               final ParseTree parseTree = generationContext.getParseTree().getChild(i);
               final GenerationContext childGenerationContext = new GenerationContext(generationContext, parseTree);
               // final DefaultStatementProcessor defaultStatementProcessor = new DefaultStatementProcessor(childGenerationContext);
               // final StatementsProcessor statementsProcessor = new StatementsProcessor(GenerationContext.getProgramStaticAnalysis());
               // statementsProcessor.process(defaultStatementProcessor);
               try {
                  Dispatcher.dispatch(childGenerationContext);
               } catch (final Exception e) {
                  throw new Exception("Exception in dispatchChildren at line " + childGenerationContext.getLineNumber(), e);
               }
            }
         }
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in dispatchChildren", e);
      }
   }
}
