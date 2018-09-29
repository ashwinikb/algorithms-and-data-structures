package com.github.ashwinikb;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {


    @Test
    public void testStack() {

        Stack stack = new Stack(10);
        assertEquals(true, stack.isEmpty());
        stack.push(4);
        assertEquals(false, stack.isEmpty());
        stack.push(2);
        stack.push(9);
        assertEquals(false, stack.isFull());
        assertEquals(9, stack.pop());

    }
}