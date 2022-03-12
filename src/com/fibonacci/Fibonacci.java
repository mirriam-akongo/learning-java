package com.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("The Fibonacci sequence in this case is 1,1,2,3,5,8,13,21,34");
        System.out.println("Finding the");
        System.out.println(fibonaccii(3));
        System.out.println(fibonaccii(5));
        System.out.println(fibonaccii(1));
        System.out.println(fibonaccii(8));
//        System.out.println(fibonaccii(0));

        System.out.println("The Fibonacci sequence in this case is 0,1,1,2,3,5,8,13,21,34");
        System.out.println(fibonacciii(3));
        System.out.println(fibonacciii(5));
        System.out.println(fibonacciii(1));
        System.out.println(fibonacciii(8));
        System.out.println(fibonacciii(0));

        System.out.println();
        System.out.println();
        System.out.println("The Fibonacci sequence in this case is 0,1,1,2,3,5,8,13,21,34");
//        System.out.println(fibonacciiii(0));
        System.out.println(fibonacciiii(1));
        System.out.println(fibonacciiii(2));
        System.out.println(fibonacciiii(3));
        System.out.println(fibonacciiii(4));
        System.out.println(fibonacciiii(5));
        System.out.println(fibonacciiii(6));
        System.out.println(fibonacciiii(7));
        System.out.println(fibonacciiii(8));
    }
    public static int fibonaccii (int n) {
        /**
         * * fibonacci
         * Return the value at a given position of the fibonacci series
         * 1,1,2,3,5,8,13,21,34.....
         * ie for n = 3 it should return 2, n = 5 should return 5
         *
         * Similar Qn to => Given a number n, Find the n-th Fibonacci Number.
         * */
        int firstPreviousValue = 1;
        int secondPreviousValue = 1;
        int valueAtN = 0;
        if (n <= 2 && n > 0) {
            return 1;
        }
        /**
         * Since our first value begins with 1, The first position is 1.
         * and we also know the value for the second value,
         * Then our i must begin from 3 coz this is what the sum of the
         * first and second previous values evaluate to
         * */
        for (int i = 3; i <= n; i++) {
            valueAtN = secondPreviousValue + firstPreviousValue;
            firstPreviousValue = secondPreviousValue ;
            secondPreviousValue = valueAtN;
        }
        return valueAtN;
    }

    public static int fibonacciii (int n) {
        /**
         * * fibonacci
         * Return the value at a given position of the fibonacci series
         * 0,1,2,3,5,8,13,21,34.....
         * ie for n = 3 it should return 2, n = 5 should return 5
         * */
        int firstPrevious = 0;
        int secondPrevious = 1;
        int currentValue = 0;

        if (n < 2 && n >= 0) {
            return n;
        }
        /**
         * Since our first value begins with 0, The first position is 0.
         * and the second position is 1
         * then the third Position is 2
         * */
        for (int i = 2; i <= n; i++) {
            currentValue = firstPrevious + secondPrevious;
            firstPrevious = secondPrevious;
            secondPrevious = currentValue;
        }
        return currentValue;
    }

    public static int fibonacciiii (int n) {
        /**
         * 0 1 1 2 3 5 8 13 21
         * return element at that position
         * **/
        int firstVal = 0;
        int secondVal = 1;
        int result = 0;

        if (n == 1) {
            return firstVal;
        }

        if (n == 2) {
            return secondVal;
        }
        for (int i = 3; i <= n; i++) {
            result = firstVal + secondVal;
            firstVal = secondVal;
            secondVal = result;

        }
        return secondVal;
    }
}
