package com.playground;

public class MyFactorial {
    public static void main(String[] args) {
        System.out.println(myFactorial(2));
        System.out.println(myFactorial(3));
        System.out.println(myFactorial(0));
        System.out.println(myFactorial(5));
    }
    public static int myFactorial(int num) {
        int factorial = num;
        int nextNum = num-1;
        if (num <= 0) {
            return 0;
        }
        while (nextNum >= 1 ) {
            /* 3!
            * 3 * 2 * 1
            * */
            factorial *= nextNum ;
           nextNum--;
        }
        return factorial;
    }
}
