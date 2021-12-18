package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void execute() throws CalculatorException{
        Stack<Double> first = new Stack<>();
        Stack <Double> second = new Stack<>();

        first.push(3.5);
        first.push(5.1);

        new Sum(first).execute();

        second.push(8.6);

        Assert.assertEquals(second.pop(),first.pop());
    }
}