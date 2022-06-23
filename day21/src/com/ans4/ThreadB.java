package com.ans4;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        fun1();
        synchronized (this) {
            this.notify();
        }
        System.out.println("inside run");
    }
    public synchronized void fun1(){
        System.out.println("inside sychronised");
    }
}
