package com.khubla.jvmbasic.jvmbasicmojo;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
import java.io.File;
import java.io.FileInputStream;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

/**
 * @author tome
 *         <p>
 *         maven mojo to a jvmBASIC build
 *         <p>
 */
/**
 * @goal jvmbasic
 */
public class JVMBasicMojo extends AbstractMojo {
   /**
    * where to find the sources
    */
   private String sourceDir = "src/main/basic";
   /**
    * target dir
    */
   private String targetDir = "target/classes/";
   /**
    * verbose
    */
   private final boolean verbose = false;

   /**
    * default ctor
    * <p>
    * used by maven
    * </p>
    */
   public JVMBasicMojo() {
   }

   public void execute() throws MojoExecutionException {
      try {
         /*
          * drop the config
          */
         System.out.println("Source directory: " + sourceDir);
         System.out.println("Target directory: " + targetDir);
         /*
          * get the sources
          */
         final File sourceDirFile = new File(sourceDir);
         if (sourceDirFile.exists()) {
            final File[] files = sourceDirFile.listFiles();
            if (null != files) {
               for (int i = 0; i < files.length; i++) {
                  processFile(files[i]);
               }
            }
         } else {
            throw new Exception("Unable to find directory '" + sourceDir + "'");
         }
      } catch (final Exception e) {
         e.printStackTrace();
         throw new MojoExecutionException("Unable execute mojo", e);
      }
   }

   public String getSourceDir() {
      return sourceDir;
   }

   public String getTargetDir() {
      return targetDir;
   }

   /**
    * process a single .bas file
    */
   private void processFile(File file) throws Exception {
      try {
         final JVMBasicCompiler jvmBasicCompiler = new JVMBasicCompiler();
         final String classname = JVMBasicCompiler.classNameFromFileName(file.getName());
         System.out.println("Compiling '" + file.getName() + "'");
         final byte[] byteCode = jvmBasicCompiler.compile(new FileInputStream(file), classname, verbose);
         JVMBasicCompiler.writeClassFile(byteCode, classname, targetDir);
      } catch (final Exception e) {
      }
   }

   public void setSourceDir(String sourceDir) {
      this.sourceDir = sourceDir;
   }

   public void setTargetDir(String targetDir) {
      this.targetDir = targetDir;
   }
}