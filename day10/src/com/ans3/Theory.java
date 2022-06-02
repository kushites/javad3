package com.ans3;

public class Theory {
    public static void main(String[] args) {
        System.out.println("Ans:- Abstract:-\nThis class can have both full method or partial method it support but you can't build object class out of it to\n use this class you have inherit this class in other class which is not abstract. And abstract class can have both incomplete and complete method but normal\n class could have have both.");
        System.out.println("For Example:- 1. you can't make a object of abstract class.\nwrong: Abstract abs = new Abstract();\nif we extends Abstract to Child class then,\nright: Child c = new Child(); , this child can access both child and abstract method also.");
        System.out.println("Interface:- \nThis function can only have abstract method but if you want to use full method then you can use default in access modifier place.\n and only another interface extend the interface and class can implement this interface by instead of \nof extend you have to use implements.");
        System.out.println("For example:- 1. Interface Inf(){ you can use final variable also ,abstract methods}\n2.if you want to implement on class then,\nclass Demo implements Inf(){override inf methods}");
    }
}
