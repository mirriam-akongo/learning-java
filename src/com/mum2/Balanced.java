package com.mum2;

public class Balanced {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7};
        System.out.println(isBalanced(a));
        int[] a2 = {6, 7, 2, 3, 12};
        System.out.println(isBalanced(a2));
        int[] a3 = {7, 15, 2, 3};
        System.out.println(isBalanced(a3));
        int[] a4 = {16, 6, 2, 3};
        System.out.println(isBalanced(a4));
    }

    public static int isBalanced (int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0) {
                return 0;
            } else
            if (i % 2 == 1 && a[i] % 2 != 1) {
                return 0;
            }
        }

        return 1;
    }
}
