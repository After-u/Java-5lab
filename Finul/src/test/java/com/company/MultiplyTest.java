package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void execute() throws StackCalcException{
        Stack<Double> first = new Stack<>();
        Stack <Double> second = new Stack<>();

        first.push(4.0);
        first.push(10.0);

        new Multiply(first).execute();

        second.push(40.0);

        Assert.assertEquals(second.pop(),first.pop());
    }
}