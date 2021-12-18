/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

import java.util.Map;
import java.util.Stack;

public class Pop extends Command {

    public Pop(Stack<Double> stack) {
        super(stack);
    }

    public void execute() throws StackCalcException 
    {
        if (!stack.empty()) {
            System.out.println(super.stack.pop());
        } else throw new StackCalcException("Not enough arguments");
    }
}