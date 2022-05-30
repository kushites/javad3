package com.ans3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kilometers: ");
        int nokm=sc.nextInt();
        System.out.println("Enter the no. of Passenger: ");
        int nop= sc.nextInt();

        Ola o= new Ola();

        Car mycar = o.bookCar(nop,nokm);

        int re =o.calCulateBill(mycar);
        System.out.println("Total Fare: "+re);
    }
}
