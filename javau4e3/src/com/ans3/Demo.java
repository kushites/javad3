package com.ans3;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    void showDetails(Month m){
        switch(m){
            case JAN:
                System.out.println("This is the 1st Month of Year January");
                break;
            case FEB:
                System.out.println("This is the 2nd Month of Year February");
                break;
            case MAR:
                System.out.println("This is the 3rd Month of Year March");
                break;
            case APR:
                System.out.println("This is the 4th Month of Year April");
                break;
            case MAY:
                System.out.println("This is the 5th Month of Year May");
                break;
            case JUN:
                System.out.println("This is the 6th Month of Year June");
                break;
            case JUL:
                System.out.println("This is the 7th Month of Year July");
                break;
            case AUG:
                System.out.println("This is the 8th Month of Year August");
                break;
            case SEP:
                System.out.println("This is the 9th Month of Year September");
                break;
            case OCT:
                System.out.println("This is the 10th Month of Year October");
                break;
            case NOV:
                System.out.println("This is the 11th Month of Year November");
                break;
            case DEC:
                System.out.println("This is the 12th Month of Year December");
                break;
            default:
                System.out.println("Fill the valid month");
        }
    }

    public static void main(String[] args) {
       try{
           Demo d = new Demo();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the three letter of Month;");
           Month m = Month.valueOf(sc.next().toUpperCase());

           d.showDetails(m);
       }
       catch(IllegalArgumentException ie){
           System.out.println("Fill the valid month");
       }
    }
}
