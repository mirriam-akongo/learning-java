package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListW3Sch {
    public static void main(String[] args) {
        System.out.println("Working with LinkedList");
        System.out.println("Printing Elements in the LinkedList");
        LinkedList<String> names = new LinkedList<>();
        names.add("Brenda");
        names.add("Winnie");
        names.add("Eric");
        names.add("Mirriam");
        names.add("Aaron");
        names.add("Martha");
        System.out.println(names);

        System.out.println();
        System.out.println();
        System.out.println("Add element at the beginning of the LinkedList");
        names.addFirst("Mummy");
        names.addFirst("Daddy");
        names.addFirst("Grandma");
        names.addFirst("Ugandan Family");
        System.out.println(names);

        System.out.println();
        System.out.println();
        System.out.println("Remove First element");
        names.removeFirst();
        System.out.println(names);

        System.out.println();
        System.out.println();
        System.out.println("Adding Elements at the end of the linkedList");
        names.add("Dan");
        names.addLast("Ugandan");
        System.out.println(names);

        System.out.println();
        System.out.println();
        System.out.println("Remove Last Element");
        System.out.println(names.removeLast());
        System.out.println(names);

        System.out.println();
        System.out.println();
        System.out.println("Getting the first element in the LinkedList");
        System.out.println(names.getFirst());
        System.out.println();
        System.out.println("Getting the last element in the LinkedList");
        System.out.println(names.getLast());

        System.out.println();
        System.out.println();
        System.out.println("Printing individual element");

        for (String name: names) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("Sorting the names");
        Collections.sort(names);
        System.out.println(names);
    }
}
