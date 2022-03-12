package com.mum;

import java.util.ArrayList;

public class Porcu {
        public static void main(String[] args) {
            System.out.println("checking for prime number");
//            System.out.println(isPrime(4));
//            System.out.println(isPrime(138));
//            System.out.println(isPrime(139));
//        System.out.println(isPrime(5));
//            System.out.println(isPrime(0));
//            System.out.println(isPrime(0));
//            System.out.println(isPrime(1));
//            System.out.println(isPrime(3));
//            System.out.println(endsWith9(0));
//            System.out.println(endsWith9(18));
//            System.out.println(isPrime(138));
//            System.out.println(endsWith9(138));
//            System.out.println(isPrime(0));
//            System.out.println(nextPrime(0));
//            System.out.println(nextPrime(138))
//            System.out.println(endsWith9(0));
//            System.out.println(isPrimeNo(139));
//            System.out.println(nextPrimes(139));
//            System.out.println(nextPrimes(2));
            System.out.println(isPrime(0));
            System.out.println(isPrime(138));
            System.out.println(isPrime(139));


        }

        private static int isPrime(int n) {
            boolean prime = false;
            int numP = n + 1;
            int porcupine = 0;
            int firstPorcu = 0;
            int primeNo = 0;

            boolean porc1 = false;

//            while (true) {
            while (n < numP) {
                int factor = 0;
                for (int num = 1; num <= numP; num++) {
                    if (numP % num == 0) {
                        factor += 1;
                    }
                }
                if (factor == 2) {
                    prime = true;
                    primeNo = 1;

                    /**
                     * Check if it ends with 9
                     * */
                    if (numP % 10 == 9) {
//                        System.out.println("This ends with 9 " +numP);
                        firstPorcu = numP;
                        porc1 = true;
//                        return porc1;
                        /** Check if next prime ends with 9 */

                        if (nextPrimes(numP) % 10 == 9) {
                            System.out.println("no way");
                            return numP;
                        }

                    }

                }

                numP++;
        }

            return primeNo;
        }

    public static boolean isPrimeNo(int n) {
        /**
         * Count is the number of factors
         * */

        while (true) {
            boolean prime = false;
            int noOfFactors = 0;
//            if (n > 1) {
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        noOfFactors++;
                    }
                }
                if (noOfFactors == 2) {
                    prime = true;
                    System.out.println(n + " Is a prime number");
                }
            return prime;
        }
    }

    private static int nextPrimes (int num) {
            while (true) {
                boolean isPrimme = false;
                int noOfFactors = 0;
                num = num + 1;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        noOfFactors++;
                    }
                }
                if (noOfFactors == 2) {
                    isPrimme = true;
                    return num;
                }

            }
    }
    }




