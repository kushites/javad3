package com.ans1;

public interface X {
        abstract void onE();
        default void two(){
                System.out.println("Defualt method of X");
        };
        static void three(){
                System.out.println("Static method of X");
        };
}
