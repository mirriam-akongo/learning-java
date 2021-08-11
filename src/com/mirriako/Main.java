package com.mirriako;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Printing Strings
        System.out.println("Learning Java with Amigos");

        System.out.println();
        System.out.print("Printing a character => ");
        char a = 'A';
        // This is how a character is printed  
        System.out.print(a);
        System.out.println();
        Date date = new Date();
        System.out.println(date);

        System.out.println("Datatypes");
        byte myByte = 127;
        short myShort = 32767;
        int myInt = 2147483647;
        long myLong = 2147483648L;
        float myFloat= 3.14F;
        double myDouble = 3.141434557890087;
        boolean myBoolean = false;
        char myChar = 'A';
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myChar);

        /*
        * Dealing with ASCII
        * American Standard Code for Information Interchange
        * */
        char b = 66;
        System.out.println(b);

        char c = 67;
        System.out.println(c);

        // implicit conversion
        double d = 5;
        System.out.println("implicit conversion " + d);

        //type casting
        int k = (int) 5.5;
        System.out.println("type casting "+ k);
    }
}
