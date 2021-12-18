
package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public abstract class Command {
    protected static Stack<Double> stack = new Stack<Double>();

    public Command(Stack<Double> stack) {
        this.stack = stack;
    }

    public abstract void execute() throws StackCalcException, NoDefinitionExcetpion, WrongCommand;

    protected boolean hasTwoNumber() 
    {
        return stack.size() > 1 ? true : false;
    }
}