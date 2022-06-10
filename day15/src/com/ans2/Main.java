package com.ans2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
        System.out.println("Enter the Employee name; ");
        String name= sc.next();
        System.out.println("Enter the Employee joining Date(dd/MM/yyyy): ");
        String date = sc.next();
        EmployeeBonus e= new EmployeeBonus();

            double bonus= e.getBonus(date);
            System.out.println(name+" is getting the Bonus of "+bonus );
        }catch (InvalidAgeExceptions io){
            System.out.println(io.getMessage());
        }
        catch (Exception ex) {
            InvalidAgeExceptions id =new InvalidAgeExceptions("Invalid date exception");

            System.out.println(id.getMessage());

        }
    }
}
