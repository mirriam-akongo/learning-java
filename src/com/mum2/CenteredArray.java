package com.mum2;

public class CenteredArray {
    public static void main(String[] args) {
        int[] a = {5, 3, 3, 4, 5};
        System.out.println(isCentered(a));

        int[] a2 = {3, 2, 1, 4, 5};
        System.out.println(isCentered(a2));
    }

    public static int isCentered (int[] a) {
        if (a.length < 1) {
            return 0;
        }
//        if (a.length < 1 && a.length % 2 == 0) {
//            return 0;
//        }
        System.out.println(a.length/2);
        for (int i = 0; i < a.length; i++) {
            if (a.length % 2 == 0) {
                return 0;
            }
            if (a.length % 2 == 1) {
                if (a[i] <= a[a.length/2] && i != a.length/2 ) {
                    return 0;
                }

            }

        }
        return 1;
    }
}
