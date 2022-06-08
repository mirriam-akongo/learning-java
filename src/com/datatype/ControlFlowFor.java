package com.datatype;

public class ControlFlowFor {
    public static void main(String[] args) {
//        System.out.println(calculateInterest(10000.0, 2));

        /**
         * Using the for statement to call the calculateInterest method with
         * the amount of 10,000 with an interestRate of 2,3,4,5,6,7,8
         * and printing the outputs
         * */
        for (double interest = 2; interest < 9; interest++) {
            System.out.println("10,000 at " + interest +"% interest = " + calculateInterest(10000.0, interest));
        }

        System.out.println();
        System.out.println();

        /**
         * Putting the outputs to only 2 decimal places
         * */
        for (double interest = 2; interest < 9; interest++) {
            /*For only 2 decimal places*/
            System.out.println("10,000 at " + interest +"% interest = " + String.format("%.2f",calculateInterest(10000.0, interest)));
        }

        System.out.println();
        System.out.println();

        /**
         * Modifying the above for loop to start from
         * 8% to work backwards to 2%
         * */
        for (double interest = 8; interest > 1; interest--) {
            /*For only 2 decimal places*/
            System.out.println("10,000 at " + interest +"% interest = " + String.format("%.2f",calculateInterest(10000.0, interest)));
        }

        System.out.println();
        System.out.println();

        System.out.println("Testing prime numbers");
        System.out.println("Is 1 a Prime number ?  " + issPrime(1));
        System.out.println("Is 2 a Prime number ?  " + issPrime(2));
        System.out.println("Is 3 a Prime number ?  " + issPrime(3));
        System.out.println("Is 5 a Prime number ?  " + issPrime(5));
        System.out.println("Is 9 a Prime number ?  " + issPrime(9));
        System.out.println("Is 11 a Prime number ?  " + issPrime(11));

        System.out.println();
        System.out.println();
        System.out.println();

        /**
         * Create a for loop statement using any range of numbers
         * Determine if the number is a prime no using th isPrime method
         * If it is a prime number, print it out and increment a count of  the
         * number of prime numbers found.
         * if that count is 3 exit the loop
         * HINT: Use the break; statement to exit
         * */

        int count = 0;

        for (int nums = 10; nums < 50; nums++) {
            if (issPrime(nums)) {
                System.out.println(nums + " is a prime number");
                count++;

            }
            if (count == 3) {
                break;
            }
        }

    }
    public static double calculateInterest(double amount, double interestRate){
//        double interest = 0.0;
//        for (interestRate = 2; interestRate < 9; interestRate++) {
//            interest = (amount * (interestRate / 100));
//        }
        return (amount * (interestRate / 100));
    }

    /**
     * Finding Prime numbers
     * Remember that a prime number is a number that can be divided by only 1 and itself
     * */
    public static boolean issPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int num = 2; num <= n / 2; num++){
            if (n % num == 0) {
                return false;
            }
        }
        return true;
    }


}
