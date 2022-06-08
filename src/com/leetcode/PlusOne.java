package com.leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));

        int[] arr2 = {1,2,8};
        System.out.println(Arrays.toString(plusOne(arr2)));

        int[] arr3 = {1,2,9};
        System.out.println(Arrays.toString(plusOne(arr3)));

        int[] arr4 = {1,9,9};
        System.out.println(Arrays.toString(plusOne(arr4)));

        int[] arr5 = {9};
        System.out.println(Arrays.toString(plusOne(arr5)));

        int[] arr6 = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(arr6)));

        System.out.println(fibb(4));
        System.out.println(fibb(1));
        System.out.println(fibb(2));
        System.out.println(fibb(8));
    }

    public static int[] plusOne(int[] arr) {
        int arrLength = arr.length;
        /*
        * When adding a number we begin from the last element*/
        for (int i = arrLength - 1; i >= 0; i--) {
            if (arr[i] < 9){
                arr[i] += 1;
                return arr;
            }
            else {
            arr[i] = 0;
        }}

        int[] newArr = new int[arrLength + 1];
        newArr[0] = 1;
        return newArr;
    }

    public static int fibb(int n) {
    /*fib nos 1, 1, 2, 3, 5, 8, 13, 21, 34, .....*/
        int num1 = 1;
        int num2 = 1;
        int sum = 0;

        if (n == 1) {
            return num1;
        }
        if (n == 2) {
            return num2;
        }

        for (int i = 3; i <= n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return sum;
    }
}
