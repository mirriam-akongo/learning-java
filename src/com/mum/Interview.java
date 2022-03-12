package com.mum;

public class Interview {
    public static void main(String[] args) {
//        System.out.println(fibonacci(4));
//        System.out.println(fibonacci2(5 ));
//        System.out.println(fibonacci2(1));
//        System.out.println(fibonacci2(2));
        System.out.println(fibonacci2(0));
        System.out.println(fibonacci2(1));
        System.out.println(fibonacci2(2));
        System.out.println(fibonacci2(3));
        System.out.println(fibonacci2(4));
        System.out.println(fibonacci2(5));
        System.out.println();
        System.out.println();
        System.out.println(fibonacci3(0));
        System.out.println(fibonacci3(1 ));
        System.out.println(fibonacci3(2));

    }
    /**
     * fibonacci*/
    /**
     * 1,1,2,3,5,8,13,21,34.
     *  0 1 1 2 3 5
     * */
     public static int fibonacci(int n) {
         /* n is the position*/
         int position = 0;
         int firstPrevious = 0;
         int secondPrevious = 1;
         int value = 0;

//         while (n > 2) {
             for (position = 1; position <= n; position++ ) {
                 value = firstPrevious + secondPrevious;
             }
             if(value == n) {
                 System.out.println("Fibonacci");
             }

//         }

         return value;
     }
     public static int fibonacci2(int n) {
         if (n < 2) {
             return 1;
         }
         return fibonacci2(n - 1) + fibonacci2(n - 2);
     }
     public static int fibonacci3(int n) {
         int first = 1;
         int second = 1;
         int nthValue = 0;

         if (n <= 2) {
             return 1;
         }

         for (int i = 3; i <= n; i++) {
             nthValue = first + second;
             first = second;
             second = nthValue;
         }
         return nthValue;
     }
}
