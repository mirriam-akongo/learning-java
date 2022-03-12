package com.mum;

public class CheckingPrimeNo {
    public static void main(String[] args) {
        System.out.println("Returns 1 if a number is prime");
        System.out.println(checkNoIsPrime(2));
        System.out.println(checkNoIsPrime(4));
        System.out.println(checkNoIsPrime(7));

    }

    public static int checkNoIsPrime(int num) {
        int noOfFactors = 0;
        int prime = 0;
        if (num > 0) {
            for (int factor = 1; factor <= num; factor++) {
                if (num % factor== 0) {
                    noOfFactors += 1;
                }
            }
            if (noOfFactors == 2) {
                System.out.println("This is a prime number " + num);
                prime = 1;
//                return 1;
            }
        }
        return prime;
    }
}
