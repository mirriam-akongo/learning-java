package com.datatype;

public class Primitives {
    public static void main(String[] args) {
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;
        byte maxByte = 127;
        byte minByte = -128;
        short maxShort = 32_767;
        short minShort = -32_768;
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;
        System.out.println("Primitive DataTypes");
        System.out.println("Max int value is = " + maxInt);
        System.out.println("Min int value is = " + minInt);
        System.out.println();

        System.out.println("Max byte value is = " + maxByte);
        System.out.println("Min byte value is = " + minByte);
        System.out.println();

        System.out.println("Max short value is = " + maxShort);
        System.out.println("Min short value is = " + minShort);
        System.out.println();

        System.out.println("Max long value is = " + maxLong);
        System.out.println("Min long value is = " + minLong);
        System.out.println();

        byte varByte = 10;
//        byte varByte = 120;
        short varShort = 20;
//        short varShort = 31_346;
        int varInt = 50;
//        int varInt = 1_987_890_654;
        long varLong = (50_000L + 10L * (varByte + varShort + varInt));
        System.out.println("Long Total = " + varLong);

        int intNum = 5 / 3;
        float floatNum = 5f / 3f;
        double doubleNum = 5d / 3d;
        System.out.println("Int Value = " + intNum);
        System.out.println("Float Value = "+ floatNum);
        System.out.println("Double Value = " + doubleNum);
        System.out.println();
        System.out.println();

        double noPounds = 200d;
        double kilograms = 0.45359237d;
        double result = kilograms * noPounds;
        System.out.println(result);

        System.out.println();
        System.out.println();

        System.out.println("Working with Character Char and Boolean");
        char a = 'A';
        System.out.println(a);

        System.out.println("Go to unicode-table.com for more unicode codes");
        char uniCode = '\u00A9';
        System.out.println(uniCode);

        char uniCode2 = '\u00A7';
        System.out.println(uniCode2);

        char uniCode3 = '\uF60D';
        System.out.println(uniCode3);

        boolean bool = true;
        System.out.println("The boolean value is = " + bool);
    }
}
