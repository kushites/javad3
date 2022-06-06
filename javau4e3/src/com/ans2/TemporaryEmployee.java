package com.ans2;

public class TemporaryEmployee extends Employee {

        private int hoursworked;
        private int hourlywaged;
    @Override
    void calculateSalary(){
        salary = hourlywaged*hoursworked;
        }

    public TemporaryEmployee(int employeeid, String employeename, int hoursworked, int hourlywaged) {
        super(employeeid, employeename);
        this.hoursworked = hoursworked;
        this.hourlywaged = hourlywaged;
        calculateSalary();
    }
}
