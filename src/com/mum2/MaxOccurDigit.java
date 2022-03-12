package com.mum2;


/**
 * Write a function named maxOccurDigit that returns the digit that occur the most. If there is no such digit, it
 * will return -1. For example maxOccurDigit(327277) would return 7 because 7 occurs three times in the
 * number and all other digits occur less than three times. Other examples:
 * maxOccurDigit(33331) returns 3
 * maxOccurDigit(3232, 6) returns -1
 * maxOccurDigit(5) returns 5
 * maxOccurDigit(-9895) returns 9
 * The function signature is
 * maxOccurDigit(int n)
 * */
public class MaxOccurDigit {
    public static void main(String[] args) {
//        System.out.println(maxOccurDigit(327277));
        System.out.println(maxOccurDigit2(327277));
        System.out.println(maxOccurDigit2(33331));
        System.out.println(maxOccurDigit2(3232));
        System.out.println(maxOccurDigit2(5));
        System.out.println(maxOccurDigit2(-9895));
    }

    public static int maxOccurDigit(int n) {
        int maxCount = 0;
        int maxNumber = 0;
        if (n < 0) {
            n = n * (-1);
        }

        for (int i = 0; i <= 9; i++) {
            int num = n;
            int count = 0;
            while (num > 0) {
                if (num % 10 == i) {
                    count++;
                }
                num = num / 10;
            }
            if (count > maxCount) {
                maxCount = count;
                maxNumber = i;

            } else if (count == maxCount) {
                maxNumber = -1;
            }
        }
        return maxNumber;
    }

    public static int maxOccurDigit2 (int n) {
        int digitCount = 0;
        int digitOccur = 0;

//Make the value positive
        if (n < 0) {
            n = n * (-1);
        }

//Check through the number to see the digits
        for (int digit = 0; digit < 10; digit++) {
            int count = 0;
            int number = n;
            while (number > 0) {
                if (number % 10 == digit) {
                    count++;
                }
                number = number / 10;
            }
            if (count > digitCount) {
                digitCount = count;
                digitOccur = digit;
            }
            else if (count == digitCount){
                digitOccur = -1;
            }
        }
        System.out.print(digitCount + " => ");
        return digitOccur;

    }
}
