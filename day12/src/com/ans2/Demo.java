package com.ans2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
    public boolean validate(String name, String mobile, String adhar){
        int c=0;

        if(name.matches("[a-zA-z]+")&&name.length()>=3&&name.length()<=8){
            c++;

        }
        else{
            System.out.println("invalid name");
        }

        if(Pattern.matches("[0-9]{12}",adhar)){
            c++;
        }
        else{
            System.out.println("Invalid adhar");
        }


        if(Pattern.matches("[6789][0-9]{9}",mobile)){
            c++;
        }
        else{
            System.out.println("Invalid mobile");
        }
        if(c==3){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");

        String Name=sc.next();
        System.out.println("Enter the Adhar: ");
        String adhar =sc.next();
        System.out.println("Enter the mobile: ");
        String mobile = sc.next();
        Demo d = new Demo();
        boolean b = d.validate(Name, mobile, adhar);
        if(b){
            Citizen c = new Citizen();
            c.setMobilenumber(mobile);
            c.setAadharnumber(adhar);
            c.setName(Name);
            System.out.println(c);
        }
        else{
            System.out.println("Invalid details");
        }

    }

}
