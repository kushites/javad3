package com.ans4;

public class ICICIBank extends Bank {
    double rateofinterest=8;

    @Override
    void displayDetails(){
        branchname="ICICI Bank";
        ifsccode="25255245";
        System.out.println(branchname);
        System.out.println(ifsccode);
        System.out.println(rateofinterest);

    }
}
