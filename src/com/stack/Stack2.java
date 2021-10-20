package com.stack;

public class Stack2 {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        if (top > 4) {
            System.out.println("Adding an Element to the stack");
            System.out.println("Stack is full");
        } else {
            System.out.println("Adding an Element to the stack");
            stack[top] = data;
            top++;
        }
    }
    public boolean isEmpty(){
        System.out.println("Checking if the stack is empty");
        return top <= 0;
    }
    public int pop(){
        int data = 0;

        if (isEmpty()){
            System.out.println("Removing an Element from the stack");
            System.out.println("stack is empty");
        } else {
            System.out.println("Removing an Element from the stack");
            top--;
            data = stack[top];
            stack[top] = 0;

        } return data;
    }

    public int peek() {
        System.out.println("Peeking an Element from the stack");
        int data;
        top--;
        data = stack[top];
        return data;
    }

    public void show(){
        for (int i: stack) {
            System.out.print(i + " ");
        }
    }

    public int size() {
        return top;
    }
}
