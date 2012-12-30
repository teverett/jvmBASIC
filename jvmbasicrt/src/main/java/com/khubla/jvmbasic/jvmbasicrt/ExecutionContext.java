package com.khubla.jvmbasic.jvmbasicrt;

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
import java.util.Hashtable;
import java.util.Stack;

import org.apache.log4j.Logger;

/**
 * @author tome
 */
public class ExecutionContext {
   /**
    * logger
    */
   private static final Logger logger = Logger.getLogger(Value.class);
   /**
    * the value stack
    */
   private final Stack<Value> valueStack;
   /**
    * variables
    */
   private final Hashtable<String, Value> variables;

   /**
    * ctor
    */
   public ExecutionContext() {
      valueStack = new Stack<Value>();
      variables = new Hashtable<String, Value>();
   }

   public int getStackSize() {
      return valueStack.size();
   }

   public Value getVariable(String name) {
      return variables.get(name);
   }

   public Value pop() {
      final Value ret = valueStack.pop();
      logger.info("popping " + ret.getAsString());
      return ret;
   }

   public void push(Boolean value) {
      logger.info("pushing Boolean: '" + value + "'");
      valueStack.push(new Value(value));
   }

   public void push(Double value) {
      logger.info("pushing Double: '" + value + "'");
      valueStack.push(new Value(value));
   }

   public void push(Integer value) {
      logger.info("pushing Integer: '" + value + "'");
      valueStack.push(new Value(value));
   }

   public void push(String value) {
      logger.info("pushing String: '" + value + "'");
      valueStack.push(new Value(value));
   }

   /**
    * return the correct value, evaluating as a variable if necessary
    */
   public Value resolveValue(Value value) {
      if ((value.getType() == Value.Type.DOUBLE) || (value.getType() == Value.Type.INTEGER) || (value.getType() == Value.Type.STRING) || (value.getType() == Value.Type.BOOLEAN)) {
         return value;
      } else if (value.getType() == Value.Type.VARIABLE) {
         final Value ret = variables.get(value.getString());
         logger.info("resolved variable '" + value.getString() + "' to value '" + ret.getAsString() + "'");
         return ret;
      } else {
         return null;
      }
   }

   public void setVariable(String name, int value) {
      logger.info("setting variable '" + name + "' with value '" + value + "'");
      variables.put(name, new Value(value));
   }

   public void setVariable(String name, Value value) {
      logger.info("setting variable '" + name + "' with value '" + value.getAsString() + "'");
      variables.put(name, value);
   }

   /**
    * swap the top two arguments on the stack
    */
   public void swap() {
      final Value v1 = valueStack.pop();
      final Value v2 = valueStack.pop();
      valueStack.push(v1);
      valueStack.push(v2);
   }
}
