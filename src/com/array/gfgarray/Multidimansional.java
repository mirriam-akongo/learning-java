package com.array.gfgarray;

public class Multidimansional {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7, 8}};

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
        }
        System.out.println();
        System.out.println();

        /**
         * Printing the array in row Format
         * */

        System.out.println("Printing the array in row Format");
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        /**
         * Working with a Jagged Array and Printing the array in a table Format
         * */
        System.out.println();
        System.out.println();
        System.out.println("Working with a Jagged Array and Printing the array in a table Format");

        int rowSize = 3;
        int[][] jaggedArray = new int[rowSize][];
        for (int row = 0; row < jaggedArray.length; row++) {
            jaggedArray[row] = new int[row + 1];
            for (int column = 0; column < jaggedArray[row].length; column++) {
                jaggedArray[row][column] = row;
                System.out.print(jaggedArray[row][column] + " ");
            }
            System.out.println();
        }
    }
}
