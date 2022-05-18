package com.day3;

public class Diff {
    String s= "non-static";
    static String ss="static";
    public static void main(String[] args){
        System.out.println("Diff:-A static method is a method that belongs to a class, but it does not belong to an \ninstance of that class and this method can be called without the instance or object of that class. Every method \nin java defaults to a non-static method without static keyword preceding it. Non-static methods can access\n any static method and static variable, without creating an instance of the object");
        Diff di= new Diff();

        System.out.println("s: "+di.s);
        System.out.println("ss: "+ss);
    }


}
