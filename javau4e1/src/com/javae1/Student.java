package com.javae1;
import java.util.Scanner;
public class Student {
    private int rollNumber;
    private String studentName;
    private int marks;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    Student(int roll, String name, int marks){
        Scanner d= new Scanner(System.in);
        System.out.println("Enter Number of Student you want to Enter: ");
        int count =0;
        count = d.nextInt();
        int c=0;
        while(count!=0){

            System.out.println("=========================");
            System.out.println("Enter Roll Number: ");
            this.rollNumber = d.nextInt();
            System.out.println("Enter The Name: ");
            this.studentName=d.next();
            System.out.println("Enter The Marks: ");
            this.marks=d.nextInt();
            System.out.println("Student details "+c);
            System.out.println("Student Roll Number: "+getRollNumber());
            System.out.println("Student Name: "+getStudentName());
            System.out.println("Student Marks: "+getMarks());
            c++;
            count--;
        }
    }
    Student(){

    }
}
