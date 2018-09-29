package com.github.ashwinikb;

/**
 * Stack implementation using Array
 */
public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;


    public Stack(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void largestNumber() {
        long smallest = stackArray[0];
        long largest = stackArray[0];
        for (int i = 1; i < stackArray.length; i++) {
            if (stackArray[i] > largest)
                largest = stackArray[i];
            else if (stackArray[i] < smallest)
                smallest = stackArray[i];

        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(60);
        stack.push(30);
        stack.push(40);
        stack.push(15);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.println(value);


        }
    }
}
