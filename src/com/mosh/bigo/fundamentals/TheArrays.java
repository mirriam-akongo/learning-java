package com.mosh.bigo.fundamentals;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 100;
        System.out.println("This returns the address of the object in memory " + numbers);
        System.out.println("To view the actual elements in the array we use \"Arrays.toString(name of the array)\" method  ");
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        System.out.println("Sort the Array");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        String[] greet = {"Hi", "Hey", "Whatsapp", "Good Morning", "Good night"};
        System.out.println(Arrays.toString(greet));
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Two Dimensional Array");
        System.out.println("A 2 by 3 matrix means Two rows and Three columns");
        int[][] dimensional = new int[2][3];
        dimensional[0][0] = 3;
        dimensional[0][1] = 6;
        dimensional[0][2] = 9;
        dimensional[1][0] = 4;
        dimensional[1][1] = 8;
        dimensional[1][2] = 12;

        System.out.println(dimensional);
        System.out.println(Arrays.deepToString(dimensional));

        System.out.println();
        System.out.println();
        int[][] matrix = {{1,2,3}, {5,6,7}};
        System.out.println(Arrays.deepToString(matrix));

        System.out.println();
        System.out.println();
        System.out.println("Constants");
        System.out.println("We use final when declaring our constants");
        final float PI = 3.14159265F;
        System.out.println(PI);

        System.out.println();
        System.out.println();
        System.out.println("CASTING");
        System.out.println("IMPLICIT CASTING");
        short num1 = 1;
        int sum = num1 + 4;
        System.out.println(sum );

        System.out.println();
        System.out.println();
        double x = 2.1;
        double y = x + 2;
        System.out.println(y);

        System.out.println();
        System.out.println();
        System.out.println("EXPLICIT CASTING");
        double a = 3.97;
        int b = (int)a + 6;
        System.out.println(b);

        System.out.println();
        System.out.println();
        System.out.println("Wrapper classes");
        System.out.println("Integer is the wrapper class for int types");
        String value = "3";
        int addition = Integer.parseInt(value) + 2;
        System.out.println(addition);

        System.out.println();
        System.out.println();

        String value2 = "3.145";
        double addDouble= Double.parseDouble(value2) + 5;
        System.out.println(addDouble);

        System.out.println();
        System.out.println();
        math();


    }

    public static void math() {
        System.out.println("Working with the Math class");
        System.out.println("Rounding off a floating point number");
        int value = Math.round(6.8903F);
        System.out.println("Rounding off 6.8903F to  " + value);

        System.out.println();
        System.out.println();
        System.out.println("Working with Ceil it returns the smallest integer that is greater than or equal to the number");
        int smallestInteger = (int) Math.ceil(8.906);
        System.out.println(smallestInteger);

        int smallestInteger2 = (int) Math.ceil(8);
        System.out.println(smallestInteger2);

        System.out.println();
        System.out.println();
        System.out.println("Working with Floor, it is the largest integer that is smaller than or equal to this number");
        int smallerIntegerUsingFloor = (int) Math.floor(8.906F);
        System.out.println(smallerIntegerUsingFloor);
        int smallerIntegerUsingFloor2 = (int) Math.floor(1.1F);
        System.out.println(smallerIntegerUsingFloor2);

        System.out.println();
        System.out.println();
        System.out.println("working with Max");
        int myMax = Math.max(93, 84);
        System.out.println(myMax);

        System.out.println();
        System.out.println();
        System.out.println("working with Min");
        int myMin = Math.min(93, 84);
        System.out.println(myMin);

        System.out.println();
        System.out.println();
        System.out.println("Working with Random");
        double  random =  Math.random();
        System.out.println(random);

        System.out.println();
        System.out.println("If you want to get a number between 0  to 100");
        int random2 = (int) (Math.random() * 100);
        System.out.println(random2);
    }
}
