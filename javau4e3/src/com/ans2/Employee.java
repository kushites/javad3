package com.ans2;

public abstract class Employee {
    protected int employeeid;
    protected String employeename;
    protected double salary;

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    Employee(int employeeid, String employeename){
        this.employeeid=employeeid;
        this.employeename= employeename;
    }
    Employee(){

    }
    abstract void calculateSalary();
}
