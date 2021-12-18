package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void execute() throws StackCalcException{
        Stack<Double> first = new Stack<>();
        Stack <Double> second = new Stack<>();

        first.push(2.0);
        first.push(6.0);

        new Division(first).execute();

        second.push(3.0);

        Assert.assertEquals(second.pop(),first.pop());
    }
}