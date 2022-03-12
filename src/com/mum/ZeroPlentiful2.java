package com.mum;

public class ZeroPlentiful2 {
    public static void main(String[] args) {
        int[] a = {0,0,0,0,0};
        System.out.println(isZroPlentiful(a));

        int[] b = {1,2,0,0,0,0,2,-18,0,0,0,0,0,12};
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

    }
    static int isZroPlentiful (int[] a) {
        int count = 0;
//        boolean isPlentiful = false;
        int timesToCheck = 0;
        if (a.length < 4 ) {
            return 0;
        }

        /**
         * Check if the array contains Zero
         */

        for (int i = 0; i < a.length; i++) {
//            System.out.println(count);
            if (a[i] == 0) {
//                isPlentiful = true;
                count += 1;
//                System.out.println(count);
//                timesToCheck = i + 3;
//                if (timesToCheck < a.length) {
//                    for (int j = i; j <= timesToCheck; j++) {
////                    System.out.println(count);
//                        if (a[j] == 0) {
//                            isPlentiful = true;
//                        }
//                    }
//                    if (isPlentiful) {
//                        count += 1;
//                        System.out.println("Times to check " + timesToCheck);
//                    }
//                    i = timesToCheck + 1;
//                }
            }
            else if ( count >= 4) {
                timesToCheck += 1;
                count = 0;
            }
            else if (count > 0){
                return 0;
            }

        }
        if ( count >= 4) {
            timesToCheck += 1;
//                count = 0;
        }

//        return count;
        return timesToCheck;
    }
}
