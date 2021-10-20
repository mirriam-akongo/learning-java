package com.mum;

class Prime22 {
//    int start;
     int primeCount(int start, int end) {

        int num = 0;
        int num2 = 0;
        String primeNumbers = "";
        int count = 0;
//        this.start = start;


        for (num = start; num <= end; num++) {
            int counter = 0;
            for (num2 = num; num2 >= 1; num2--) {
                if (num % num2 == 0) {
                    counter += 1;
                    System.out.println(num);
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + num + " ";
                count = count + 1;
                System.out.println();
            }
            System.out.println(primeNumbers);
            return count;
        }
        System.out.println(primeNumbers);
        return count;


    }

}
public class Prime2 {
    public static void main(String[] args) {
        Prime22 prime = new Prime22();
        System.out.println("Prime number Count");
        System.out.println("Should return 6 but we get");
        System.out.println(prime.primeCount(10, 30));
//        System.out.println(primeCount(1, 100));
    }

}
