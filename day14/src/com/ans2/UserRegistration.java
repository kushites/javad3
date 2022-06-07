package com.ans2;

import java.util.Scanner;

public class UserRegistration {
    void registerUser(String name, String country) throws Exception {
        if(country.equals("india")){
            System.out.println(name+" registered successfully");
        }
        else{
            Exception e = new InvalidCountry(name+" outside the country cannot be registered.");
            throw e;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.next();
        System.out.println("Enter the country: ");
        String country = sc.next();
        UserRegistration us = new UserRegistration();
            try {
                us.registerUser(name, country);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }


    }
}
