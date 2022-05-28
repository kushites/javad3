package com.ans2;

public class Main {
    public static void main(String[] args) {
        DayScholar d= new DayScholar(121,"sanjay",4000);
        d.displayDetails();
        double x=d.payFee();
        System.out.println("total fee: "+x);
        Hosteller h=new Hosteller(235,"vishal",5000);
        System.out.println("==============================");
        h.displayDetails();
        x=h.payFee();
        System.out.println("total fee: "+x);
    }
}
