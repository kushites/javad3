package com.ans1;

public class Student {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.println("Student roll: "+roll);
        System.out.println("Student name: "+name);
        System.out.println("Student marks: "+marks);
        System.out.println("Student grade: "+calculateGrade(marks));
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    private char calculateGrade(int marks){
        if(500<=marks){

            return  'A';
        }
        else if(500>marks&&400<=marks){
            return 'B';
        }
        else{
            return 'C';
        }
    }
    @Override
   public String toString(){
        return roll+" "+name+" "+marks+" ";
    }
    Student(int roll, String name, int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
        this.grade=calculateGrade(marks);
    }
    Student(){

    }
}
