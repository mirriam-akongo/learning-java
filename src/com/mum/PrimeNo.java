package com.mum;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("Working with Primes");
        System.out.println("hmm");
//        System.out.println(isPrime(1));
//        isPrime(138);
        isPrime(1);
        isPrime(139);
//        System.out.println("First");
//        isPrime(2);
////        System.out.println(isPrime(2));
//        System.out.println("Second");
////        System.out.println(isPrime(3));
//        isPrime(3);

    }

    private static int findPorcupineNumber(int n) {
        return 1;

    }

    private static int isPrime(int n) {
//        int num = n;
        int num1 = 0;
        int count = 0;
        int end = 0;
        boolean isItprime = false;
        String  primeNumbers = "";

//        while (n <= num) {
//            for (int start = n; start >= n + 1; start++) {
        for ( num1 = n + 1; num1 > n; num1++) {
//            while (  n > -1) {
//        if (num1 > n) {
            for(int num2 = 1; num2 <= num1; num2++) {
                if (num1 % num2 == 0) {
//                        isItprime = false;
                    count++;
                }

            }
            if (count == 2) {
                isItprime = true;
                primeNumbers = primeNumbers + num1 + " ";
                    /**
                     * Check to see if the number has a remainder of 9
                     */
                    if (num1 % 10 == 9) {
                        System.out.println(num1);
                        System.out.println("This number has a remainder of 9");
                    }
                    else {
                        System.out.println("not passing " + num1);
                        continue;
                    }
//                    num1++;

//                System.out.println(primeNumbers);
//                System.out.println(n);
            }

            num1++;


        }
//        if (isItprime){
//            /**
//             * Check to see if the number has a remainder of 9
//             */
//            if (n % 10 == 9) {
//                System.out.println(n);
//            }
//        }
        System.out.println(isItprime);
        System.out.println(primeNumbers);
        return num1;
    }
}
