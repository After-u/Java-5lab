package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class MinusTest {

    @Test
    public void execute() {
        Stack<Double> first = new Stack<>();
        Stack <Double> second = new Stack<>();

        first.push(3.0);
        first.push(5.0);

        new Minus(first).execute();

        second.push(2.0);

        Assert.assertEquals(second.pop(),first.pop());
    }
}