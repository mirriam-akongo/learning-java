package com.mirriako;

public class Main2 {
    public static void main(String[] args){
        System.out.println("Operator Demo");
        byte num = 6, num2 = 2;
        int add = num + num2;
        int sub = num - num2;
        int div = num / num2;
        int mul = num * num2;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);

        int n = num;
        n += 3;
        System.out.println(n);

        System.out.println("post increment");
        System.out.println(n);
        n++;
        System.out.println(n);
        System.out.println("pre increment");
        int m=9;
        ++m;
        System.out.println(m);
        System.out.println(m);



    }
}
