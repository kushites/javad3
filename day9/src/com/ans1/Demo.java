package com.ans1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the roll no.: ");
        int roll = sc.nextInt();

        System.out.println("Enter name: ");
        String name= sc.next();
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        Student s = new Student(roll, name, marks);
        System.out.println(s);
        System.out.println("Grade "+s.getGrade());
        System.out.println("==============methodwise calling=====================");
        Student s1= new Student();
        s1.setRoll(roll);
        s1.setName(name);
        s1.setMarks(marks);
        s1.displayDetails();

    }
}
