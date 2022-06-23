package com.ans4;

public class NotifyMe {
    public static void main(String[] args) {
        ThreadB thb = new ThreadB();
        Thread t1= new Thread(thb);
        t1.start();
        synchronized (t1){
            try {
                t1.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("get notify");
    }
}
