package com.mum;

public class Reversing {
    public static void main(String[] args) {
        int[] numbers = {8,7,5,10,7,2};
        reverse(numbers);
        System.out.println();
        System.out.println();
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    public static void reverse(int[] arr) {
//        return arr;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int y = 0;
        int sum = 0;
//        if (temp < 0) {
//            return false;
//        }
        while(temp != 0) {
            y = temp % 10;
            sum = (sum * 10) + y;

            temp = temp / 10;

        }
        System.out.println(sum);
        System.out.println(x);
        System.out.println(temp);
        if(x == sum) {
            return true;
        }
        return false;
    }
}
