package com.day5;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int roll;
    private String address;
    private int marks;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
//     Student(String name, int roll, String address, int marks){
//
//        this.name=name;
//        this.roll=roll;
//        this.address=address;
//        this.marks=marks;
//
//    }
    Student(){

    }
}
