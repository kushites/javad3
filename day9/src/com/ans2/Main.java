package com.ans2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        p.number=sc.nextInt();
        p.method1();
        p.method2();
        p.method3();
        Child c = (Child) p;
        c.method4();
    }
}
