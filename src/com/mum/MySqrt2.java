package com.mum;

public class MySqrt2 {
    public static void main(String[] args) {
        System.out.println("This is the first array");
        int[] a = {11,5,4,20};
//        countSquarePairs(a);
        System.out.println(countSquarePairs2(a));
        System.out.println();
        System.out.println();

        System.out.println("This is the second array");
        int[] b = {9,0,2,-5,7};
//        countSquarePairs(b);
        System.out.println(countSquarePairs2(b));
        System.out.println();
        System.out.println();

        System.out.println("This is the third array");
        int[] c = {9};
//        countSquarePairs(c);
        System.out.println(countSquarePairs2(c));

        System.out.println();
        System.out.println();
        System.out.println("Failing this Test. It must return 0");
        int[] d = {2,7,2,2};
        System.out.println(countSquarePairs2(d));


    }
    public static boolean sqrt4 (int num) {
        int squareRoot = (int) Math.sqrt(num);
        if (squareRoot * squareRoot == num) {
//            System.out.println("This is a Perfect Square");
//            System.out.println(squareRoot);
            return true;
        } else {
//            System.out.println("This is not a Perfect Square");
            return false;
        }

    }



    public static int countSquarePairs2(int[] arr) {
        int noSquarePairs = 0;
        for (int item = 0; item < arr.length; item++) {
            for (int item2 = 1; item2 < arr.length; item2++) {
                /**
                 * Values greater than 0
                 * */
                 if (arr[item] > 0 && arr[item2] > 0 ) {
                    int sum = 0;
                    sum += arr[item] + arr[item2];

                    if (sqrt4(sum)) {
                        if (arr[item] > arr[item2]) {
                            System.out.println(arr[item] + " and " + arr[item2]);
                            noSquarePairs++;
                            System.out.println("Count is  " + noSquarePairs );
                            System.out.println(sum);
                        }


                    }

                } else if (arr[item] == arr[item2]) {
                    return 0;
                 }

            }
        }
//        System.out.println("Not a perfect Square at all");
        return noSquarePairs;
    }


}
