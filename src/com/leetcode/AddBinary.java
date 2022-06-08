package com.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));

    }
    public static String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        String result = "";
        int sum = 0;
        int carry = 0;

        for (int i = lengthA - 1,  j = lengthB - 1; i >= 0 && j >= 0 ; i--, j--) {
//            for (int j = lengthB - 1; j >= 0; j--) {

//                if (carry == 1) {
//                System.out.println(a.charAt(i));

                    int valueOfChar = 0;
                    if (a.charAt(i) == '1') {
                        valueOfChar = 1;
                    }
                    int value2 = 0;
                    if (b.charAt(j) == '1') {
                        value2 = 1;
                    }
                    sum += valueOfChar;
                    sum += value2;
//                    sum += carry;
//                carry = sum % 2;


                    System.out.println("Sum  " + sum);
//                    if (sum >= 2){
////                        result = sum % 2 + result;
////                        System.out.println(result);
//                        sum = sum % 2;
//                        carry = sum / 2;
//                        sum = carry + sum;
//                    }

                    result = (sum + carry) % 2 + result ;
                    carry = (sum + carry) / 2;

                    System.out.println("This is result " + result );
//                }

//            }
        }
        return result;
    }
}
