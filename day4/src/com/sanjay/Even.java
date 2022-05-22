package com.sanjay;

public class Even {
    public void check(int x){
        if(x%2==0){
            while(x%10!=0){
                x++;
            }
            System.out.println(x);
        }
        else if(x<0){
            System.out.println("Error");
        }
        else{
            System.out.println(x);
        }

    }
    public static void main(String[] args){
        Even d= new Even();
        d.check(1);
        d.check(2);
        d.check(-1);
    }

}
