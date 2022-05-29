package com.ans2;

public class ExceptionE {
    public static void main(String[] args) {
        System.out.println("Ans: - We can use object downcasting if parent object is pointing to that class object if not \n it throws classexcetion error to resole that we have make an object which points to the class object.\n");
        System.out.println("For example:\n Parent p = new Child();\n Then child override method we can use but if try to usue\n child method unoverriden method we have to downcast it.\n Child c=(Child) p\n And if we use try to downcast the class which not pointing to child class it throws and exception error");
    }
}
