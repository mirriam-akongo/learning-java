package com.mirriako;

public class Main14 {
    public static void main(String[] args) {
        System.out.println("Working with a Jagged array");
        System.out.println("It's columns are not fixed");

        int[][] jagged = {{1,2,3}, {3,4,5,6}, {6,7,8,9,10,11}};
        System.out.println("Printing each element of the Jagged array");
        for (int i = 0; i < jagged.length; i++){
            for (int j = 0; j < jagged[i].length; j++){
                //We must include the index of the row since each row has different columns
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Using a for each or enhanced for loop in two dimensional array");
        for (int[] g : jagged){
            for (int h : g){
                System.out.print(h + " ");
            }
            System.out.println();
        }
    }
}
