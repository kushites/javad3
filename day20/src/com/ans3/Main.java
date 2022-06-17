package com.ans3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <Student> list = new ArrayList<>();
        list.add(new Student(12,"sanjay",500));
        list.add(new Student(15,"Akshay",750));
        list.add(new Student(18,"Malhotra",650));
        list.add(new Student(20,"Varun",400));
        list.add(new Student(13,"Thakur",500));

       List<Employee>list1= list.stream().map(e->new Employee(e.getRoll(),e.getName(),e.getMarks()*1000))
                .collect(Collectors.toList());
        System.out.println(list1);

    }
}
