package com.mosh.bigo.objectoriented.encapsulation;

public class Employee {
    /**Encapsulating*/
    private int baseSalary;
    private int hourlyRate;

    /**We need the extraHours will not be fixed to a constant value like the rest*/
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary (int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salaray cannot be Zero or less");
        }
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary () {
        return baseSalary;
    }

    public void setHourlyRate (int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate should be greater than zero");
        }
        this.hourlyRate = hourlyRate;

    }
    public int getHourlyRate () {
        return hourlyRate;
    }
}
