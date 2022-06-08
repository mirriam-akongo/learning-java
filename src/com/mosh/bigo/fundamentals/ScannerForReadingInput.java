package com.mosh.bigo.fundamentals;

import java.util.Scanner;

public class ScannerForReadingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old");

        
    }
}
