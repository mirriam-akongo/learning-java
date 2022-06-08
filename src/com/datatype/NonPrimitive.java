package com.datatype;

public class NonPrimitive {
    public static void main(String[] args) {
        System.out.println("Working with Strings");
        String str = "This string ";
        String str2 = "has been concantinated.";
        int num = 50;
        String str3 = "49.30";
        str3 = num + str3;
        System.out.println(str + str2);
        System.out.println(str3);
    }
}
