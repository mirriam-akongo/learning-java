package com.mum;

public class Prime1 {
    public static int primeCount (int start, int end) {
//        For checking if the number is prime or not
        int num = 0;
//        Count the total number of prime numbers
        int count = 0;
//        int k = 0;

        while (start <= end) {
            for (int num2 = 2; num2 < start; num2++) {
                if (start % num2 == 0) {
//                    We increment the nummber if it is an even number
                    num++;
//                    System.out.println(num);
                }
            }
            if (num == 0) {
                count++;
//                System.out.println(count);
            }
            start++;
            num = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Prime number Count");
        System.out.println("Should return 6 but we get");
        System.out.println(primeCount(10, 30));
    }
}
