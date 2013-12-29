package com.khubla.jvmbasic.jvmbasicc.function.impl.rule;

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
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.VardeclContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.GenerationContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.RTLHelper;
import com.khubla.jvmbasic.jvmbasicc.function.BaseFunction;
import com.khubla.jvmbasic.jvmbasicc.util.VariableNameUtil;

/**
 * @author tome
 */
public class vardeclRule extends BaseFunction {
   @Override
   public boolean execute(GenerationContext generationContext) throws Exception {
      try {
         /*
          * get the name, which consists of a varname node and optionally a varsuffix such as "$" or "%"
          */
         final VardeclContext vardeclContext = (VardeclContext) generationContext.getParseTree();
         final String varName = VariableNameUtil.getVariableName(vardeclContext);
         /*
          * push it
          */
         RTLHelper.push(generationContext, varName);
         /*
          * keep going, without recursing down
          */
         return true;
      } catch (final Exception e) {
         throw new Exception("Exception in execute", e);
      }
   }
}
