package com.ans1;

public class Main {
    public static void main(String[] args) {
        Bird b = new Parrot();
        b.fly();
        Parrot p= (Parrot) b;
        p.sing();
    }
}
