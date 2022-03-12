package com.mirriako;

public class MyIsBean {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9, 6, 13};
        System.out.println(isMyBean(a));

        int[] a2 = {3, 4, 6, 7, 13, 15};
        System.out.println(isMyBean(a2));

        int[] a3 = {1, 2, 3, 4, 10, 11, 12};
        System.out.println(isMyBean(a3));

        int[] a4 = {3, 6, 9, 5, 7, 13, 6, 17};
        System.out.println(isMyBean(a4));

        int[] a5 = { 9, 6, 18};
        System.out.println(isMyBean(a5));

        int[] a6 = {4, 7, 16};
        System.out.println(isMyBean(a6));
    }

    public static int isMyBean (int[] a) {
        boolean contains9 = false;
        boolean contains13 = false;
        boolean contains7 = false;
        boolean contains16 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                contains9 = true;
            }
            if (a[i] == 13) {
                contains13 = true;
            }
            if (a[i] == 7) {
                contains7 = true;
            }
            if (a[i] == 16) {
                contains16 = true;
            }
        }
        if (contains9 == false && contains13 == false && contains7 == false && contains16 == false) {
            return 1;
        }
        if (contains9 == true && contains13 == true) {
            return 1;
        }
        if (contains7 == true && contains16 == false) {
            return 1;
        }
        return 0;
    }
}
