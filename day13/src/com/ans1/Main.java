package com.ans1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try{
           System.out.println("Start of main...");
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter num: ");
           int num1= sc.nextInt();

           System.out.println("Enter num2: ");
           int num2=sc.nextInt();

           String message=null;
           int num3=num1/num2;
           if(num3>10){
               message = "welcome to Exception Handling";
           }
           System.out.println("Message is: "+message.toUpperCase());
           System.out.println("end of main....");
       }
       catch(InputMismatchException im){
           System.out.println("enter the valid num");
       }
       catch(NumberFormatException nfe){
           System.out.println("value should be number");
       }
       catch(NullPointerException ne){
           System.out.println("String value is null");
       }
       catch(ArithmeticException ae){
           System.out.println("num2 should not be zero");
       }

    }

}
