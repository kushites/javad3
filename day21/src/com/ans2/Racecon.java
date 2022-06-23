package com.ans2;

public class Racecon {
    public static void main(String[] args) {
        System.out.println("Race-condition:- \nWhen two or more thread running the same task at same time it causes the race condition. ");
        A a = new A();
        Thread t1= new Thread(a);
        Thread t2= new Thread(a);
        t1.start();
        t2.start();

    }
}
