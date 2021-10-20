package com.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Showing Inserted Elements");
        list.insert(5);
        list.insert(2);
        list.insert(1);

        list.show();
        System.out.println();

        System.out.println("Inserting a new element at the start of the list");
        list.insertAtStart(3);
        list.show();
        System.out.println();

        System.out.println("Inserting a new element at a given position in the list");
        list.insertAt(1,10);
        list.show();
        System.out.println();

        System.out.println("Inserting a new element at the start in a given position in the list");
        list.insertAt(0,80);
        list.show();
        System.out.println();

        System.out.println("Deleting an element at a given position in the list");
        list.deleteAt(0);
        list.show();
        System.out.println();

        list.deleteAt(3);
        list.show();
        System.out.println();
    }
}
