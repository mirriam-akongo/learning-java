package com.mum2;

public class CompleteArray {
    public static void main(String[] args) {
        int[] a = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
        int[] a2 = {5, 7, 9, 13};
        int[] a3 = {2, 6, 3, 4};
        int[] a4 = {2,2};

//        System.out.println(containsEvenNo(a));
//        System.out.println(max(a));
//        System.out.println(min(a));
//        System.out.println(min(a2));
//        System.out.println(hasNosBetweenMinMax(min(a), max(a), a));
//        System.out.println(hasNosBetweenMinMax(min(a3), max(a3), a3));
//        System.out.println(isComplete2(a));

        System.out.println(completeArray(a));
        System.out.println(completeArray(a2));
        System.out.println(completeArray(a3));
        System.out.println(completeArray(a4));

//        System.out.println();
//        int[] a2 = {5, 7, 9, 13};
//        System.out.println(containsEvenNo(a2));
    }

    static int isComplete2(int[] a) {
        if (a.length == 0)
            return 0;

        int smallestEven = Integer.MAX_VALUE - 1;
        int largestEven = Integer.MIN_VALUE;
        boolean evenFlag = false;

        for (int anA : a) {
            System.out.println(anA);
            if (anA % 2 == 0) {
                evenFlag = true;
                if (anA > largestEven)
                    System.out.println(largestEven);
                    largestEven = anA;
                if (anA < smallestEven)
                    smallestEven = anA;
                System.out.println(smallestEven);

            }
        }
        System.out.println("current min is " + smallestEven);
        System.out.println("current max is " + largestEven);

        if ((evenFlag && smallestEven == largestEven) || !evenFlag) return 0;

        for (int e = smallestEven; e <= largestEven; e++) {
            boolean flag = false;
            for (int anA : a) {
                if (anA == e) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                return 0;
        }

        return 1;
    }

    public static int completeArray (int[] a) {
        int isComplete = 0;
//        if () {
//            return 0;
//        }
        if (containsEvenNo(a) && min(a) !=  max(a)  && hasNosBetweenMinMax(min(a), max(a), a)) {
//            if (containsEvenNo(a) && min(a) != 0 && max(a) != 0 && hasNosBetweenMinMax(min(a), max(a), a)) {
            isComplete = 1;
        }
        return isComplete;
    }
    public static boolean containsEvenNo (int[] a) {
        boolean hasEven = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                hasEven = true;
            }
        }
        return hasEven;
    }

    public static int max (int[] a) {
        int evenMax = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] > evenMax) {
                    evenMax = a[i];
                }
            }
        }
        return evenMax;
    }

    public static int min (int[] a) {
        int evenFlag = 0;
        int evenMin = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (evenFlag == 0) {
                    evenMin = a[i];
                    evenFlag = 1;
                }
                else if (a[i] < evenMin) {
                    evenMin = a[i];
                }
            }
        }
        return evenMin;
    }

    public static boolean hasNosBetweenMinMax(int min, int max, int[] a) {
        int start = min + 1;
        int end = max -1;
        int range = max - min - 1;
        int count = 0;
        boolean valuesFound = false;
        while (start < end) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == start ) {
                    count++;
                    start++;
                }
            }
            if (count == range) {
                valuesFound = true;
            }

        }
        return valuesFound;
    }
}
