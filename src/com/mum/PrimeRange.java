package com.mum;

public class PrimeRange {

        public static void main (String[] args) {
            int i =0;
            int num =0;
            //Empty String
            String  primeNumbers = "";
            int count = 0;

            for (i = 10; i <= 30; i++) {
                int counter=0;
                for(num = i; num >= 1; num--) {
                    if( i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                    count = count + 1;
                }
            }
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);
            System.out.println();
//            System.out.println(primeNumbers.length());
            System.out.println(count);
        }

}
