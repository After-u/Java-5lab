package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void execute() throws StackCalcException{
        Stack<Double> first = new Stack<>();
        Stack <Double> second = new Stack<>();

        first.push(9.0);


        new Sqrt(first).execute();

        second.push(3.0);

        Assert.assertEquals(second.pop(),first.pop());
    }
}