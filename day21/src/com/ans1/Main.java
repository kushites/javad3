package com.ans1;

public class Main {
    public static void main(String[] args)  {
        Calculate c = new Calculate();
        Thread th = new Thread(c);
        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.pro);

    }
}
