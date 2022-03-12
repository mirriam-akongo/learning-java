package com.playground;

public class Hcf {
    public static void main(String[] args) {
        System.out.println(hcf(40,60));
    }

    public static int hcf(int num1, int num2) {
        int highestFactor = 0;
        for (int factor = 1; factor <= num1 && factor <= num2; factor++) {
            if (num1 % factor == 0 && num2 % factor == 0) {
                highestFactor = factor;
            }
        }
        return highestFactor;
    }
}
