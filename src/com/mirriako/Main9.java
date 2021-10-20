package com.mirriako;

class Casio {
    // Method Overloading
    public void add(int a, int b){
        System.out.println(a + b);
    }
    public void add(double a, double b){
        System.out.println(a + b);
    }
    public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    int num1;
    int num2;
    String operation;

    // Constructor Overloading
    public Casio(){
        num1 = 0;
        num2 = 0;
        operation = "No operation";
    }
    public Casio( int i){
        num1 = i;
        num2 = 0;
        operation = "No operation";

    }
    public Casio(int i, int j){
        num1 = i;
        num2 = j;
        operation = "No operation";

    }
    public  Casio (int i, int j, String k){
        num1 = i;
        num2 = j;
        operation = k;
    }


}
public class Main9 {
    public static void main(String[] args) {
        System.out.println("Method Overloading");

        Casio myCasio = new Casio();
        myCasio.add(2, 3);
        myCasio.add(2.5, 3.5);
        myCasio.add(3, 5,6);

        // Constructor Overloading
        Casio myConstructor = new Casio();
        System.out.println("First constructor");
        System.out.println(myConstructor.num1);
        System.out.println(myConstructor.num2);
        System.out.println(myConstructor.operation);

        Casio myConstructor2 = new Casio(3);
        System.out.println("Second constructor");
        System.out.println(myConstructor2.num1);
        System.out.println(myConstructor2.num2);
        System.out.println(myConstructor2.operation);

        Casio myConstructor3 = new Casio(3, 6);
        System.out.println("Third constructor");
        System.out.println(myConstructor3.num1);
        System.out.println(myConstructor3.num2);
        System.out.println(myConstructor3.operation);

        Casio myConstructor4 = new Casio(3, 6, "Some Operator");
        System.out.println("Forth constructor");
        System.out.println(myConstructor4.num1);
        System.out.println(myConstructor4.num2);
        System.out.println(myConstructor4.operation);
    }

}
