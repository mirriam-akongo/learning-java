package com.playground;

public class Lcm {
    public static void main(String[] args) {
        System.out.println(lcf(6,12));
        System.out.println(lcf(60,50));
        System.out.println(lcf(4,8));
        System.out.println(lcf(0,4));
        System.out.println(lcf(4,0));
        System.out.println(lcf(4,4));
        System.out.println(lcf(12,6));
    }
    public static int lcf(int num1, int num2) {
        int lowestFactor = 0;
//        for (int factor = 1;)
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        if (num1 == num2) {
            return num1;
        }

        if (num1 < num2 && num2 % num1 == 0) {
            return num2;
        }

        if (num2 < num1 && num1 % num2 == 0) {
            return num1;
        }

        int gcf = 0;
        for (int i = 1; i < num1 && i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcf = i;
            }
        }
        lowestFactor = (num1 * num2) / gcf;
        return lowestFactor;
    }
}
