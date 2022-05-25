package com.day5;
import java.util.Scanner;
public class Account {
    private int accountId;
    private String accountType;
    private int balance;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public  int getBalance() {
        return balance;
    }
    public boolean withdraw(int a){
        if(getBalance()<a){
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        else{
            int t=getBalance()-a;
           System.out.println("Balance amount after withdraw:"+t);
           return true;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



}
