package com.arraylist.gfgarraylist;

import java.util.ArrayList;

public class ListOfSmallerElements {
    public static void main(String[] args) {
        int[] a = {8, 100, 20, 40, 3, 7};
        System.out.println(smallerElement(a, 10));
        int[] b = {100, 20, 40, 60, 80, 200};
        System.out.println(smallerElement(b, 50));
        int[] c = {10, 40, 80, 30, 20, 15};
        System.out.println(smallerElement(c, 30));
    }

    public static ArrayList<Integer> smallerElement (int[] arr, int k) {
        ArrayList<Integer> smaller = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < k) {
                smaller.add(arr[index]);
            }
        }

        return smaller;
    }

}
