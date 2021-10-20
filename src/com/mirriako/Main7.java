package com.mirriako;
class  Calculator{
    int num1;
    int num2;
    int result;

    public int sum(){
        result = num1 + num2;
        return result;
    }

    public int sub(){
        result = num1 - num2;
        return result;
    }

    public int mul(){
        result = num1 * num2;
        return result;
    }

    public int div(){
        result = num1 / num2;
        return result;
    }
}

public class Main7 {
    public static void main(String[] args){
        System.out.println("Creating an Object for a Calculator");
        Calculator theCalc = new Calculator();
        theCalc.num1 = 10;
        theCalc.num2 = 3;

        // Working with Sum
        System.out.println("Printing the initial value of result");
        System.out.println(theCalc.result);
        theCalc.sum();
        System.out.println("Printing the value of result after the method has executed");
        System.out.println(theCalc.result);
        System.out.println("Printing the sum method");
        System.out.println(theCalc.sum());

        // Working with Sub
        System.out.println("Working with sub method");
        System.out.println(theCalc.result);
        theCalc.sub();

        System.out.println("Printing the value of result after the sub method has executed");
        System.out.println(theCalc.result);

        System.out.println("Printing the sub method");
        System.out.println(theCalc.sub());

        // Working with Mul
        System.out.println("Working with mul method");
        System.out.println(theCalc.result);
        theCalc.mul();

        System.out.println("Printing the value of result after the mul method has executed");
        System.out.println(theCalc.result);

        System.out.println("Printing the mul method");
        System.out.println(theCalc.mul());

        // Working with Div
        System.out.println("Working with div method");
        System.out.println(theCalc.result);
        theCalc.div();

        System.out.println("Printing the value of result after the div method has executed");
        System.out.println(theCalc.result);

        System.out.println("Printing the div method");
        System.out.println(theCalc.div());
    }
}
