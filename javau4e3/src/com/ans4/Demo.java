package com.ans4;

import java.util.Scanner;

public class Demo {
        boolean veriFier(String name, String password, String mobile, String email){
            int c=0;
            if(name.matches("[a-zA-Z]")&&name.length()>=3&&name.length()<=8){
                c++;
            }
            else{
                System.out.println("Fill the valid name!");
            }
            if(password.matches("[a-zA-Z]+\\d")&&password.length()>=3&&password.length()<=8){
                c++;
            }
            else{
                System.out.println("Fill the valid password!");
            }
            if(mobile.matches("[6789]\\d{9}")&&mobile.length()==10){
                c++;
            }
            else{
                System.out.println("Fill the valid mobile no.!");
            }
            if(email.matches("[a-zA-Z]+@+[.]")){
                c++;
            }
            else{
                System.out.println("Fill the valid email address!");
            }
            if(c==4){
               return true;
            }
            else{
                return false;
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String name = sc.next();
        System.out.println("Enter the Password: ");
        String p = sc.next();
        System.out.println("Enter the mobil no.: ");
        String mobile = sc.next();
        System.out.println("Enter the email: ");
        String email = sc.next();
        Demo d = new Demo();
        if(d.veriFier(name, p, mobile, email)){

            Customer c = new Customer(name, p, mobile, email);
            System.out.println(c);
        }
    }
}
