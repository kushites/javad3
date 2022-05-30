package com.ans1;

public class RelationShip {
    public static void main(String[] args) {
        System.out.println("Ans : - Is a: - \n This is relation we can say if we extends the parent class to child clas then it is \n 'is-a' relationship.\nFor example:-public class Child extends Parent.");

        System.out.println("Has -a : - if we make an object of any class and use it in another class then it is has a relation ship.\n For example: There are two object one in p and the other b then\n P p =new P; we are using this line in B object then you can use all member P by it is a \n has relationship.");
        System.out.println("\n Access Modifiers:- \n There are four access modifiers:- 1. Public 2. Private 3. Default 4. Protected");
        System.out.println("1. Public:- if we use public it is usable for all package we create in one folder");
        System.out.println("2. Private:- Other classes cannot access this members or classes directly \nbecause it tagged private its used in their own class by making an object. ");
        System.out.println("3. Default :- it is same as protected but if don't give any access modifier so java compiler give the member or class the default access modifier\n we can use these member or classes in same package but cannot use in another packgage. ");
        System.out.println("4. Protected: - it is same as Default but we have to assign it by keyword protected it also not give access to other packages");
         }
}
