package com.ans3;

public class ThreadA implements Runnable {


    public static synchronized void getTh() {
        synchronized (ThreadA.class) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        getTh();
    }
}
