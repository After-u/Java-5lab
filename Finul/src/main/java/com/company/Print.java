
package com.company;

import java.util.Map;
import java.util.Stack;

public class Print extends Command {


    public Print(Stack<Double> stack) {
        super(stack);
    }

    @Override
    public void execute() throws StackCalcException {
        if (!stack.empty()) {
            System.out.println(stack.peek());

        } else throw new StackCalcException("Not enough arguments");
    }
}
