package com.mum;

public class Reversing {
    public static void main(String[] args) {
        int[] numbers = {8,7,5,10,7,2};
        reverse(numbers);
    }

    public static void reverse(int[] arr) {
//        return arr;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
