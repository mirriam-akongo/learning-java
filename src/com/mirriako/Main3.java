package com.mirriako;

public class Main3 {
    public static void main(String[] args){
        System.out.println("Selection Demo");

        System.out.println("Using if else selection statement");
        byte num = 11;
        if (num == 0){
            System.out.println("Zero is neither even nor odd");
        } else if (num % 2 == 0){
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }


        System.out.println("Using a Ternary selection statement");
        int num2 = 4;
        int num3;

        num3 = num2 > 6 ? 1 : 2;
        System.out.println(num3);
    }
}
