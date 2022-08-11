package com.playground;

import java.util.Locale;

public class TheString {
    public static void main(String[] args) {
        String output = "The quick brown fox jumps over the lazy dog";
        System.out.println(pangram(output));
        String output2 = "I'm just trying to understand";
        System.out.println(pangram(output2));
        String output3 = "hey world";
        System.out.println(pangram(output3));
        String output4 = "The quick brown fox jumps over the dog";
        System.out.println(pangram(output4));
        System.out.println();
        System.out.println(pangram2(output4));
        System.out.println(pangram2(output));
    }

    public static boolean pangram (String input) {
        if (input.length() < 26) {
            return false;
        }
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.println(letter);
            if (input.indexOf(letter) < 0) {
                return false;
            }

        }
        return true;
    }

    public static boolean pangram2(String input) {
        input.toLowerCase();

        if (input.length() < 26) {
            return false;
        }
//        for (int index = 0; index < input.length(); index++) {
//            if ('a' <= input.charAt(index) && input.charAt(index) <= 'z') {
//                input.charAt(index) - 'a';
//                System.out.println(input.charAt(index));
//            }
//        }

        for (char letter = 'a'; letter <= 'z'; letter++) {
//            System.out.println(letter);
            if (!(input.contains(String.valueOf(letter)))) {
                return false;
            }

        }

        return true;
    }
}
