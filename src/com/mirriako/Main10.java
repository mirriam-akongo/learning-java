package com.mirriako;

class Employee{
    int eid;
    String name;
    int eSalary;
    static String ceo;

    /* Initializing a static variable
    * We use a static block
    * It loads once when you load a class
    * */
    static {
        ceo = "Eric";
        System.out.println("In class/ static");
    }

    // Constructor and it loads when you create an object
    public Employee(){
        eid = 10;
        eSalary = 500_000;
        System.out.println("In constructor");
    }

    public  void show(){
        System.out.println("Employee ID : " + eid);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + eSalary);
        System.out.println("Employee CEO : " + ceo);
        System.out.println();
    }
}
public class Main10 {
    public static void main(String[] args) {
        System.out.println("Static Keyword");

        Employee dan = new Employee();
        dan.name = "Dan";
        dan.show();

        Employee mirriam = new Employee();
        mirriam.eid = 1;
        mirriam.name = "Mirriam";
        mirriam.eSalary = 1_500_000;
        mirriam.ceo = "Mirriako";
        mirriam.show();


        Employee jem = new Employee();
        jem.eid = 2;
        jem.name = "Jem";
        jem.eSalary = 2_000_000;
        jem.ceo = "Mimi";
        jem.show();

        //
        System.out.println("Since ceo variable is static we can use the class instead of object");
        Employee martha = new Employee();
        martha.eid = 3;
        martha.name = "Martha";
        martha.eSalary = 1_200_000;


        // We don't need an object for the ceo variable
        Employee.ceo = "Akongo";

        mirriam.show();
        jem.show();
        martha.show();
    }
}
