package com.ans1;

public class Calculate implements Runnable{
        int pro=1;
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            pro = pro*i;
        }
    }

}
