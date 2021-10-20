package com.mum;

public class PrimeCount {
    public static int isPrime (int num) {
        for (int begin = num; begin < num/2; begin++) {
            if (num % begin == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static int primeCount(int start, int end) {

        int count;
        //loop for finding all the numbers in the range
        for (int num2 = start; num2 <= end; num2++) {
            count = 0;
            //check to see if number is prime
//            for (int num2 = 1; num2 <= num; num2++) {
//                if (num % num2 == 0) {
//                    count = count + 1;
//                    continue;
//                }
//            }
//            if(count == 2) {
//                count = count + 1;
//                System.out.println(num);
//            }
            if (isPrime(num2) == 1) {
                count += 1;

            }return count;

//            for (int num2 = 2; num2 < num/2; num2++) {
////                if ((num % num2 == 0)) {
//////                    System.out.println(num);
////                    break;
////                }
//                if (num % num2 == 1) {
////                    System.out.println(num);
//                    count += 1;
//                }
//            }
//            System.out.println( count+1);
        }
//        System.out.println("The cunt" + count);
        return 0;

    }
//    static int primeCount(int start, int end) {
////        int num = 0;
//        int currentNum = 0;
//        int numberOfPrime = 0;
//        for (int num = start; num <= end; num++) {
//            if (num == 0 || num == 1) {
//                break;
//            }
//            if (num == 2) {
//                numberOfPrime += 1;
//            }
//            if ((end % num) == 0) {
//                break;
//            } else {
//                numberOfPrime += 1;
//            }
//            return numberOfPrime;
//        }
//        return 0;
//    }
//    static int primeCount(int start, int end) {
////        int num = 0;
////        int currentNum = 0;
////        int numberOfPrime = 0;
//        for (int num = start; num >= end; num++) {
//            int numberOfPrime = 0;
//            for (int currentNum = start; currentNum >= start; currentNum--) {
//                if (num % currentNum == 0) {
//                    numberOfPrime += 1;
////                    System.out.println(num);
////                    System.out.println(currentNum);
//                }
//
//            }
//            return numberOfPrime;
//        }
//        return 0;
//    }
//    public static int primeCount (int start, int end) {
//        int count = 0;
//        int num = 2;
//        for (num = start; num <= end; num++) {
//            for (int j = 2; j <= num/2; j++) {
//                if ((num % j) == 0) {
//                    count += 1;
//                }
//
//            }if (count == 2){
////                    System.out.println(num);
//            }
//        }
//        return count;
//    }


    public static void main(String[] args) {
        System.out.println("Prime number Count");
        System.out.println("Should return 6 but we get");
        System.out.println(primeCount(10, 30));
//        System.out.println();
//        System.out.println("Should return 6 but we get");
//        System.out.println(primeCount(11,29));
//        System.out.println();
//        System.out.println("Should return 0 but we get");
//        System.out.println(primeCount(20,22));
//        System.out.println();

    }
}
