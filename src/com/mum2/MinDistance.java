package com.mum2;

public class MinDistance {
    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
        System.out.println(minDistance(63));
        System.out.println(minDistance(25));
        System.out.println(minDistance(11));
    }

    public static int minDistance (int n) {
        int min = n;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                for (int j = i+1; j < n; j++) {
                    if (n % j == 0) {
                        if (min > j - i) {
                            min = j - i;
                            System.out.println(j + " and " + i);
                        }
                    }
                }
            }
        }
        return min;
    }
}
