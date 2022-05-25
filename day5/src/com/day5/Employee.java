package com.day5;

import java.util.Scanner;

public class Employee {
    private int employeeid;
    private String employeename;
    private double salary, netsalary;

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
    public static int getPfpercentage(){
        System.out.println("Enter pf percentage: ");
        Scanner d2= new Scanner(System.in);
        int pf= d2.nextInt();
        return pf;
    }
    public double getNetsalary() {
        return netsalary;
    }

    public void setNetsalary(double netsalary) {
        this.netsalary = netsalary;
    }
    public void calculateNetSalary(int p){
        double s=getSalary()-(getSalary()/100)*p;
        setNetsalary(s);
    }
    public static void getEmployeed(){
        Employee d= new Employee();
        Scanner d1=new Scanner(System.in);
        System.out.println("Enter your id");
        d.employeeid= d1.nextInt();
        System.out.println("Enter your name");
        d.employeename=d1.next();
        System.out.println("Enter your salary");
        d.salary=d1.nextInt();
        double salary= d.getSalary();
        int p=getPfpercentage();
       d.calculateNetSalary(p);
        System.out.println("---------------------");
        System.out.println(d.getEmployeeid());
        System.out.println(d.getEmployeename());
        System.out.println(d.getSalary());
        System.out.println(d.getNetsalary());
    }


}
