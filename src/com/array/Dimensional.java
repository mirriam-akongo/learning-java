package com.array;

public class Dimensional {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = {13, 2, 89, 55, 10, 6, 1};
        System.out.println("Summing the array");

        for (int i = 0; i < array.length; i++){
            sum += array[i];
            System.out.print(sum + " ");
        }
        System.out.println();

        System.out.println("Returning Array");
        int[] theArray = returnArray();
        for (int number = 0; number < theArray.length; number++) {
            System.out.print(theArray[number] + " ");
        }
    }

    public static int[] returnArray(){
        return new int[]{2,3,7,1,9};
    }
}
