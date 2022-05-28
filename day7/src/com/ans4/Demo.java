package com.ans4;

import java.util.Scanner;

public class Demo {
    public static Bank geBankdetails(String x){
        if(x.equals("axis")){
            AxisBank ax=new AxisBank();
            return ax;
        }
        else if(x.equals("icici")){
            ICICIBank ic=new ICICIBank();
            return ic;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Bank");
        String re=sc.next();

        if(re.equals("axis")) {
            Bank b = geBankdetails(re);
            b.displayDetails();
        } else if (re.equals("icici")) {
            Bank b = geBankdetails(re);

            System.out.println("==============================");
            b.displayDetails();
        }
        else{
            System.out.println("Either enter icici or axis");
        }


    }

}
