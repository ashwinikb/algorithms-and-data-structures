package com.github.ashwinikb;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testQueue() {

        Queue<String> queue = new Queue<>();
        queue.enqueue("a");
        assertEquals(1, queue.size());
        queue.enqueue("b");
        assertEquals(2, queue.size());
        queue.dequeue();
        assertEquals(1, queue.size());

    }

}