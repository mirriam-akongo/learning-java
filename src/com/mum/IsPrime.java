package com.mum;

import java.util.ArrayList;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Prime number Count");
        System.out.println("Should return 6 but we get");
        System.out.println(primeCount2(10, 30));
        System.out.println("Should return 6 but we get");
        System.out.println(primeCount2(11,29));
        System.out.println();
        System.out.println("Should return 0 but we get");
        System.out.println(primeCount2(20,22));
        System.out.println();
        System.out.println("Should return 0 but we get");
        System.out.println(primeCount2(1, 1));
        System.out.println();
        System.out.println("Should return 1 but we get");
        System.out.println(primeCount2(5, 5));
        System.out.println();
        System.out.println("Should return 0 but we get");
        System.out.println(primeCount2(6, 2));
        System.out.println();
        System.out.println("Should return 3 but we get");
        System.out.println(primeCount2(-10, 6));
        System.out.println();
        System.out.println("Should return 1 but we get");
        System.out.println(primeCount2(0, 2));
        System.out.println();
        System.out.println("Should return 0 but we get");
        System.out.println(primeCount2(0, 1));
        System.out.println();

    }
    public static int primeCount2(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();
        int count = 0;
        System.out.println("Prime numbers between " + start + " and " + end);
        for(int checkNumber = start; checkNumber <= end; checkNumber++ ) {
            boolean isPrime = true;

            for (int factor = 2; factor < checkNumber ; factor++) {
                if (checkNumber % factor == 0) {
                    isPrime = false;
                }
            }

            if (isPrime && (checkNumber >= 2)) {
                primes.add(checkNumber);
                count++;
            }
        }
        System.out.println("Prime numbers are: ");
        for (int number: primes) {
            System.out.print(number + " ");
        }
        System.out.println();
        return count;
    }
}
