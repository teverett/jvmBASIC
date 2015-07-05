package test.com.khubla.jvmbasic.jvmbasicc.antlr;

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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;
import com.khubla.jvmbasic.jvmbasicc.compiler.TreePrinter;
import com.khubla.jvmbasic.jvmbasicc.util.FilenameUtil;
import com.khubla.jvmbasic.jvmbasicc.util.TestUtil;

/**
 * @author tom
 */
public class TestParserLexer {
   /**
    * root
    */
   private static final String BASROOT = "src/test/resources/bas/";
   /**
    * parse tree dir
    */
   private static final String TESTOUTPUT = "jvmbasic-test-output/";

   @BeforeTest
   public void setup() {
      new File(TESTOUTPUT).mkdirs();
   }

   @Test
   public void test1() {
      try {
         final List<String> testFiles = TestUtil.getTestFiles(BASROOT);
         int failures = 0;
         System.out.println("Found " + testFiles.size() + " test files");
         for (int i = 0; i < testFiles.size(); i++) {
            final String filename = testFiles.get(i);
            final InputStream inputStream = new FileInputStream(filename);
            if (null != inputStream) {
               System.out.println("Parsing: " + filename);
               try {
                  final ParseTree parseTree = JVMBasicCompiler.parse(inputStream);
                  FileOutputStream fos = new FileOutputStream(TESTOUTPUT + FilenameUtil.astFileNameFromClassName(FilenameUtil.classNameFromFileName(filename)));
                  final TreePrinter treePrinter = new TreePrinter(fos);
                  treePrinter.printTree(parseTree);
               } catch (final Exception e) {
                  failures++;
                  e.printStackTrace();
               }
            }
         }
         /*
          * report
          */
         System.out.println(Integer.toString(failures) + " failed files in " + testFiles.size() + " files");
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}