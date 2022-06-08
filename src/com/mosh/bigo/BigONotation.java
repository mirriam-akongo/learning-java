package com.mosh.bigo;

public class BigONotation {
    public static void main(String[] args) {
        System.out.println("Returning the first element in the array");
        System.out.println("A print statement has big O notation of O(1)");
        int[] a = {2, 4, 6, 8,0};
        bigOofOne(a);
        System.out.println();
        System.out.println();
        bigOofN(a);
        System.out.println();
        System.out.println();
        String[] names = {"Mirriam", "Jem", "Mirriako", "Queen"};
        bigOofNb(a, names);
        System.out.println();
        System.out.println();
        bigOofNSquared(a, names);

        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public static void bigOofOne(int[] arr) {
        System.out.println("Representing Big O of Constant time");
        /** This runs at constant time of O(1)*/
        System.out.println(arr[0]);
        /** If we add another statement it shall run at constant time of O(2) =>
         * Which is simplified as O(1)*/
        System.out.println(arr[0]);
    }

    public static void bigOofN(int[] arr) {
        System.out.println("Representing Big O of Linear time => O(n)");
        /** This runs at constant time of O(1)*/

        for (int i : arr) {
        System.out.print(i + "  ");
        }

    }

    public static void bigOofNb(int[] arr, String[] names) {
        System.out.println("Representing Big O of Linear time => O(n)");
        /** This runs at constant time of O(1)*/

        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (String name : names) {
            System.out.print(name + "  ");
        }
    }

    public static void bigOofNSquared(int[] arr, String[] names) {
        System.out.println("Representing Big O of Quadratic time => O(n ^ 2)");
        /** This runs at Quadratic time of O(n ^ 2)*/

        for (int i : arr) {
            for (String name : names) {
                System.out.println(name + " " + i +"  ");
            }
        }
    }

//    public static int binaray (int[] arr, int k) {
//        for (int i = 0; i <= arr.length / 2; i++) {
//            if (arr[i] < k) {
//
//            }
//        }
//    }
}
