package com.ans4;

import java.util.Scanner;

public class Main {
    public static Person generatePerson(Person person){
        Scanner sc = new Scanner(System.in);

        if(person instanceof Teacher){
            Teacher t = (Teacher) person;
            System.out.println("Enter the Person name: ");
            t.name=sc.next();
            System.out.println("Enter the Gender: ");
            t.gender=sc.next();
            System.out.println("Enter the id:");
            t.instructorid= sc.nextInt();
            System.out.println("Enter salary: ");
            t.salary=sc.nextInt();
            return t;

        }
        else{
             Student s = (Student) person;
            System.out.println("Enter the Person name: ");
            s.name=sc.next();
            System.out.println("Enter the Gender: ");
           s.gender=sc.next();
            System.out.println("Enter the id:");
            s.studid= sc.nextInt();
            System.out.println("Enter course: ");
            s.courseenrolled=sc.next();
            System.out.println("Enter Fee:");
            s.coursefee=sc.nextInt();
            return s;
        }
    }

    public static void main(String[] args) {


            Person newStudent = generatePerson(new Student());

            Person newTeacher = generatePerson(new Teacher());

            System.out.println(newStudent);
            System.out.println(newTeacher);

    }
}
