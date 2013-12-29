package com.khubla.jvmbasic.jvmbasicc.compiler.analysis.datas;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.DatastmtContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.DatumContext;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.ProgContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.Analyser;
import com.khubla.jvmbasic.jvmbasicc.compiler.iterator.GenericContextIterator;
import com.khubla.jvmbasic.jvmbasicc.compiler.iterator.GenericContextIteratorCallback;

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
public class DatasDatabase implements Analyser, GenericContextIteratorCallback<DatastmtContext> {
   /**
    * logger
    */
   private static final Logger logger = LoggerFactory.getLogger(DatasDatabase.class);
   /**
    * DATA declarations
    */
   private String[] data;

   @Override
   public void analyse(ProgContext progContext) throws Exception {
      GenericContextIterator<DatastmtContext> genericContextIterator = new GenericContextIterator<DatastmtContext>(DatastmtContext.class);
      genericContextIterator.interate(progContext, this);
   }

   @Override
   public void dumpAnalysis() throws Exception {
      /*
       * walk the datums
       */
      logger.info("Datums");
      if (null != data) {
         for (final String datum : data) {
            logger.info(datum);
         }
      }
   }

   public String[] getData() {
      return data;
   }

   @Override
   public void context(DatastmtContext datastmtContext) {
      final List<String> dataValues = new ArrayList<String>();
      for (int j = 1; j < datastmtContext.getChildCount(); j = j + 2) {
         DatumContext datumContext = (DatumContext) datastmtContext.getChild(j);
         final String v = datumContext.getText();
         dataValues.add(v);
      }
      final String[] ret = new String[dataValues.size()];
      dataValues.toArray(ret);
      data = ret;
   }
}
