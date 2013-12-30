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
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser.ProgContext;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.datas.DatasDatabase;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.lines.LinesDatabase;
import com.khubla.jvmbasic.jvmbasicc.compiler.analysis.statements.StatementsDatabase;

/**
 * @author tome
 */
public class StaticAnalysis {
   private final DatasDatabase datasDatabase = new DatasDatabase();
   private final LinesDatabase linesDatabase = new LinesDatabase();
   private final StatementsDatabase statementsDatabase = new StatementsDatabase(linesDatabase);
   private final Analyser[] analysers = { datasDatabase, linesDatabase, statementsDatabase };

   public DatasDatabase getDatasDatabase() {
      return datasDatabase;
   }

   public LinesDatabase getLinesDatabase() {
      return linesDatabase;
   }

   public StatementsDatabase getStatementsDatabase() {
      return statementsDatabase;
   }

   /**
    * statically analyse the program
    */
   public void performStaticAnalysis(ProgContext progContext) throws Exception {
      try {
         for (int i = 0; i < analysers.length; i++) {
            analysers[i].analyse(progContext);
         }
      } catch (final Exception e) {
         throw new Exception("Exception in performStaticAnalysis", e);
      }
   }

   /**
    * show analysis results
    */
   public void showAnalysisResults() throws Exception {
      try {
         for (int i = 0; i < analysers.length; i++) {
            analysers[i].dumpAnalysis();
         }
      } catch (final Exception e) {
         throw new Exception("Exception in showAnalysisResults", e);
      }
   }
}
