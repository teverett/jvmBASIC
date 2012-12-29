package com.khubla.jvmbasic.jvmbasicc.compiler;

/**
 * @author tome
 */
public class LocalVariableDeclaration {
   /**
    * the BASIC line it's declared on
    */
   private final int basicLine;
   /**
    * the name
    */
   private final String name;
   /**
    * the index
    */
   private final int index;

   /**
    * ctor
    */
   public LocalVariableDeclaration(int basicLine, String name, int index) {
      this.basicLine = basicLine;
      this.name = name;
      this.index = index;
   }

   public int getBasicLine() {
      return basicLine;
   }

   public int getIndex() {
      return index;
   }

   public String getName() {
      return name;
   }
}
