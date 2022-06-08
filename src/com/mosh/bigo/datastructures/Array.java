package com.mosh.bigo.datastructures;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println("To Print an array");
        System.out.println(Arrays.toString(arr));

        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arrb = {10, 20, 30};
        System.out.println(Arrays.toString(arrb));
        System.out.println(arrb.length);

        System.out.println();
        System.out.println();
        MyArrays a = new MyArrays(3);
//        a.insert(1);
        a.print();
        a.insert(40);
        a.insert(3);
        a.insert(44);
        a.print();
//        System.out.println(a.length);
    }
}
