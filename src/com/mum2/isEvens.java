package com.mum2;

public class isEvens {
    public static void main(String[] args) {
        System.out.println("Checking if the whole number contains only even numbers");
        System.out.println();
        System.out.println("Number 2426 result is ............" + isEvens(2426));
        System.out.println();
        System.out.println("Number 2426 result is ............" + isEvens(3224));
    }

    public static int isEvens (int number) {
//        int even = 0;
        /**
         * number must be greater than zero
         * */
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return 0;
            }
            number = number / 10;

        }
        return 1;
    }
}
