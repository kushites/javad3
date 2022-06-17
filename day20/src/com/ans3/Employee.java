package com.ans3;

public class Employee {
    private int empid;
    private String empname;
    private int salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
    Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
