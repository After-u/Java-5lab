
package com.company;

import java.util.Map;
import java.util.Stack;

public class Push extends Command {

    String var;
    Map<String, Double> variables;

    public Push(Stack<Double> stack, Map<String, Double> definitions) {
        super(stack);
        this.variables = definitions;
        this.var = var;
    }

    public void setPush(String s) {
        this.var = s;
    }

    @Override
    public void execute() throws NoDefinitionExcetpion, WrongCommand{
        Double d = null;
        if (variables.containsKey(var)) {
            d = variables.get(var);
            stack.push(d);
        } else {
            try {
                d = Double.valueOf(var);
                stack.push(d);
            } catch (NumberFormatException ignored){
                throw new WrongCommand("Number " + d + "is inncorrect");
            }

        }
        if (d == null) {
            throw  new NoDefinitionExcetpion("No such variable in DEFINITIONS " + this.var);
        }
        stack.push(d);
    }
}
