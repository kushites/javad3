package com.ans1;

public interface Y {
     void harrY();
    default void potteR(){
        System.out.println("This is Default Potter from Y");
    }
    static void leVine(){
        System.out.println("This is Static Levine from Y");
    }
}
