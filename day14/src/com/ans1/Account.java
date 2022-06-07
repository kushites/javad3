package com.ans1;

public class Account {
    String accountnumber;
    double balance;
    void depoSit(int amount){
        balance = amount;

        System.out.println("Deposit Amount in "+accountnumber+" : "+amount);
    }
    void withdraW( int amount) throws Exception {
        if(balance>=amount){
            balance = balance - amount;
            System.out.println("Transaction Successfull\nRemaining Balance: "+balance+"\nWithdrawal Amount: "+amount);
        }
        else{
          Exception  InsufficientFundException = new Exception("Balance is less than the inserted amount!");
            throw InsufficientFundException;
        }
    }
}
