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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

/**
 * @author tom
 */
public class TestParserLexer {
   /**
    * root
    */
   private static final String BASROOT = "src/test/resources/bas/";

   private List<String> getTestFiles(String dir, List<String> files) throws Exception {
      final File file = new File(dir);
      final String[] list = file.list();
      for (int i = 0; i < list.length; i++) {
         {
            final String fileName = dir + list[i];
            final File f2 = new File(fileName);
            if (f2.isDirectory()) {
               getTestFiles(fileName + "/", files);
            } else {
               files.add(fileName);
            }
         }
      }
      return files;
   }

   @Test
   public void test1() {
      try {
         final List<String> testFiles = getTestFiles(BASROOT, new ArrayList<String>());
         int failures = 0;
         System.out.println("Found " + testFiles.size() + " test files");
         for (int i = 0; i < testFiles.size(); i++) {
            final String filename = testFiles.get(i);
            final InputStream inputStream = new FileInputStream(filename);
            if (null != inputStream) {
               System.out.println("Parsing: " + filename);
               try {
                  JVMBasicCompiler.parse(inputStream);
               } catch (final Exception e) {
                  failures++;
                  e.printStackTrace();
               }
               System.out.println("Done");
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