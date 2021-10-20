package com.mirriako;

public class Main13 {
    public static void main(String[] args) {
        System.out.println("Two Dimensional Array");
        System.out.println("It's columns are fixed");
        System.out.println("The first array is to indicate the row");
        System.out.println("The second array is to indicate the column");
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Printing array element at the first row and the first column");
        System.out.println(a[0][0]);
        System.out.println("Printing the length of the array");
        System.out.println(a.length);

        for ( int e = 0; e < a.length; e++){
            System.out.println("Outer Array ");
            System.out.println("This represents the outer row at index position  ' " + e + " '");

            for (int f = 0; f < 3; f++){
                // where 3 is the number of columns in the array
//                System.out.print("Inner Array ");
//                System.out.print("This represents the column which is on the row");

                System.out.print(" " + a[e][f]);
            }
            System.out.println();
        }

        System.out.println("Printing the values as matrix format");
        for ( int e = 0; e < a.length; e++){
            for (int f = 0; f < 3; f++){
                System.out.print(" " + a[e][f]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Using a for each or enhanced for loop in two dimensional array");
        for (int[] g : a){
            for (int h : g){
                System.out.print(h + " ");
            }
            System.out.println();
        }

    }
}
