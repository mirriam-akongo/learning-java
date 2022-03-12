package com.mum2;

public class Hollow {
    public static void main(String[] args) {
        int[] a = {1,2,4,0,0,0,3,4,5};
        System.out.println(isHollow(a));

        int[] a2 = {1,2,0,0,0,3,4,5};
        System.out.println(isHollow(a2));

        int[] a3 = {1,2,4,9, 0,0,0,3,4, 5};
        System.out.println(isHollow(a3));

        int[] a4 = {1,2, 0,0, 3,4};
        System.out.println(isHollow(a4));
    }

    public static int isHollow (int[] a) {
        int nonZeroBefore = 0;
        int zeros = 0;
        int zeroIndex = 0;
        int nonZeroAfter = 0;
        int nonZeroIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                nonZeroBefore += 1;
            }
            if (a[i] == 0) {
                zeroIndex = i;
                break;
            }
        }

        for (int j = zeroIndex; j < a.length; j++) {
            if (a[j] == 0) {
                zeros += 1;
            }
            if (a[j] != 0) {
                nonZeroIndex = j;
                break;
            }
        }

        for (int k = nonZeroIndex; k < a.length; k++) {
            if (a[k] != 0) {
                nonZeroAfter += 1;
            }
            if (a[k] == 0) {
                break;
            }
        }
        if (nonZeroBefore == nonZeroAfter && zeros > 2) {
            return 1;
        }
        return 0;
    }
}
