package com.array.gfgarray;

public class CountDistinctElement {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 20, 30};
        System.out.println(distinctCount(a));

        int[] b = {30, 50, 80, 30, 60, 50,80};
        System.out.println(distinctCount(b));

        int[] c = {10, 10, 10, 20, 30};
        System.out.println(distinctCount(c));

        System.out.println();
        System.out.println();
        System.out.println("Working with soln 2");
        System.out.println(distinctCount2(a));
        System.out.println(distinctCount2(b));
        System.out.println(distinctCount2(c));

        System.out.println();
        System.out.println();
        System.out.println("Best Working solution is this 3rd one");
        System.out.println(distinctCount3(a));
        System.out.println(distinctCount3(b));
        System.out.println(distinctCount3(c));
    }

    /**
     * Given an Array count the number of distinct elements
     * */
    public static int distinctCount (int[] arr) {
        int count = 0;
        boolean distinct = true;
        for (int index = 0; index < arr.length; index++) {
            for (int previous = index - 1; previous >= 0; previous--) {
                if (arr[index] == arr[previous]) {
                    distinct = false;
                    break;
                }
            }
            if (distinct == true) {
                count++;

            }
            distinct = true;


        }
        return count;
    }
    
    public static int distinctCount2 (int[] arr) {
//        boolean isDistinct = false;
//        int count = 0;
//        for(int index = 0; index < arr.length; index++) {
//            for (int index2 = 0; index2 < index; index2++) {
//                if (arr[index] == arr[index2]) {
//                    isDistinct = true;
////                    break;
//                }
//            }
//            if (isDistinct == false) {
//                count++;
//            }
//        }
//        return count;

        int count = 0;
        for(int i=0;i<arr.length;i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                System.out.print(arr[i] + " ");
                count++;
            }

        }
        return count;
    }

    public static int distinctCount3 (int[] arr) {
        int count = 0;

        for (int index = 0; index < arr.length; index++) {
            boolean equal = false;
            for (int index2 = 0; index2 < index; index2++) {
                if (arr[index] == arr[index2]) {
                    equal = true;
                    break;
                }
            }
            if (equal == false) {
                count++;
            }
        }
        return count;
    }

}
