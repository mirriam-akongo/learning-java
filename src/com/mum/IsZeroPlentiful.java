package com.mum;

public class IsZeroPlentiful {
    public static void main(String[] args) {
        int[] a = {0,0,0,0,0};
        System.out.println(isZroPlentiful(a));
        int[] f = {};
        System.out.println(isZroPlentiful(f));
        int[] b = {1,2,0,0,0,0,2,-18,0,0,0,0,0, 12};
        System.out.println(isZroPlentiful(b));
        /**
        int[] b = {1,2,0,0,0,0,2,-18,0,0,0,0,0, 12};
        System.out.println(isZroPlentiful(b));
        int[] g = {0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0};
        System.out.println(isZroPlentiful(g));
        int[] c = {1,2,3,4};
        System.out.println(isZroPlentiful(c));
        int[] d = {1,0,0,0,2,0,0,0,0};
        System.out.println(isZroPlentiful(d));
        int[] e = {0};
        System.out.println(isZroPlentiful(e));
        int[] f = {};
        System.out.println(isZroPlentiful(f));
         */
    }
    static int isZroPlentiful (int[] a) {
        int count = 0;
        boolean isPlentiful = false;
        if (a.length < 4 ) {
            return 0;
        }

        /**
         * Check if the array contains Zero
         */
        while (true) {
            for (int i = 0; i < a.length; i++) {
//            System.out.println(count);
                if (a[i] == 0) {
                    for (int j = i + 1; j < a.length; j++) {
//                    System.out.println(count);
                        if (a[j] == 0) {
                            for (int k = i + 2; k < a.length; k++) {
                                if (a[k] == 0) {
                                    for (int l = i + 3; l < a.length; l++) {
                                        if (a[l] == 0) {
                                            isPlentiful = true;
                                            if (isPlentiful) {
                                                count += 1;
                                                return count;
                                            }
                                        }

                                    }
                                }
                            }

                        }
                    }
                }
            }
        }

//        return count;
    }
}
