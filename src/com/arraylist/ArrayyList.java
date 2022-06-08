package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayyList {
    public static void main(String[] args) {
        System.out.println("Working with ArrayList");
        ArrayList<String> sisters = new ArrayList<>();
        sisters.add("Brenda");
        sisters.add("Winnie");
        sisters.add("Mirriam");
        sisters.add("Martha");
        sisters.add("The four of us");
        System.out.println("Printing the elements in the ArrayList");
        System.out.println(sisters);

        System.out.println();
        System.out.println();
        System.out.println("Accessing an Element in the ArrayList");
        System.out.println(sisters.get(3));

        System.out.println();
        System.out.println();
        System.out.println("To modify an Element in the ArrayList we use set");
        sisters.set(3, "Baby Martha");
        System.out.println(sisters);

        System.out.println();
        System.out.println();
        System.out.println("Removing an Element");
        sisters.remove(4);
        System.out.println(sisters);

        System.out.println();
        System.out.println();
        System.out.println("Working with the ArrayList size");
        System.out.println(sisters.size());

        System.out.println();
        System.out.println();
        System.out.println("Looping through an ArrayList");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kampala");
        cities.add("Lira");
        cities.add("Jinja");
        cities.add("Gulu");
        cities.add("Mukono");

        System.out.println("Looping cites using a 'Foreach loop'");
        for (String i: cities) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Looping cites using a 'For loop'");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        System.out.println();
        System.out.println();
        System.out.println("Creating a ArrayList for Integers");
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(63);
        ages.add(36);
        ages.add(35);
        ages.add(33);
        ages.add(30);
        System.out.println("Looping ages using a 'Foreach loop'");
        for (int i : ages) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Looping ages using a 'For loop'");
        for (int i = 0; i < ages.size(); i++) {
            System.out.println(ages.get(i));
        }
        System.out.println();
        System.out.println("Sorting the Cities ArrayList using the Collections class");
        System.out.println("Sorting the Cities ArrayList");
        Collections.sort(cities);
        for (String city: cities) {
            System.out.println(city);
        }
        System.out.println();
        System.out.println("Sorting the ages ArrayList");
        Collections.sort(ages);
        for (int age : ages) {
            System.out.println(age);
        }

    }
}
