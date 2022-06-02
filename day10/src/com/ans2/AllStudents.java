package com.ans2;

import java.util.Scanner;

public class AllStudents {

    public static void main(String[] args) {
        HistoryStudent h =new HistoryStudent();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of Student");
        h.name=sc.next();
        System.out.println("Enter the address: ");
        h.address=sc.next();
        System.out.println("Enter the History marks: ");
        h.historymarks=sc.nextInt();
        System.out.println("Enter the civics marks: ");
        h.civicsmarks=sc.nextInt();
        h.getPercentage();
        ScienceStudent s=new ScienceStudent();
        System.out.println("Enter the name: ");
        s.name=sc.next();
        System.out.println("Enter the Address: ");
        s.address=sc.next();
        System.out.println("Enter the physics: ");
        s.physicsmarks=sc.nextInt();
        System.out.println("Enter the Chemistry: ");
        s.chemistrymarks=sc.nextInt();
        System.out.println("Enter the maths: ");
        s.mathmarks=sc.nextInt();
        s.getPercentage();
    }
}
