package t3;

import t3.MyStack;

public class Main {
    public static void main(String[] args) {

        //Implement a stack using a static myArray. Program these operations for a stack:
        //push() – to add an element,
        //pop() – to delete an element,
        //isEmpty() – to check whether a stack is empty,
        //isFull() – to check whether a stack is full,
        //display() – to print a stack,
        //clear() – to clear a stack,
        //size() – to output the size of a stack.

        String[] myArray = {"A", "B", "C", "D", "E", "F"};
        MyStack testStack = new MyStack(myArray);

        //1. push() – to add an element,
        for (String s : myArray) {
            testStack.push(s);
        }

        //4. isFull() – to check whether a stack is full,
        System.out.println("Is the stack currently full? - " + testStack.isFull());

        //7. size() – to output the size of a stack.
        System.out.println("Current stack size: " + testStack.size());

        //3. isEmpty() – to check whether a stack is empty,
        System.out.println("Is the stack currently empty? - " + testStack.isEmpty());

        //5. display() – to print a stack,
        testStack.display();

        //2. pop() – to delete an element
        System.out.println("Popped: " + testStack.pop());
        System.out.println("Popped: " + testStack.pop());
        System.out.println("Popped: " + testStack.pop());

        //7. size() – to output the size of a stack.
        System.out.println("Current stack size: " + testStack.size());

        //6. clear() – to clear a stack,
        testStack.clear();
        System.out.println("Cleared the stack!");

        //4. isFull() – to check whether a stack is full,
        System.out.println("Is the stack currently full? - " + testStack.isFull());

        //3. isEmpty() – to check whether a stack is empty,
        System.out.println("Is the stack currently empty? - " + testStack.isEmpty());
    }
}