package com.ans2;

public class Parent {
    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number>=1&&number<=10) {
            this.number = number;
        }
        else{
            System.out.println("Invalid number");
        }
    }

    void method1(){
        System.out.println("number value: "+number);
        System.out.println("method1 from parent class");
    }
   final void method2(){
        System.out.println("method2 from parent class");
    }
   final void method3(){
        System.out.println("method3 from parent class");
    }
}
