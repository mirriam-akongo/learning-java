package com.mum;

public class IsMartian {
    public static void main(String[] args) {
        int[] a = {1,3};
        System.out.println(isMartian(a));

        int[] b = {1,2,1,2,1,2,1,2,1};
        System.out.println(isMartian(b));

        int[] c = {1,3,2};
        System.out.println(isMartian(c));

        int[] d = {1,3,2,2,1,5,1,5};
        System.out.println(isMartian(d));

        int[] e = {1,2,-18,-18,1,2};
        System.out.println(isMartian(e));

        int[] f = {};
        System.out.println(isMartian(f));

        int[] g = {1};
        System.out.println(isMartian(g));

        int[] h = {2};
        System.out.println(isMartian(h));
    }

    /**
     * Define an
     * array to be a Martian array if the number of 1s is greater than the number of 2s and no two
     * adjacent elements are equal. Write a function named isMartian that returns 1 if its argument
     * is a Martian array; otherwise it returns 0. If you are programming in Java or C#, the function
     * signature is int isMartian(int[ ] a) If you are programming in C or C++, the function signature
     * is int isMartian(int a[ ], int len) where len is the number of elements in the array a. There are
     * two additional requirements. 1. You should return 0 as soon as it is known that the array is
     * not a Martian array; continuing to analyze the array would be a waste of CPU cycles. 2.
     * There should be exactly one loop in your solution. Examples a is then function returns
     * reason {1, 3} 1 There is one 1 and zero 2s, hence the number of 1s is greater than the
     * number of 2s. Also, no adjacent elements have the same value (1 does not equal 3) {1, 2, 1,
     * 2, 1, 2, 1, 2, 1} 1 There are five 1s and four 2s, hence the number of 1s is greater than the
     * number of 2s. Also, no two adjacent elements have the same value.
     * */
    public static int isMartian(int[] a){
        int martain = 0;
        int noOfOnes = 0;
        int noOfTwos = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 1) {
                noOfOnes++;
            }
//            if (a[i] == 1 && a[j] != 1) {
//                noOfOnes++;
//            }

            if (a[i] == 2 ) {
                noOfTwos++;
            }

            if (i < a.length - 1) {
                if (a[i] == a[i + 1]) {
//                    martain = 0;
//                    break;
                    return 0;
                }
            }

        }
        if (noOfOnes > noOfTwos) {
            martain = 1;
        }
        return martain;
    }
}
