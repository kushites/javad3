package com.ans1;

import java.util.AbstractCollection;
import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Account ac =new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Acc: ");
        ac.accountnumber=sc.next();

        System.out.println("Enter The Deposit: ");
        int dep=sc.nextInt();
        ac.depoSit(dep);

        try{
            System.out.println("Enter the Withdraw amount: ");
            int with = sc.nextInt();
            ac.withdraW(with);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
