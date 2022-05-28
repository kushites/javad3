package com.ans3;

public class Example {
    int example;
    String example1;
    void examPle(){
        this.example=500;

    }
    public static void main(String[] args) {
        System.out.println("Ans: - By this keyword we can call the instance variable and private variable and we can also \n also call the method which is inside this object but we cannot call other class member\n with this keyword. And also we cannot use this keyword in static method ");
    System.out.println("For Example:");
    Example e=new Example();
    e.examPle();
    System.out.println("\nI am using this keyword in method and assigning the value to it:"+e.example);
        System.out.println("\n Ans: - Super inbuilt hidden function of java to call a parent object if we extends some\n class then  by the time we access that class it automatically calls the super function \n it executes the parent function first then comes to the child function. And by Super. method \nwe can access any parent member just like now i am Oject class methods");
       System.out.println("For example: super.equals()");
    }

}
