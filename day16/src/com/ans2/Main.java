package com.ans2;

import com.ans1.Product;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Employee> emp=new TreeSet<>(new Salaryc());
        for(int i=1; i<=4; i++){
            Employee em = new Employee();
            System.out.println("Enter Employee id:");
            em.setEmpid(sc.nextInt());

            System.out.println("Enter the Employee Name: ");
            em.setEmpname(sc.next());

                System.out.println("Enter the Salary: ");
                em.setSalary(sc.nextInt());

            System.out.println("=============================");

           emp.add(em);

        }
        for(Employee e : emp){
            System.out.println("Employee id: "+e.getEmpid());
            System.out.println("Employee name: "+e.getEmpname());
            System.out.println("Employee Salary: "+e.getSalary());
            System.out.println("=========================================");
        }
    }
}
