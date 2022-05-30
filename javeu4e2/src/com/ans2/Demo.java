package com.ans2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of student: ");
        int count = sc.nextInt();
        Student[] s= new Student[count];
        int i=0;
        while(count!=0){

            s[i]=new Student();
            System.out.println("Enter the Student roll: ");
            s[i].setRoll(sc.nextInt());
            System.out.println("Enter the Student name");
            s[i].setName(sc.next());
            System.out.println("Enter the Student Address: ");
            s[i].setAddress(sc.next());
            System.out.println("Enter the Student marks: ");
            s[i].setMarks(sc.nextInt());
            System.out.println("======================================");
            i++;
            count--;
        }
        int sum=0;
        for(int j=0; j<s.length; j++){
          int roll=  s[j].getRoll();
         String name=   s[j].getName();
         String add=   s[j].getAddress();
          int marks=  s[j].getMarks();
            System.out.println("Student roll: "+roll);
            System.out.println("Student name: "+name);
            System.out.println("Student address: "+add);
            System.out.println("Student marks: "+marks);
            System.out.println("=========================");
            sum= sum+marks;

        }
        int avg = sum/s.length;
        System.out.println("=============avg==============");
        System.out.println("Avg marks of Students: "+avg);
    }
}
