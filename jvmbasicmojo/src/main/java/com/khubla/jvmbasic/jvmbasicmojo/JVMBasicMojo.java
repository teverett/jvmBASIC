package com.khubla.jvmbasic.jvmbasicmojo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

/**
 * <p>
 * maven mojo to a jvmBASIC build
 * <p>
 * 
 * @author tome
 */
@Mojo(name = "jvmbasic", defaultPhase = LifecyclePhase.COMPILE)
@Execute(goal = "jvmbasic", phase = LifecyclePhase.COMPILE)
public class JVMBasicMojo extends AbstractMojo {
   /**
    * where to find the sources
    */
   @Parameter
   private String sourceDir = "src/main/basic";
   /**
    * target dir
    */
   @Parameter
   private String targetDir = "target/classes/";
   /**
    * verbose
    */
   @Parameter
   private boolean verbose = false;

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

   public boolean isVerbose() {
      return verbose;
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

   public void setVerbose(boolean verbose) {
      this.verbose = verbose;
   }
}