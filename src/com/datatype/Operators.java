package com.datatype;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Using Operators");
        double num = 20d;
        double num2 = 80d;
        double calc = (num + num2) * 25;
        double remainder = calc % 40;

        if (remainder <= 20) {
            System.out.println("Total was over the limit");
        }
    }
}
