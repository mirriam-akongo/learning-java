package com.array.gfgarray;

public class Average {
    public static void main(String[] args) {
        System.out.println("Finding the average of an array");
        int[] a = {10, 20, 30,40};
        int[] b = {4, 7, 8, 12};
        System.out.println(findAverage(a));
        System.out.println(findAverage(b));

        int[] c = {1, 2, 3, 4, 5, 6};
        System.out.println(findAverage(c));

        String k = "kx53w7ayx1";
        System.out.println(getSumOfNumbersInString(k));
    }

    public static double findAverage (int[] arr) {
        double total = 0;
//         average = 0;

        for (int index = 0; index < arr.length; index++) {
            total += arr[index];
        }
        System.out.println(total);
        double average = (total / arr.length);
        return average;

            }

    public static int getSumOfNumbersInString (String input) {
        int sum = 0;
        for(int i = 0; i < input.length(); i++) {
//            if(input.charAt(i) < 58 && input.charAt(i) > 47) {
                if(Character.isDigit(input.charAt(i))) {
//                sum += input.charAt(i) - '0';
                    sum += Character.getNumericValue(input.charAt(i));
            }
        }

        return sum;
    }
}
