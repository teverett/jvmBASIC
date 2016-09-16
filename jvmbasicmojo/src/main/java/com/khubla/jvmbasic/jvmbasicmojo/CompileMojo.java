package com.khubla.jvmbasic.jvmbasicmojo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
    * file extension
    */
   @Parameter
   private final String fileExtension = "bas";
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
         final List<String> sourceFiles = this.getBASFiles(sourceDir);
         if (null != sourceFiles) {
            for (final String sourceFile : sourceFiles) {
               System.out.println("Processing: '" + sourceFile + "'");
               final File file = new File(sourceFile);
               processFile(file);
            }
         }
      } catch (final Exception e) {
         e.printStackTrace();
         throw new MojoExecutionException("Unable execute mojo", e);
      }
   }

   public List<String> getBASFiles(String dir) throws Exception {
      return getBASFiles(dir, new ArrayList<String>());
   }

   private List<String> getBASFiles(String dir, List<String> files) throws Exception {
      final File file = new File(dir);
      final String[] list = file.list();
      for (int i = 0; i < list.length; i++) {
         final String fileName = file.getAbsolutePath() + "/" + list[i];
         final File f2 = new File(fileName);
         if (f2.isDirectory()) {
            getBASFiles(fileName + "/", files);
         } else {
            if (f2.getName().toLowerCase().endsWith(fileExtension)) {
               files.add(f2.getAbsolutePath());
            }
         }
      }
      return files;
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
         /*
          * figure out package name
          */
         final String relativePath = file.getAbsolutePath().substring(new File(sourceDir).getAbsolutePath().length() + 1);
         String packageName;
         if (relativePath.length() > file.getName().length()) {
            packageName = relativePath.substring(0, relativePath.length() - (file.getName().length() + 1)).replace(File.separatorChar, '.');
         } else {
            packageName = null;
         }
         /*
          * compile
          */
         final String classname = jvmBasicCompiler.compileToClassfile(file.getAbsolutePath(), packageName, targetDir, verbose, false, false);
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