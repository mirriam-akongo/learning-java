package com.leetcode;


public class Sqrt {

        public static int mySqrt(int x) {
            int num;
            if (x > 0){
                num = (int) Math.sqrt(x);
                int num3 = (int) Math.pow(2, num);
                return num;
            }
            return 0;
        }

    public static double myPow(double x, int n) {
        double currentPower = 0;
        if (x > -100 || n < -231){
            currentPower = Math.pow(x, n);
        }
//        if (-100.0 < x < 100.0 && 231 <= n <= 231-1) {
//            currentPower = (double) Math.pow(x, n);
//        }
//        if (-10^4 <= currentPower <= 10^4) {
//            currentPower;
//        }
        return currentPower;

    }

//    public static void main(String[] args) {
//        System.out.println();
//    }

    public static void main(String[] args) {
        System.out.println("Working with the Square root");
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(myPow(2.00000, -2));
    }
}

