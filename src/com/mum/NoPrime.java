package com.mum;

public class NoPrime {
    public static void main(String[] args) {
        System.out.println("Find out if number is prime");
        System.out.println(isPrimeNo(4));
        System.out.println(isPrimeNo(2));
        System.out.println(isPrimeNo(139));
    }
    private static boolean isPrimeNo(int n) {
        /**
         * Count is the number of factors
         * */
        int noOfFactors = 0;
        boolean prime = false;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    noOfFactors++;
                }
            }
            if (noOfFactors == 2) {
                prime = true;
                System.out.println(n +" Is a prime number");
            } else {
                System.out.println(n + " Is not a prime number");
            }
        }
        return prime;
    }
}
