package com.ans4;

public class Student extends Person{
    int studid ;
    String courseenrolled;
    int coursefee;

    @Override
    public String toString() {
       return "Student["+"Studentid="+studid+",coursefee= "+coursefee+",courseenroll="+courseenrolled;
    }
}
