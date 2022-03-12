package com.playground;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        miniMenu();
    }
    public static void miniMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("************");
        System.out.println("Choose any option you want to be executed");
        System.out.println("1. Fibonacci Series numbers");
        System.out.println("2. Sum of Random digits");
        System.out.println("3. Perfect numbers");
        System.out.println("Enter your choice from the above menu: ");
        int option = input.nextInt();
        System.out.println();

        switch(option) {
            case 1:
                int num1 = 1;
                int num2 = 1;
                int sum = 0;
                System.out.print(num1 + " ," + num2 );
                for (int num3 = 3; num3 <= 10; num3++) {
                    sum = num1 + num2;
                    num1 = num2;
                    num2 = sum;
                    System.out.print(", " + sum);
                }
                break;

            case 2:
                Scanner number = new Scanner(System.in);
                System.out.println("Enter the number you wish to sum it's digits: ");
                int num = number.nextInt();
                int total = 0;
                while (num > 0) {
                    int temp = num;
                    int digit = temp % 10;
                    total += digit;
                    num = temp / 10;
                }
                System.out.println("The sum of " + num + " digits");
                System.out.println(total);
                break;

            case 3:
                Scanner perfect = new Scanner(System.in);
                System.out.println("A perfect number is a number whose factors when summed up adds up to the number itself");
                System.out.println("Enter number");
                int perf = perfect.nextInt();
                int summation = 0;
                for (int i = 1; i < perf; i++) {
                    if (perf % i == 0) {
                        summation += i;
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                if (summation == perf) {
                    System.out.println(perf +  " is a perfect number");
                }
                else {
                    System.out.println(perf + " Not a perfect number");
                }
                break;

            default:
                System.out.println("The number chosen isn't part of the above choices");
                break;

        }
    }
}
