package com.mirriako;

public class Main6 {
    public static void main(String[] args){
        System.out.println("Using continue statement");
        for (int i = 0; i <= 10; i++){
            if (i == 7){
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Using break statement");
        for (int j = 0; j <= 10; j++){
            if (j == 7){
                break;
            }
            System.out.print(j);
        }
    }
}
