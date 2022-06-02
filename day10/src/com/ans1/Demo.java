package com.ans1;

import java.util.Scanner;

public class Demo {
    public Hotel provideFood(int amount){
        if(1000<=amount){
            return new TajHotel();
        }
        else if(200<amount && 1000>amount){
            return new RoadSideHotel();
        }
        else{
            System.out.println("Enter the Valid Amount");

            return null;
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        Scanner sc = new Scanner(System.in);
        int amount=0;
        Hotel h=null;
       while(200>=amount){
           System.out.println("Enter the amount: ");
            amount = sc.nextInt();
            h=d.provideFood(amount);
       }
       if(h!=null){
           if(h instanceof TajHotel){
               TajHotel t = (TajHotel) h;
               t.welcomeDrink();
               t.chickenBiryani();
               t.masalaDosa();
           }
           else{
               RoadSideHotel r = (RoadSideHotel) h;
               r.chickenBiryani();
               r.masalaDosa();
           }

       }

    }
}
