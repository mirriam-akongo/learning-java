package com.mum2;

/**
 * Failed this one
 * **/
/**
 * An array is defined to be a Bean array if it meets the following conditions
 * a. If it contains a 9 then it also contains a 13.
 * b. If it contains a 7 then it does not contain a 16.
 * So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6,
 * 17} are Bean arrays. The following arrays are not Bean arrays:
 * a. { 9, 6, 18} (contains a 9 but no 13)
 * b. {4, 7, 16} (contains both a 7 and a 16)
 * Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns
 * 0.
 * If you are programming in Java or C#, the function signature is
 * int isBean (int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isBean (int a[ ], int len) where len is the number of elements in the array.
 * */
public class Bean {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9, 6, 13};
        System.out.println(isBean(a));

        int[] a2 = {3, 4, 6, 7, 13, 15};
        System.out.println(isBean(a2));

        int[] a3 = {1, 2, 3, 4, 10, 11, 12};
        System.out.println(isBean(a3));

        int[] a4 = {3, 6, 9, 5, 7, 13, 6, 17};
        System.out.println(isBean(a4));

        int[] a5 = { 9, 6, 18};
        System.out.println(isBean(a5));

        int[] a6 = {4, 7, 16};
        System.out.println(isBean(a6));
    }

    public static int isBean(int[] a) {
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
