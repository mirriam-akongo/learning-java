package com.datatype;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("This isn't really complete though");
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        System.out.println(calcFeetAndInchesToCentimeters(6,8));
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double feetInInches = feet * 12;
            double feetInCentimeters = feetInInches * 2.54;
            double inchesInCentimeters = feetInCentimeters + (inches * 2.54);
            return inchesInCentimeters;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = inches / 12;
            return feet;
        }
        return -1;
    }
}
