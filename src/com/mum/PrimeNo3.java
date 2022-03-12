package com.mum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNo3 {


        public static void main(String[] args) {
            System.out.println("checking for prime number");
//            System.out.println(isPrime(4));
//            System.out.println(isPrime(138));
//            System.out.println(isPrime(139));
//        System.out.println(isPrime(5));
//            System.out.println(isPrime(0));
            System.out.println(isPrime(0));
//            System.out.println(endsWith9(0));
        }

        private static boolean endsWith9 (int numP) {
            boolean with9 = false;
            if (isPrime(numP)) {
                if (numP % 10 == 9) {
//                    if (numP % 10 == 9 && (myPorcupine.size() < 3)) {
                    /** Checking the last digit and size of myPorcupine */
//                    System.out.println(numP);
//                        myPorcupine.add(numP);
                with9 = true;
                    System.out.println(numP);

                    /** if ((numP + 1) % 10 == 9) {
                     System.out.println("this is a real Porcupine");
                     porcupine = numP;
                     porc = true;
                     }
                     */
//                        System.out.println(myPorcupine.size());
                    /**   if (numP+1 % 10 ==9) {
                     System.out.println("this is a porcupine");
                     }*/
//                        if (myPorcupine.size() == 2) {
//                            System.out.println("This is a porcupine");
//                            System.out.println(myPorcupine.get(0));
//                            System.out.println(myPorcupine.get(1));
//                            break;
//                        }
//                        myPorcupine.add(numP);
                }
            }
            return with9;
        }
        private static boolean isPrime(int n) {
            boolean prime = false;
            ArrayList<Integer> myPorcupine = new ArrayList<>();
            ArrayList<Integer> myPrimes = new ArrayList<>();

            int[] mraay = new int[1];
            int numP = n + 1;
            int porcupine = 0;
            boolean porc = false;
//        System.out.println(myPorcupine.size());

//            for (numP = n + 1; numP < n + 160; numP++) {

            while (numP > n) {
                int factor = 0;
                for (int num = 1; num <= numP; num++) {
                    if (numP % num == 0) {
                        factor += 1;
//                    System.out.println(n);
                    }
                }
                if (factor == 2) {
                    prime = true;
//                System.out.println("This is a prime number");
                    myPrimes.add(numP);
//                    System.out.println(myPrimes);
                    int nextP = numP + 1;
                    /**
                     * Checking the next element
                    for (int i = 0; i < myPrimes.size(); i++) {

                        for (int j = i + 1; j < myPrimes.size(); j++) {
                            if (myPrimes.get(i) % 10 == 9 && myPrimes.get(j) % 10 == 9) {
                                System.out.println("This could be");
                                System.out.println(myPrimes.get(i) + " " + myPrimes.get(j));
                            }
                        }
                    }
                     */
                    if (numP % 10 == 9  ) {
//                    if (numP % 10 == 9 && (myPorcupine.size() < 3)) {
                        /** Checking the last digit and size of myPorcupine */
//                    System.out.println(numP);
//                        myPorcupine.add(numP);
/**
                        System.out.println(numP);
                        mraay.push();
                        Arrays.push(); */
                    /** */

                        if ((nextP) % 10 == 9) {
                            System.out.println("this is a real Porcupine");
                            porcupine = numP;
                            porc = true;
                        }
//                        System.out.println(myPorcupine.size());
                     /**   if (numP+1 % 10 ==9) {
                            System.out.println("this is a porcupine");
                        }*/
//                        if (myPorcupine.size() == 2) {
//                            System.out.println("This is a porcupine");
//                            System.out.println(myPorcupine.get(0));
//                            System.out.println(myPorcupine.get(1));
//                            break;
//                        }
//                        myPorcupine.add(numP);
                    }

                }
                numP++;
            }
//            System.out.println(numP);
//            return prime;
            System.out.println(porcupine);
            return porc;
        }
    }


