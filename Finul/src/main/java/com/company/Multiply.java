/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

import java.util.Map;
import java.util.Stack;

public class Multiply extends Command {

    public Multiply(Stack<Double> stack) {
        super(stack);
    }

    @Override
    public void execute() throws StackCalcException 
    {
        if (hasTwoNumber()) {
            Double d1 = stack.pop();
            Double d2 = stack.pop();
            Double result = d1 * d2;
            stack.push(result);
        } else throw new StackCalcException("Not enough arguments");
    }
}
