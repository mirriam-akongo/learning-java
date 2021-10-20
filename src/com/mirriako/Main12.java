package com.mirriako;

import java.sql.Array;

class Learner{
    int id;
    String name;

    public Learner(int a, String l){
        id = a;
        name = l;
        System.out.println("Learner From the Constructor method");
        System.out.println(a + " : " + l);
    }
    public String displays(){
        return ( "Learner From the displays method "+ +id + " : " + name);
    }
}
public class Main12 {
    public static void main(String[] args) {
        System.out.println("Working with Arrays");
        System.out.println("One dimensional Array");
        int myArray[] = new int[4];
        System.out.println("Default value is Zero");
        System.out.println(myArray[3]);
        myArray[0] = 2;
        myArray[1] = 4;
        myArray[2] = 16;
        myArray[3] = 64;
        System.out.println(myArray[3]);

        System.out.println("To print all the elements in the array use for loop");
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println();
        System.out.println("If you know the values of the Array use below");
        int myArrayb[] = {2, 4, 16, 64};

        System.out.println("Using a for loop to print out each element of the array");
        for (int j = 0; j < myArray.length; j++){
            System.out.println(myArrayb[j]);
        }
        System.out.println("Using a for each or enhanced for loop to print out each element of the array");
        for (int k : myArray){
            System.out.println(k);
        }

        System.out.println();
        System.out.println("Using the for each loop continued");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String k : cars) {
            System.out.println(k);
        }
        /*
        * Working with an array of objects
        * */
        System.out.println();
        System.out.println("Array of Objects");
        Learner l1 = new Learner(1, "Mirriam");
        Learner l2 = new Learner(2, "Mimi");
        Learner l3 = new Learner(3, "Jem");
        Learner l4 = new Learner(4, "Mirriako");
//        Learner learner[] = new Learner[4];
//        learner[0] = l1;
//        learner[1] = l2;
//        learner[2] = l3;
//        learner[3] = l4;

        Learner[] l = {l1, l2, l3, l4};

        System.out.println("Displaying the elements of the array learner Object using a for each loop");
        for (Learner k : l) {
            System.out.println(k.displays());
        }

        System.out.println("Displaying the elements of the array learner Object using a for each loop");
        for (int learner = 0; learner < l.length; learner++){
            System.out.println(l[learner].displays());
        }
    }
}
