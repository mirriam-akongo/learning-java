package com.mirriako;

public class MinDis {
    public static void main(String[] args) {
        System.out.println(minDis(63));
        System.out.println(minDis(25));
        System.out.println(minDis(11));
    }

    public static int minDis (int n) {
        int min = n;
        int nonTrivialFactor = 0;
        int nonTrivialFactorCount = 0;
        for (int i = 2; i < n; i++) {
            if ( n % i == 0) {
                if (nonTrivialFactorCount == 0) {
                    nonTrivialFactor = i;
                }
                nonTrivialFactorCount += 1;

                if (nonTrivialFactorCount > 1) {
                    if (min > i - nonTrivialFactor) {
                        min = i - nonTrivialFactor;
                    }
                    nonTrivialFactor = i;
                }
            }
            if (nonTrivialFactorCount == 1 && i == n - 1) {
                min = i - i;
            }
        }
        if (nonTrivialFactorCount == 0) {
            return -1;
        }
        return min;
    }
}
