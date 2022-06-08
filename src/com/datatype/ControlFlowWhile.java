package com.datatype;

public class ControlFlowWhile {
    public static void main(String[] args) {
        System.out.println("Using a while loop");
        System.out.println(isEvenNumber(1));
        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(11));
        System.out.println();
        System.out.println();
        System.out.println();

        /**If the number is Even, print it out the even numbers found
         * in a given range
         * */
        int start = 10;
        int end = 30;
        while (start <= end) {
            if (!isEvenNumber(start)) {
                start++;
                continue;
            }
            System.out.println(start);
            start++;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        /**
         * Modify the while code above.
         * Make it to record the total number of even numbers
         * and  make it to break once 5 are found
         * And finally display the total of the even numbers found
         * */

        start = 10;
        end = 30;
        int sumEvens = 0;
        int count = 0;
        while (start <= end) {
            if (!isEvenNumber(start)) {
                start++;
                continue;
            }
            System.out.println(start);
            count++;
            sumEvens += start;
            if (count == 5) {
                break;
            }
            start++;
        }
        System.out.println("The total of the even nos found is " +count);
        System.out.println("The sum of the 5 evens is " + sumEvens);
    }

    /**
     * Create a method called isEvenNumber that takes a parameter of type int
     * Its purpose is to determine if the argument passed to the method is
     * an even number or not
     * return true if it is even otherwise return false
     * */

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
//            System.out.println(num + " is an Even number");
            return true;
        }
//        System.out.println(num + " is NOT!!! an Even number");
        return false;

    }


}
