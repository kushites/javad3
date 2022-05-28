package com.ans4;

public class AxisBank extends Bank{
        double rateofinterest=7;
        void getCreditcard(){
            System.out.println("Get Credit Card from the Axix Bank.");
        }
        @Override
    void displayDetails(){
            branchname="Axis loktantra branch";
            ifsccode="2525422";
            System.out.println(branchname);
            System.out.println(ifsccode);
            System.out.println(rateofinterest);
            getCreditcard();
        }
}
