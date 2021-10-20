package com.array;
import java.util.Arrays;

import static java.util.Arrays.sort;

class Student {
    int stid;
    String name;

    Student(int stid, String name){
        this.stid = stid;
        this.name = name;
    }
}

public class Institute{
    public static void main(String[] args) {
        Student[] students;
        students = new Student[4];
        students[0] = new Student(1, "Mirriam");
        students[1] = new Student(2, "Jem");
        students[2] = new Student(3, "Zadok");
        students[3] = new Student(4, "Ariko");

        for (int record = 0; record< students.length;record++){
            System.out.println(students[record].stid + " " + students[record].name);
        }

        System.out.println();
        System.out.println("Using Array Methods");
        int[] A = {4,5,2,3,5,7,10};
        System.out.println("Converting the array to String");
        System.out.println(Arrays.toString(A));

        System.out.println("Sort the Array");
       Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }
}