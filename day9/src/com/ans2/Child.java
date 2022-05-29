package com.ans2;

final class Child extends Parent {
    @Override
    void method1(){
        System.out.println("number value: "+number);
        System.out.println("method1 overriden from child class");
    }
    void method4(){
        System.out.println("method4 from child class");
    }
}
