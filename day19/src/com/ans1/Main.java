package com.ans1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student>hm = new HashMap<>();


        hm.put("delhi", new Student(121,"Sanjay",980));
        hm.put("mumbai", new Student(122,"Vishal",780));
        hm.put("Banglore", new Student(125, "Ravi", 450));
        hm.put("Ranchi", new Student(201, "Dhoni",650));
        Map<String, Student>hm1= Compbymarks.sortbymarks(hm);

        for(Map.Entry<String, Student> h:hm1.entrySet()){
            System.out.println("The State is "+h.getKey());
            System.out.println("Name: "+h.getValue().getName());
            System.out.println("Roll: "+h.getValue().getRoll());
            System.out.println("Marks: "+h.getValue().getMarks());
            System.out.println("===================================");
        }
    }
}
