package com.array.gfgarray;

public class SortedArr {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        System.out.println(sorted(a));

        int[] b = {10, 20, 20, 30};
        System.out.println(sorted(b));

        int[] c = {10, 5, 2};
        System.out.println(sorted(c));

        int[] d = {};
        System.out.println(sorted(d));

        int[] e = {10};
        System.out.println(sorted(e));
        System.out.println();
        System.out.println();

        System.out.println("Part 2");
        System.out.println(sorted2(a));
        System.out.println(sorted2(b));
        System.out.println(sorted2(c));
        System.out.println(sorted2(d));
        System.out.println(sorted2(e));
    }

    /**
     * Program that checks an array if it is sorted
     * */
    public  static boolean sorted (int[] arr) {
        boolean isSorted = false;
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }
        for (int index = 0; index < arr.length; index++) {
            if ((index < arr.length - 2) && arr[index] <= arr[index + 1]) {
                isSorted = true;
            }
        }
        return isSorted;
    }

    public static boolean sorted2 (int[] arr) {

        if (arr.length == 0 || arr.length == 1) {
            return true;
        }

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < arr[index - 1]) {
                return false;
            }
        }
        return true;
    }
}
