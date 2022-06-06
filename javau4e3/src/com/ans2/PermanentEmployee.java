package com.ans2;

public class PermanentEmployee extends Employee{
    private double basicpay;
    @Override
    void calculateSalary(){
        double salary =(double) basicpay*(1.00-(0.12));
        setSalary(salary);
    }
    PermanentEmployee(double basicpay, int Employeeid, String name){

        super(Employeeid,name);
        this.basicpay=basicpay;
        calculateSalary();
    }
}
