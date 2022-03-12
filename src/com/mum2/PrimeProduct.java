package com.mum2;

public class PrimeProduct {
    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
        System.out.println(isPrimeProduct(21));
        System.out.println(isPrimeProduct(20));

    }

    public static int isPrimeProduct(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i) == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (n % j == 0 && isPrime(j) == 1) {
                        if (i * j == n) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    private static int isPrime(int num) {
        int noOfFactors = 0;
        int prime = 0;
        if (num >= 0) {
            for (int factor = 1; factor <= num; factor++) {
                if (num % factor== 0) {
                    noOfFactors += 1;
                }
            }
            if (noOfFactors == 2) {
//                System.out.println("This is a prime number " + num);
                prime = 1;
//                return 1;
            }
        }
        return prime;
    }
}
