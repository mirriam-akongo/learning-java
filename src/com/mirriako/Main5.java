package com.mirriako;

public class Main5 {
    public static void main(String[] args){
        System.out.println("Iteration Statements");

        System.out.println("Using a For statement");
        for (int i = 0; i < 5; i++){
            System.out.println("Printing with for loop 5times");
        }
        System.out.println("Using a While statement");
        int x = 0;

        while (x < 5){
            System.out.println("Printing with While loop 5times");
            x++;
        }

        System.out.println("Using a do while loop");
        int y = 0;

        do {
            System.out.println("Printing with a Do While loop");
            y++;
        } while (y < 5);
    }
}
