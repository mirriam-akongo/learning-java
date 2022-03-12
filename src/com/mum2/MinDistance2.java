package com.mum2;


/**
 * Write a function named minDistance that returns the smallest distance between two non-
 * trivial factors of a number. For example, consider 63. Its non-trivialfactors are 3, 7, 9 and 21.
 * Thus minDistance(63) would return 2 because the smallest distance between any two non-trivial
 * factors is 2 (9 - 7 = 2). As another example, minDistance (25) would return 0 because 25 has
 * only one non-trivial factor: 5. Thus the smallest distance between any two non-trivial factors is 0 (5 - 5 =
 * 0). Note that minDistance(11) would return -1 since 11 has no non-trivial factors.
 * The function signature is
 * int minDistance(int n)
 * */
public class MinDistance2 {
    public static void main(String[] args) {
        System.out.println(minDistance2(63));
        System.out.println(minDistance2(25));
        System.out.println(minDistance2(11));
    }

    public static int minDistance2(int n) {
        int min = n;
        int factorCount = 0;
        int factor = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (factorCount == 0) {
                    factor = i;
                }
                factorCount += 1;
                if (factorCount > 1) {
                    if (min > i - factor ) {
                        min = i - factor ;
                    }
                    factor = i;
                }

            }
            if (factorCount == 1 && i == n - 1) {
                min = i - i;
            }

        }
//        if (factorCount == 1) {
//            return 0;
//        }
        if (factorCount == 0 ) {
            return -1;
        }
        return min;
    }
}
