package com.day5;

import java.util.Scanner;

public class AccountDetails {
    public static Account getAccountDetails(){
        Account d1=new Account();
        System.out.println("Enter Account id:");
        Scanner d=new Scanner(System.in);
       d1.setAccountId(d.nextInt());
        System.out.println("Enter Account Type:");
        d1.setAccountType(d.next());
        System.out.println("Enter Balance");
        d1.setBalance(d.nextInt());
        while(d1.getBalance()<0){
            if(d1.getBalance()<0){
                System.out.println("Balance should be Positive");
            }
            System.out.println("Enter Balance");
            d1.setBalance(d.nextInt());


        }

        return d1;
    }
    public static int getWithdrawAmount(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Withdrawn Amount");
        int tango=sc.nextInt();
        while(tango<=0){

            tango=sc.nextInt();
            if(tango<=0){
                System.out.println("Amount Should be Positive");

            }
        }
        return tango;
    }

    public static void main(String[] args) {
        Account acc= new Account();
        acc=getAccountDetails();
        int c= getWithdrawAmount();
        acc.withdraw(c);
    }
}
