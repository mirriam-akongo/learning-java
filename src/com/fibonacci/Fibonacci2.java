package com.fibonacci;

public class Fibonacci2 {
    public static void main(String[] args) {
//        System.out.println(isFibonacci(2));
//        System.out.println(isFibonacci(4));
        System.out.println(isFibonaccii(2));
        System.out.println(isFibonaccii(3));
        System.out.println(isFibonaccii(4));
        System.out.println(isFibonaccii(5));
        System.out.println(isFibonaccii(6));
    }
    /**
     * A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,.... Note that first two Fibonacci
     * numbers are 1 and any Fibonacci number other than the first two is the sum of the previous two Fibonacci
     * numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
     * Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number, otherwise it
     * returns 0.
     * The signature of the function is
     * int isFibonacci (int n)
     * */

    public static int isFibonacci(int n) {
        int firstNumber = 1;
        int secondNumber = 1;
        int fibonacciNumber = 0;
        int sum = 0;
         for (int i = 1; i <= n; i++) {
             sum = firstNumber + secondNumber;
             firstNumber = secondNumber;
             secondNumber = sum;
             if (sum == n) {
                 fibonacciNumber = 1;
             }

         }

//        for (int i = 3; i) {
//
//        }


        return fibonacciNumber;
    }
    public static int isFibonaccii (int n) {
        int fibonaciNumber = 0;
        int firstNumber = 1;
        int secondNumber = 1;
        int sum = 0;
        while (sum <= n) {
            sum = firstNumber + secondNumber;
            if (sum == n) {
                fibonaciNumber = 1;
            }
            firstNumber = secondNumber;
            secondNumber = sum;
        }
        return fibonaciNumber;
    }
}
