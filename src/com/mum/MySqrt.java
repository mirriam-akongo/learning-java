package com.mum;

public class MySqrt {
    public static void main(String[] args) {
//        int number = 4;
//        int squareRoot = (int) Math.sqrt(number);
//        if (squareRoot * squareRoot == number) {
//            System.out.println("This is a Perfect Square");
//        } else {
//            System.out.println("This is not a Perfect Square");
//        }
//        sqrt(4);
       /* System.out.println(sqrt2(4));
        System.out.println();
        System.out.println(sqrt2(2));
        System.out.println();
        System.out.println(sqrt2(16));
        System.out.println();
        System.out.println(sqrt2(8));
*/
        System.out.println("This is the first array");
        int[] a = {11,5,4,20};
//        countSquarePairs(a);
        System.out.println(countSquarePairs(a));
        System.out.println();
        System.out.println();

        System.out.println("This is the second array");
        int[] b = {9,0,2,-5,7};
//        countSquarePairs(b);
        System.out.println(countSquarePairs(b));
        System.out.println();
        System.out.println();

        System.out.println("This is the third array");
        int[] c = {9};
//        countSquarePairs(c);
        System.out.println(countSquarePairs(c));


    }
    public static boolean sqrt (int num) {
        int squareRoot = (int) Math.sqrt(num);
        if (squareRoot * squareRoot == num) {
            System.out.println("This is a Perfect Square");
            System.out.println(squareRoot);
            return true;
        } else {
            System.out.println("This is not a Perfect Square");
            return false;
        }

    }

    public static int sqrt2 (int num) {
        int squareRoot = (int) Math.sqrt(num);
        if (squareRoot * squareRoot == num) {
            System.out.println("This is a Perfect Square");
            System.out.println(squareRoot);
            return 1;
        } else {
            System.out.println("This is not a Perfect Square");
            return 0;
        }

    }

    public static int countSquarePairs(int[] arr) {

//        int number = sqrt(sum);
        int noSquarePairs = 0;
        for (int item = 0; item < arr.length; item++) {
            for (int item2 = 1; item2 < arr.length; item2++) {
//                if ((sum += arr[item] + arr[item2]) ==  ) {
//
//                }
                /**
                 * Values greater than 0
                 * */
                if (arr[item] > 0 && arr[item2] > 0) {
                    int sum = 0;
                    sum += arr[item] + arr[item2];
                    if (sqrt(sum)) {
                        if (arr[item] > arr[item2]) {
                            System.out.println(arr[item] + " and " + arr[item2]);
                            noSquarePairs++;
                            System.out.println("Count is  " + noSquarePairs );
                            System.out.println(sum);

                        }

                    }
                }

            }
        }
        System.out.println("Not a perfect Square at all");
        return noSquarePairs;
    }


}
