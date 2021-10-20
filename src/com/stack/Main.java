package com.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(20);
        myStack.push(37);
        myStack.push(3);
        myStack.push(1);

        myStack.show();
        System.out.println();

        System.out.println(myStack.pop());
        myStack.show();
        System.out.println();

        System.out.println(myStack.pop());
        myStack.show();
        System.out.println();

        System.out.println(myStack.peek());
        myStack.show();
        System.out.println();

        System.out.println("Size is " + myStack.size());

        myStack.push(9);
        System.out.println();
        myStack.show();

        myStack.push(10);
        System.out.println();
        myStack.show();

        System.out.println();
        myStack.push(33);
        System.out.println();
        myStack.show();
    }
}
