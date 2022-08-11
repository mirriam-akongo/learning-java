package com.playground;

public class Recusion {
    public static void main(String[] args) {
        System.out.println(recursion(5));
        System.out.println(recursion(10));
        System.out.println();
        System.out.println(recursion2(5));
        System.out.println(recursion2(1));

        System.out.println();
        System.out.println("Reversing a string");
        System.out.println(reversing("dog"));
        System.out.println();
        System.out.println();
        System.out.println(reverseUsingStringBuilder("monday"));
    }
    public static int recursion (int n) {
        int product = 1;
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            while (n > 0) {
                product = product * n;
                n--;
            }
        }
        return product;
    }
    public static int recursion2(int n) {
        if (n <= 0) {
            return 0;
        }  else if (n == 1) {
            return 1;
        }
        else {
            return n * recursion(n - 1);
        }
    }

    public static String reversing (String input) {
        System.out.println(input);
        String output = "";
        for (int index = input.length() - 1; index > -1; index--) {
            output += input.charAt(index);
        }

        return output;
    }

    public static String reverseUsingStringBuilder (String input) {
        System.out.println("Using String Builder " + input);
        StringBuilder output = new StringBuilder();
        for (int index = input.length() - 1; index > -1; index--) {
            output.append(input.charAt(index));
        }
        return output.toString();

    }
}
