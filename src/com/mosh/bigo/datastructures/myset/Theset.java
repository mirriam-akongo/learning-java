package com.mosh.bigo.datastructures.myset;

import java.util.*;

public class Theset {
    public static void main(String[] args) {
        setInterface();
        System.out.println();
        removeDuplicates();
        System.out.println();
        setFunctions();
    }

    public static void setInterface () {
        Set<String> names = new HashSet<>();
        names.add("Mimi");
        names.add("Jem");
        names.add("Mirriako");
        names.add("Jem");
        System.out.println(names);
    }

    public static void removeDuplicates () {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        Set<String> set = new HashSet<>(collection);
        System.out.println(set);
    }

    public static void setFunctions () {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        System.out.println("Operations of sets");
        /**Union */
        System.out.println("Union of 2 sets");
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println();
        /**Intersection */
        Set<String> set3 = new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set4 = new HashSet<>(Arrays.asList("b", "c", "d"));
        System.out.println("Intersection of 2 sets");
        set3.retainAll(set4);
        System.out.println(set3);
        System.out.println();
        /**Difference */
        Set<String> set5 = new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set6 = new HashSet<>(Arrays.asList("b", "c", "d"));
        System.out.println("Difference of 2 sets");
        set5.removeAll(set6);
        System.out.println(set5);
    }
}
