package com.mum2;

public class HasKSmallFactors {
    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(7, 30));
        System.out.println(hasKSmallFactors(6, 14));
        System.out.println(hasKSmallFactors(6,30));
    }

    public static boolean hasKSmallFactors (int k, int n) {
        boolean isSmall = false;
        for (int u = 1; u < n; u++) {
            if (n % u == 0) {
                int v = n / u;
                if (v * u == n) {
                    if (v < k && u < k) {
                        isSmall = true;
                    }
                }
            }
        }
        return isSmall;
    }
}
