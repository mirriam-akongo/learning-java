package com.playground;

import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int[] a = {10, 2, 8, 6, 7, 3};
        System.out.println(Arrays.toString(mySort(a)));
        //returns the string representation of the object
        mySort(a);

    }

    public static int[] mySort(int[] a) {

        for (int i = 0; i < a.length; i++) {
//            int swap = a[i];

            for (int j = i + 1; j < a.length; j++) {
                int swap = a[i];
                if (a[i] > a[j]) {
                    a[i] = a[j];
                    a[j] = swap;

                }
            }
        }
        return a;
    }
}
