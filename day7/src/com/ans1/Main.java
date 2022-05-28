package com.ans1;

public class Main {
    public static void main(String[] args) {
        Employee a= new Employee();
        a.name="sanjay";
        a.age= 25;
        a.address="bhopal";
        a.phone_number=7415199183L;
        a.salary=25000;
        a.specialisation="working";
        a.department="science";
        System.out.println("Name: "+a.name);
        System.out.println("Age: "+a.age);
        System.out.println("Address: "+a.address);
        System.out.println("Phone no.: "+a.phone_number);
        a.printSalary();
        System.out.println("Specialisation: "+a.specialisation);
        System.out.println("Department: "+a.department);
        System.out.println("======================================");
        Manager a1= new Manager();
        a1.name="Vishal";
        a1.age=27;
        a1.phone_number=8542620226L;
        a1.address="Nasik";
        a1.salary=250000;
        a1.department="Science";
        a1.specialisation="managing";
        System.out.println("Name: "+a1.name);
        System.out.println("Age: "+a1.age);
        System.out.println("Address: "+a1.address);
        System.out.println("Phone no.: "+a1.phone_number);
        a1.printSalary();
        System.out.println("Specialisation: "+a1.specialisation);
        System.out.println("Department: "+a1.department);

    }


}
