package com.string;

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println("Value of IV => " + equivalent("IV"));
        System.out.println("Value of IX => " + equivalent("IX"));
        System.out.println("Value of XL => " + equivalent("XL"));
        System.out.println("Value of XC => " + equivalent("XC"));
        System.out.println("Value of CD => " + equivalent("CD"));
        System.out.println("Value of CM => " + equivalent("CM"));
        System.out.println();
        System.out.println("Value of III => " + equivalent("III"));
    }

    public static int romanNumeral(char roman) {
        switch (roman) {
            case 'I' :
                return 1;

            case 'V' :
                return 5;

            case 'X' :
                return 10;

            case 'L' :
                return 50;

            case 'C' :
                return 100;

            case 'D' :
                return 500;

            case 'M' :
                return 1000;

            default:
                return 0;
        }
    }

    public static int equivalent(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length() ; i++) {
            char currentRomanNumeral = roman.charAt(i);
            int currentValue = romanNumeral(currentRomanNumeral);//
               if ( i == roman.length() - 1 || currentValue >= romanNumeral(roman.charAt(i + 1))) {
//                   if (i == roman.length() - 1 || currentValue >= nextRomanValue) {
                   result += currentValue ;
               }
               else {
                   result -= currentValue ;
               }
//
        }
        return result;
    }
}
