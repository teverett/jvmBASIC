package com.khubla.jvmbasic.jvmbasicmojo;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

/*
 * mvn help:describe -DartifactId=jvmbasic-maven-plugin -DgroupId=com.khubla.jvmbasic -Dgoal=compile -Ddetail
 */
/**
 * jvmBASIC compiler
 *
 * @author tome
 */
@Mojo(name = "compile", defaultPhase = LifecyclePhase.COMPILE, requiresProject = true, threadSafe = false)
public class CompileMojo extends AbstractMojo {
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
    * project
    */
   @Component
   private MavenProject project;

   @Override
   public void execute() throws MojoExecutionException, MojoFailureException {
      try {
         if (null != project) {
            sourceDir = project.getBasedir().toString() + "/" + sourceDir;
            targetDir = project.getBasedir().toString() + "/" + targetDir;
         }
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
         final String classname = jvmBasicCompiler.compileToClassfile(file.getAbsolutePath(), targetDir, verbose);
         System.out.println("Compiled '" + file.getName() + "' to class '" + classname + "'");
      } catch (final Exception e) {
         throw e;
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