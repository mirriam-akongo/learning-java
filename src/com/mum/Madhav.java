package com.mum;

public class Madhav {
    public static void main(String[] args) {
        int[] a = {2, 1, 1};
        isMadhavArray(a);

//        int[] b = {2, 1, 1, 4, -1, -1};
//        isMadhavArray(b);
//
//        int[] c = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
//        isMadhavArray(c);
//
//        int[] d = {18, 9, 10, 6, 6,6};
//        isMadhavArray(d);
//
//        int[] e = {-6, -3, -3, 8, -5, -4};
//        isMadhavArray(e);
//
//        int[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
//        isMadhavArray(f);
//
//        int[] g = {3, 1, 2, 3, 0};
//        isMadhavArray(g);
    }
    public static int isMadhavArray(int a[]) {
        int lengthCounter = 0;
        int arrayLength = a.length;
        /** Counter for sub Arrays*/
        for (int index = 0; index < arrayLength; index++ ) {
            int madhavLength = index * (index + 1) / 2;
            if (madhavLength == arrayLength) {
                System.out.println("Length Matches");
                lengthCounter = 1;
            }

            else {
                System.out.println("Length doesn't match");
                return 0;
            }
            System.out.println("Hallo");
        }


        return 1;
    }
}
