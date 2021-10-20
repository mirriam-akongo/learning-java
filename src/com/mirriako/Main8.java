package com.mirriako;

class A {
    // The variables below are instance variables and
    int val1;
    float val2;
    int val3;

    public A(){
        val1 = 4;
        val2 = 4.1f;
        System.out.println("First Constructor");
        System.out.println("val1: " + val1);
        System.out.println("val2: " + val2);

    }

    /*
    * Local variables
    * */
    public A( int a){
        // Assigning the variable a value
        val1 = a;
        System.out.println("First Constructor");
        System.out.println("val1 and a are equal to : " + a);
        System.out.println("val1 and a are equal to : " + val1);
    }

    public A(int b, float c){
        val1 = b;
        val2 = c;
    }
    /*
    * This represents the current object
    * Using this keyword on the instance variable
    *  to distinguish it from the  local variable
    * */
    public A(int val1, int val3){
        this.val1 = val1;
        this.val3 = val3;
    }
}



public class Main8 {
    public static void main(String[] args) {
        System.out.println("Working with Constructor");
        A firstConstructor = new A();
        System.out.println(firstConstructor);
        System.out.println(firstConstructor.val1);
        System.out.println(firstConstructor.val2);

        A secondConstructor = new A(6);
        System.out.println(secondConstructor);
        System.out.println(secondConstructor.val1);

        A thirdConstructor = new A(7,8.7f);
        System.out.println(thirdConstructor);
        System.out.println(thirdConstructor.val1);
        System.out.println(thirdConstructor.val2);

        A fourthConstructor = new A(9, 10);
        System.out.println("Fourth Constructor");
        System.out.println(fourthConstructor.val1);
        System.out.println(fourthConstructor.val3);
    }
}


