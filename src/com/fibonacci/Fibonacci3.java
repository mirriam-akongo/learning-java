package com.fibonacci;

public class Fibonacci3 {
    public static void main(String[] args) {
//        System.out.println(closestFibonacci(34));
//        System.out.println(closestFib(34));
        System.out.println(closestFib(100));
//        System.out.println(closestFib(33));
    }
    /** *
     * The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and
     * second numbers are 1 and after that n i = n i-2 + n i-1 , e.g., 34 = 13 + 21. A number in the
     * sequence is called a Fibonacci number. Write a method with signature int
     * closestFibonacci(int n) which returns the largest Fibonacci number that is less than or
     * equal to its argument. For example, closestFibonacci(13) returns 8 because 8 is the
     * largest Fibonacci number less than 13 and closestFibonacci(33) returns 21 because 21 is
     * the largest Fibonacci number that is <= 33. closestFibonacci(34) should return 34. If the
     * argument is less than 1 return 0. Your solution must not use recursion because unless you
     * cache the Fibonacci numbers as you find them, the recursive solution recomputes the
     * same Fibonacci number many times
     */
    
    public static int closestFibonacci (int n) {
        int firstVal = 1;
        int secondVal = 1;
        int fibVal = 0;
        boolean fibTrue = false;

        if (n > 0) {
            return 0;
        }

        while (fibVal <= n) {
//            for (int position = 3; position <= n; position++) {
                fibVal = firstVal + secondVal;
                if (fibVal == n ) {
                    fibTrue = true;
                    return fibVal;
                }
//                else  if () {
//
//                }

            fibVal = secondVal;
            secondVal = fibVal;
//            }

        }
        return 0;
    }

    public static int closestFib(int n) {
        int first = 1;
        int second = 1;
        int sum = first + second;

        if (n < 1) {
            return 0;
        }

        while (sum <= n) {
            first = second;
            second = sum;
            if (sum == n) {
                return sum;
            }
            sum = first + second;
        }

        if (sum > n) {
            return second;
        }
        return 0;
    }
}
