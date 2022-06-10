package com.ans1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date of Birth in dd/mm/yyyy :");
        String date = sc.next();
       try{
           DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
           LocalDate ld = LocalDate.parse(date,dt);
           long ans = ChronoUnit.YEARS.between(ld, LocalDate.now());
           if(0>ans){
               System.out.println("Date should not be of future");
           }
           else {
               System.out.println(ans+" years old");
           }
       }
       catch(Exception e){
         e =new InvalidDateExceptions("Invalid date format");
           System.out.println(e.getMessage());
       }

    }
}
