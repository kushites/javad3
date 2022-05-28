package com.ans2;

public class Student {
    int studid;
    String studname;
    double examfee;
    void displayDetails(){
            System.out.println("Student id: "+studid);
        System.out.println("Student name: "+studname);
        System.out.println("Student Fee: "+examfee);

    }
    double payFee(){
        return  this.examfee;
    }
    Student(int id, String name, int fee){
        studid=id;
        studname=name;
       examfee=fee;



    }
}
