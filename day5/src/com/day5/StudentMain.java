package com.day5;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter no. of Students that you want to enter : ");
        int count= d.nextInt();
//        Student d1= new Student();
        Student[] arr= new Student[count];
        for(int i=0; i<count; i++){
            arr[i]=new Student();
            System.out.println("Enter Student roll: ");
            int r=d.nextInt();
            System.out.println("Enter Student Name: ");
            String n =d.next();
            System.out.println("Enter Student Address: ");
            String a =d.next();
            System.out.println("Enter Student marks: ");
            int m=d.nextInt();
            arr[i].setRoll(r);
            arr[i].setName(n);
            arr[i].setAddress(a);
            arr[i].setMarks(m);
            System.out.println("======================");

        }
        int sum=0;
        for(int i=0; i<count; i++){

            System.out.println("Student Roll: "+arr[i].getRoll());
            System.out.println("Student Name: "+arr[i].getName());
            System.out.println("Student Address: "+arr[i].getAddress());
            System.out.println("Student Marks: "+arr[i].getMarks());
            sum=sum+arr[i].getMarks();
            System.out.println("=======================");
        }
        System.out.println("==================");
        int avg=sum/count;
        System.out.println("Student avg marks:"+avg);
    }

}
