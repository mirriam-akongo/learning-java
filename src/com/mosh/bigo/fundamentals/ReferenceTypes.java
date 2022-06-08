package com.mosh.bigo.fundamentals;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class ReferenceTypes {
    public static void main(String[] args) {
        System.out.println("Primitives");
        byte myByteMin = -128;
        byte myByteMax = 127;
        short myShortMin = -32_000;
        short myShortMax = 32_000;
        int myIntMin = -2_000_000_000;
        int myIntMax = 2_000_000_000;

        System.out.println("Working with Dates");
        Date date = new Date();
        System.out.println(date);
        System.out.println();
        System.out.println();

        Point point = new Point(1,1);
        Point point2 = point;
        System.out.println("Pointer one " + point);
        System.out.println("Pointer two " + point2);
        point.x = 15;
        System.out.println("Pointer two after altering the 'x' value " + point2);
        System.out.println("Pointer one " + point);
        System.out.println();
        System.out.println();

        System.out.println("Strings are immutable meaning " +"\n" + "that once we declare them " + "\n" + "we cannot change them");
        System.out.println();
        System.out.println("Most String Methods return a new object");
        String greeting = "Hello there";
        System.out.println(greeting);
        System.out.println();
        System.out.println("Printing each character that is in a string");
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println(greeting.charAt(i));
        }

        System.out.println();
        System.out.println("String ends with character 'e'  " + greeting.endsWith("e"));
        System.out.println();
        System.out.println("String starts with character 'z'  " + greeting.startsWith("z"));
        System.out.println();
        System.out.println("String length is " + greeting.length());
        System.out.println();
        System.out.println("Finding the index of character 'r  " + greeting.indexOf("r"));
        System.out.println();
        System.out.println();
        System.out.println("Replacing a character in a String");
        System.out.println(greeting.replace(" ", " - "));
        System.out.println();
        System.out.println();
        System.out.println("Getting the reversed String");
        System.out.println(getReveresedStatement(greeting));
        System.out.println();
        System.out.println();
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());

        String hey = "    Hello World!!!        ";
        System.out.println(hey.trim());
        System.out.println(hey);

        System.out.println();
        System.out.println("Working with Special Characters in Strings");
        String quotes = "Mirriam said \"Where have you been?\" to Jem";
        System.out.println(quotes);
        System.out.println();
        String backslash = "c:\\ubuntu\\";
        System.out.println(backslash);
        System.out.println();
        String newLine = "Make a new line and \nsay hey hey";
        System.out.println(newLine);
        System.out.println();
        String tab = "Using a tab immediately \tlike so";
        System.out.println(tab);
    }

    public static String getReveresedStatement (String input) {
        String reversedOutput = "";

        for (int i = input.length() - 1; i > -1; i--) {
            reversedOutput += input.charAt(i);
        }

        return reversedOutput;
    }
}
