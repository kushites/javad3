package com.ans1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(121,"sanjay",520));
        list.add(new Student(122, "vishal", 780));
        list.add(new Student(123, "akshay", 830));
        list.add(new Student(124,"nihal",850));
        list.add(new Student(134,"nakul",870));
        List<Student>newlist=list.stream().filter(s->s.getMarks()>800?true:false).collect(Collectors.toList());
        for(Student s: newlist){
            System.out.println("Student who score more than 800");
            System.out.println(s.getName());
            System.out.println(s.getRoll());
            System.out.println(s.getMarks());
            System.out.println("===================================");
        }


    }
}
