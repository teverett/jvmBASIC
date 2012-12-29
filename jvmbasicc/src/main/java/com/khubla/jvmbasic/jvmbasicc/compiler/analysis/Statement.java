package com.khubla.jvmbasic.jvmbasicc.compiler.analysis;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author tome
 */
public class Statement {
   /**
    * commontree
    */
   private final CommonTree commonTree;
   /**
    * line index
    */
   private final int lineIndex;
   /**
    * the line
    */
   private final LineDeclaration lineDeclaration;

   /**
    * ctor
    */
   public Statement(CommonTree commonTree, int lineIndex, LineDeclaration lineDeclaration) {
      this.commonTree = commonTree;
      this.lineIndex = lineIndex;
      this.lineDeclaration = lineDeclaration;
   }

   public CommonTree getCommonTree() {
      return commonTree;
   }

   public LineDeclaration getLineDeclaration() {
      return lineDeclaration;
   }

   public int getLineIndex() {
      return lineIndex;
   }
}
