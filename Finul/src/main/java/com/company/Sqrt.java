/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

import java.util.Map;
import java.util.Stack;

public class Sqrt extends Command {

    public Sqrt(Stack<Double> stack) {
        super(stack);
    }

    @Override
    public void execute() throws StackCalcException {
        if (!stack.isEmpty()) {
            Double d1 = stack.pop();
            Double result = Math.sqrt(d1);
            stack.push(result);
        } else throw new StackCalcException("Not enough arguments");
    }
}