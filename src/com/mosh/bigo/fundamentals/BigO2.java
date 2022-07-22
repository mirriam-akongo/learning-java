package com.mosh.bigo.fundamentals;

public class BigO2 {
    public static void main(String[] args) {
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        System.out.println(searchValue(letters, 'J'));

        printElements(letters);
    }
    public static boolean searchValue (char[] input, char character) {
        for (int index = 0; index < input.length; index++) {
            if (character == input[index]) {
                return true;
            }
        }
        return false;
    }

    public static void printElements(char[] input) {
        for (char index:
             input) {
            System.out.print(index + " ");
        }
    }
}
