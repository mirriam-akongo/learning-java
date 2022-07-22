package com.mosh.bigo.objectoriented.encapsulation;

import com.mosh.bigo.objectoriented.encapsulation.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Encapsulating fields");
        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        System.out.println(employee.getBaseSalary());
        int wage = employee.calculateWage(10);
        System.out.println("The employee wage is " + wage);

        Employee employee1 = new Employee();
//        employee1.setBaseSalary(0);
        employee1.setBaseSalary(10_000);
//        employee1.setHourlyRate(0);
        employee1.setHourlyRate(5);
        int wage1 = employee1.calculateWage(9);
        System.out.println("The employee wage is " + wage1);
    }
}
