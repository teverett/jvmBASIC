package com.khubla.jvmbasic.jvmbasicwww;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

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
public class ScriptletParser {
   private final static String START_SCRIPTLET = "<%";
   private final static String END_SCRIPTLET = "%>";

   /**
    * parse scriptlets from an InputStream
    */
   public void parse(InputStream inputStream, OutputStream outputStream) throws Exception {
      OutputStreamWriter streamWriter = null;
      Scanner scanner = null;
      try {
         /*
          * writer and scanner
          */
         streamWriter = new OutputStreamWriter(outputStream);
         scanner = new Scanner(inputStream);
         boolean inScriptlet = false;
         while (scanner.hasNext()) {
            if (!inScriptlet) {
               scanner.useDelimiter(START_SCRIPTLET);
               String s = scanner.next();
               streamWriter.write(s);
               inScriptlet = true;
               if (scanner.hasNext()) {
                  scanner.skip(START_SCRIPTLET);
               }
            } else {
               scanner.useDelimiter(END_SCRIPTLET);
               String s = scanner.next();
               System.out.println(s);
               inScriptlet = false;
               if (scanner.hasNext()) {
                  scanner.skip(END_SCRIPTLET);
               }
            }
         }
      } catch (Exception e) {
         throw e;
      } finally {
         if (null != streamWriter) {
            streamWriter.flush();
            streamWriter.close();
         }
         if (null != scanner) {
            scanner.close();
         }
      }
   }
}
