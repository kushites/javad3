package com.day3;

public class Marks {
    int roll=121;
    String name= "Sanjay";
    int marks = 56;
    void displayStudentDetails(){
        System.out.println("Roll is: "+roll);
        System.out.println("Name is: "+name);
        System.out.println("Marks is: "+marks);
    }
    public static void main(String[] args){
        Marks d= new Marks();
        d.displayStudentDetails();
        Marks d1 = new Marks();
        d1.roll=123;
        d1.name="ravi";
        d1.marks=65;
        d1.displayStudentDetails();
        d=null;
        d1=null;

    }
}
