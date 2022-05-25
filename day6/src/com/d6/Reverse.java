package com.d6;

import java.util.Scanner;

public class Reverse {
    public static String reverseString(String a){
        String s="";
        int count=0;

        for(int i=a.length()-1; i>=0; i--){
            s=s+a.charAt(i);

        }
      return s;
    }

    public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        System.out.println("Enter the String for reverse: ");
        String p= d.next();

        String ans =reverseString(p);
        System.out.println("Original String: "+p);
        System.out.println("reverse String: "+ans);
    }
}
