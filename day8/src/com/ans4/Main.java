package com.ans4;

public class Main {
    public static void main(String[] args) {
        Animal [] a = new Animal[3];
        a[0]=new Dog();
        a[1]=new Cat();
        a[2]=new Tiger();
     for(Animal a1: a){

         a1.makeNoise();
         a1.eat();
         a1.walk();
         System.out.println("==========");
     }
    }
}
