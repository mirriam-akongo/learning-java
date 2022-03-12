package com.playground;

public class Pronic {
    public static void main(String[] args) {
        System.out.println(pronic(6));
        System.out.println(pronic(8));
    }

    /**
     * Write a Java program to check whether a number is a Pronic
     * or Heteromecic Number or not
     * A pronic number is the number which is the product of two consecutive
     * integers i.e 12 = 3*4, 6 = 2*3
     * */
    public static boolean pronic(int num) {
        boolean isPronic = false;
        for (int i = 1; i<= num; i++) {
            int value = i * (i + 1);
            if (value == num) {
                isPronic = true;
            }
        }

        return isPronic;
    }
}
