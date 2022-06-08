package com.string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Return a reversed String");
        String a = "hello world";
        System.out.println(a);
        System.out.println();
        System.out.println("The reversed String is");
        System.out.println(getReversedString(a));
    }

    public static String getReversedString (String input) {
        String reversed = "";
        for (int index = input.length() - 1; index > -1; index--) {
            reversed += input.charAt(index);
        }

        return reversed;
    }
}
