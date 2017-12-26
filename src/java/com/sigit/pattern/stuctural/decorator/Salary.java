package com.sigit.pattern.stuctural.decorator;


public class Salary implements Deducation {
    private int salary;

    public Salary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public int getBaseSalary() {
        return this.salary;
    }

    @Override
    public int getTakeHomePay() {
        return this.salary;
    }
}
