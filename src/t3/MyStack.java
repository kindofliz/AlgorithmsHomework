package t3;

import java.util.Arrays;

/**
 * Implementation of a stack in Java. Example and use test is in main method.
 */

public class MyStack {
    private String[] array;
    private int index = 0;

    //CONSTRUCTOR
    public MyStack(String[] array) {
        this.array = array;
    }

    //OPERATIONS
    public void push(String element) {
        if (isFull()) {
            System.out.println(("\nError, stack is full, can't add any more elements!\n"));
        }

        array[index] = element;
        index++;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println(("\nError, stack is empty!\n"));
        }
        return array[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == array.length;
    }

    public void display() {
        System.out.println("Current elements in stack: " + Arrays.toString(array));
    }

    public void clear() {
        while (!isEmpty()) {
            pop();
        }
    }

    public int size() {
        return index;
    }
}


