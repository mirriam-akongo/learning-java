package com.mosh.bigo.datastructures;

import java.util.Arrays;

public class MyArrays {
    int length;
    private int[] arr;
    private int count;

    /**Declaring the size of the array*/
    public MyArrays (int length) {
        arr = new int[length];
//        arr = arr;
    }

    public void insert(int item) {
//        int[] arr = new int[length];
//        if (arr[0] == 0) {
//            arr[0] = item;
//        }
        /**If the array is full, resize it*/
        if (arr.length == count) {
            /**Create a new array (twice the size)*/
            /**Copy all the existing elements into the new array*/
            /**Set "arr(Which is the old array" to this new array*/

        }
        /**Add element at the end of the array*/
        arr[count] = item;
        count++;

    }

    public void print() {
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < count; i++) {
//            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
