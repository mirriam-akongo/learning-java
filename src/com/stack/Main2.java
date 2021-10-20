package com.stack;

public class Main2 {
    public static void main(String[] args) {
        Stack2 myStack2 = new Stack2();
        myStack2.push(5);
        myStack2.push(20);
        myStack2.push(37);
        myStack2.push(3);
        myStack2.push(1);

        System.out.println();
        myStack2.show();
        System.out.println();

        System.out.println();
        System.out.println(myStack2.pop());
        myStack2.show();
        System.out.println();

        System.out.println();
        System.out.println(myStack2.pop());
        myStack2.show();
        System.out.println();

        System.out.println();
        System.out.println(myStack2.peek());
        myStack2.show();
        System.out.println();

        System.out.println();
        System.out.println("Size is " + myStack2.size());
        System.out.println();

        myStack2.push(9);
        System.out.println();
        myStack2.show();
        System.out.println();

        myStack2.push(10);
        System.out.println();
        myStack2.show();

        System.out.println();
        myStack2.push(33);
        System.out.println();
        myStack2.show();

        System.out.println();
        System.out.println(myStack2.peek());
        myStack2.show();
        System.out.println();
    }
}
