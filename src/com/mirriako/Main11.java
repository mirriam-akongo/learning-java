package com.mirriako;

class Outerclass{
    int a;
    public void show(){
        System.out.println("Outer class showing a with value of " + a);
    }

    /** The filename for the class will be
     * Outerclass$Innerclass.class
    */
    class Inner{

        public void display(){
            System.out.println("Display Inner class");
        }
    }

}

public class Main11 {
    public static void main(String[] args) {
        System.out.println("Working with Inner Class");
        System.out.println("Working with a member Inner Class");

        Outerclass outerClass = new Outerclass();
        outerClass.a = 3;
        outerClass.show();

        Outerclass.Inner innerClass = outerClass.new Inner();
        innerClass.display();
    }
}
