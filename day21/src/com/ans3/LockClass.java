package com.ans3;

public class LockClass {
    public static void main(String[] args) {
        ThreadA tha= new ThreadA();
        Thread t1= new Thread(tha);
        Thread t2= new Thread(tha);
        Thread t3= new Thread(tha);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
