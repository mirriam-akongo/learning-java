package com.mirriako;

class OuterClass{
    static int a;
    public static void show(){
        System.out.println("Outer class showing the static a variable  with value of " + a);
    }

    /** The filename for the class will be
     * Outerclass$Innerclass.class
     */
    static class InnerStaticClass{

        public void display(){
            System.out.println("Display the Static Inner class");
        }
    }

}
public class Main11b {
    public static void main(String[] args) {
        System.out.println("Working with Inner Class");
        System.out.println("Working with a Static Inner Class");

        OuterClass outerClass2 = new OuterClass();
        outerClass2.a = 3;
        outerClass2.show();

        OuterClass.InnerStaticClass innerClass = new OuterClass.InnerStaticClass();
        innerClass.display();
    }
}
