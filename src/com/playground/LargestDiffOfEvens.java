package com.playground;

public class LargestDiffOfEvens {
    public static void main(String[] args) {
        System.out.println("Working with Largest difference of evens");
        int[] arr = {1, 3, 5, 9};
        System.out.println(largestDiffOfEvens(arr));
        System.out.println();

        int[] arr2 = {1, 18, 5, 7, 33};
        System.out.println(largestDiffOfEvens(arr2));
        System.out.println();

        int[] arr3 = {2, 2, 2, 2};
        System.out.println(largestDiffOfEvens(arr3));
        System.out.println();

        int[] arr4 = {1, 2, 1, 2, 1, 4, 1, 6, 4};
        System.out.println(largestDiffOfEvens(arr4));
        System.out.println();

        int[] arr5 = {-2, 3, 4, 9};
        System.out.println(largestDiffOfEvens(arr5));
    }
    /**
     * Write a function named largestDifferenceOfEvens which returns the largest
     * difference between even valued elements of its array argument.
     * For example largestDifferenceOfEvens(new int[ ]{-2, 3, 4, 9}) returns 6 = (4 - (-2)).
     * If there are fewer than 2 even numbers in the array, largestDifferenceOfEvens
     * should return -1.
     *
     * If you are programming in Java or C#, the function signature is
     * int largestDifferenceOfEvens(int[ ] a)
     *
     * If you are programming in C or C++, the function signature is
     * int largestDifferenceOfEvens(int a[ ], int len) where len is the number of elements
     * in the array a.
     * Examples
     *
     a is
     then function returns
     reason
     {1, 3, 5, 9} returns -1 because there are no even numbers
     {1, 18, 5, 7, 33} returns -1 because there is only one even number (18)
     {[2, 2, 2, 2} returns 0 because 2-2 == 0
     {1, 2, 1, 2, 1, 4, 1, 6, 4} returns 4 because 6 - 2 == 4
     * */
    public static int largestDiffOfEvens (int[] arr) {
        boolean evenValue = false;
        int diffOfEvens = 0;
        int smallestEven = 0;
        int largestEven = 0;
        int evenCount = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 == 0) {

                if (evenCount == 0) {
                smallestEven = arr[index];
                largestEven = arr[index];
                }
                evenCount++;

                if (evenCount >= 1) {
                    if (smallestEven > arr[index]){
                        smallestEven = arr[index];
                    }
                    if (largestEven < arr[index]) {
                        largestEven = arr[index];
                    }
                }

            }

        }

        if (evenCount <= 1) {
            return -1;
        }
        diffOfEvens = largestEven - smallestEven;
        System.out.println(largestEven + " " + smallestEven);
        return diffOfEvens;

    }
}
