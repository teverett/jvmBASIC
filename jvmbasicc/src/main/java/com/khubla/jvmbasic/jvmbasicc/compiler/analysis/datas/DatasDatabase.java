package com.khubla.jvmbasic.jvmbasicc.compiler.analysis.datas;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.DatastmtContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.ProgContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.Analyser;

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
public class DatasDatabase implements Analyser {
   /**
    * DATA declarations
    */
   private String[] data;

   @Override
   public void analyse(ProgContext progContext) throws Exception {
      processDATADeclarations(progContext);
   }

   @Override
   public void dumpAnalysis() throws Exception {
      // TODO Auto-generated method stub
   }

   public String[] getData() {
      return data;
   }

   /**
    * find all the DATA declarations
    */
   private void processDATADeclarations(ParseTree parseTree) throws Exception {
      try {
         for (int i = 0; i < parseTree.getChildCount(); i++) {
            final ParseTree subTree = parseTree.getChild(i);
            if (null != subTree) {
               final Object o = subTree.getPayload();
               if (o.getClass() == DatastmtContext.class) {
                  final List<String> dataValues = new ArrayList<String>();
                  for (int j = 0; j < subTree.getChildCount(); j += 2) {
                     final String v = subTree.getChild(j).getText();
                     dataValues.add(v);
                  }
                  final String[] ret = new String[dataValues.size()];
                  dataValues.toArray(ret);
                  data = ret;
               } else {
                  /*
                   * recurse
                   */
                  processDATADeclarations(subTree);
               }
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processDATADeclarations", e);
      }
   }
}
