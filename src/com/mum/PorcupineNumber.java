package com.mum;

public class PorcupineNumber {
    public static void main(String[] args) {
        System.out.println("Working with Primes");
        System.out.println("hmm");
//        System.out.println(isPrime(1));
        isPrime(1);
        System.out.println("First");
        isPrime(2);
//        System.out.println(isPrime(2));
        System.out.println("Second");
        System.out.println(isPrime(3));

    }

    private static int findPorcupineNumber(int n) {
        return 1;

    }

    private static int isPrime(int n) {
        int num = n;
        int count = 0;
        int end = 0;
        boolean isItprime = false;
        String  primeNumbers = "";

//        while (n <= num) {
//            for (int start = n; start >= n + 1; start++) {
        if (n > 1) {
                for(int num2 = 1; num2 <= n; num2++) {
                    if (n % num2 == 0) {
//                        isItprime = false;
                        count++;
                    }
                }
                if (count == 2) {
                    isItprime = true;
                    primeNumbers = primeNumbers + n + " ";
                    System.out.println(primeNumbers);
                    System.out.println(n);
                }

            }
        System.out.println(isItprime);
        System.out.println(primeNumbers);
        return num;
    }
}
