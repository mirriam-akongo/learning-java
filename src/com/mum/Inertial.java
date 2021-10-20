package com.mum;

import java.util.ArrayList;

public class Inertial {
    public static void main(String[] args) {
        System.out.println("Inertial");
        int[] a = {1};
        System.out.println(isIntertial(a));
        System.out.println();
        int[] b = {2};
        System.out.println(isIntertial(b));
        System.out.println();
        int[] c = {1, 2, 3, 4};
        System.out.println(isIntertial(c));
        System.out.println();
        int[] d = {1, 1, 1, 1, 1, 1, 2};
        System.out.println(isIntertial(d));
        System.out.println();
        int[] e = {2, 12, 4, 6, 8, 11};
        System.out.println(isIntertial(e));
        System.out.println();
        int[] f = {2, 12, 12, 4, 6, 8, 11};
        System.out.println(isIntertial(f));
        System.out.println();
        int[] g = {-2, -4, -6, -8, -11};
        System.out.println(isIntertial(g));
        System.out.println();
        int[] h = {2, 3, 5, 7};
        System.out.println(isIntertial(h));
        System.out.println();
        int[] i = {2, 4, 6, 8, 10};
        System.out.println(isIntertial(i));
        System.out.println();
    }
    public static int isIntertial(int[] a) {
        boolean issInertial = false;

            if (isOdd(a) && (max(a) %  2 == 0) && greaterThan(a)) {
                issInertial = true;
                System.out.println("Max is " +  max(a) + " and is even" );
                System.out.println("Pertially inertial");
                return 1;
        }
        System.out.println(issInertial);
        return 0;

    }


    public static boolean greaterThan(int[] arr) {
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        int evenmax = max(arr);
        boolean isgreater = false;

            for (int num = 0; num < arr.length; num++) {

                if (arr[num] % 2 == 1) {

                    odds.add(arr[num]);
                }
                else if (arr[num] % 2 == 0) {
                    if (arr[num] != evenmax) {
                        evens.add(arr[num]);
                    }
                }

            }
        System.out.println(odds);
        System.out.println(evens);

        if (evens.isEmpty()){
            return true;
        } else {
            int minOdd = odds.get(0);
            for (int odd = 1; odd < odds.size(); odd++) {
                if (odds.get(odd) < minOdd) {
                    minOdd = odds.get(odd);
                }
            }

            int maxEven = evens.get(0);
            for (int even = 1; even < evens.size(); even++) {
                if (evens.get(even) > maxEven) {
                    maxEven = evens.get(even);
                }
            }

            if (minOdd > maxEven) {
                isgreater = true;
                System.out.println("This odd is greater than the evens");
            }
        }

        return isgreater;
    }
    public static boolean isOdd(int[] arr) {
        boolean odd = false;

        for (int num = 0; num < arr.length; num++) {
            if (arr[num] % 2 == 1) {
                    odd = true;
            }
        }
        return odd;
    }
    public static int max (int[] arr) {
        int max = arr[0];
        for (int num = 1; num < arr.length; num++){
            if (arr[num] > max) {
                max = arr[num];
            }
        }
        return max;
    }

}
