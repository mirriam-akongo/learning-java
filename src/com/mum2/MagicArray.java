package com.mum2;

public class MagicArray {
    public static void main(String[] args) {
//        System.out.println(isPrime(5));
//        System.out.println(isPrime(10));
        int[] a = {21, 3, 7, 9, 11 ,4, 6};
        System.out.println(isMagicArray(a));

        System.out.println();
        int[] a2 = {13, 4, 4, 4, 4};
        System.out.println(isMagicArray(a2));

        System.out.println();
        int[] a3 = {10, 5, 5};
        System.out.println(isMagicArray(a3));

        System.out.println();
        int[] a4 = {0, 6, 8, 20};
        System.out.println(isMagicArray(a4));

        System.out.println();
        int[] a5 = {3};
        System.out.println(isMagicArray(a5));

        System.out.println();
        int[] a6 = {8, 5, -5, 5, 3};
        System.out.println(isMagicArray(a6));
    }

    public static int isMagicArray(int[] a) {
        int primeSum = 0;

       for (int i = 0; i < a.length; i++) {
           if (isPrime(a[i]) == 1) {
                primeSum += a[i];
           }
       }

       if (a[0] == primeSum) {
           return 1;
       }
        return 0;
    }

    public static int isPrime(int num) {
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
