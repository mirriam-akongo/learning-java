package com.string;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        string();
    }
    public static void string() {
        String myString = "Handling the Strings";
        System.out.println(myString);
        System.out.println();
        System.out.println("Methods of String Class");
        System.out.println("Using the Length method -> " + myString.length());
        System.out.println();
        System.out.println("Using the toLowerCase method -> " + myString.toLowerCase());
        System.out.println();

        System.out.println("Using the toUpperCase method -> " + myString.toUpperCase());
        System.out.println();


    }


}
