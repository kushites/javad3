package com.sanjay;
public class Student{
    private int studentRoll;
    private String studentName, studentAddress, collegeName;

    public Student(int studentId, String studentName, String studentAddress)
    {
        this.studentAddress=studentAddress;
        this.studentName=studentName;
        this.studentRoll=studentId;
        this.collegeName="NIT";
    }

    public Student(int studentRoll, String studentName, String studentAddress, String collegeName)
    {
        this(studentRoll, studentName, studentAddress);
        this.collegeName=collegeName;
    }

    public int getStudentRoll()
    {
        return this.studentRoll;
    }

    public String getStudentName()
    {
        return this.studentName;
    }

    public String getStudentAddress()
    {
        return this.studentAddress;
    }

    public String getCollegeName()
    {
        return this.collegeName;
    }
    public static void main(String[] args){
        boolean isnit=false;

        if(isnit==false) {
            Student d = new Student(121, "Sanjay", "Bhopal", "ykbs");
            System.out.println(d.getStudentRoll());
            System.out.println(d.getStudentName());
            System.out.println(d.getStudentAddress());
            System.out.println(d.getCollegeName());
        }
        else{
            Student d1= new Student(121, "sanjay", "Bhopal");
            System.out.println(d1.getStudentRoll());
            System.out.println(d1.getStudentName());
            System.out.println(d1.getStudentAddress());
            System.out.println(d1.getCollegeName());
        }
        System.out.println("==============================================================");
        isnit=true;
        if(isnit==false) {
            Student d = new Student(121, "Sanjay", "Bhopal", "ykbs");
            System.out.println(d.getStudentRoll());
            System.out.println(d.getStudentName());
            System.out.println(d.getStudentAddress());
            System.out.println(d.getCollegeName());
        }
        else{
            Student d1= new Student(121, "sanjay", "Bhopal");
            System.out.println(d1.getStudentRoll());
            System.out.println(d1.getStudentName());
            System.out.println(d1.getStudentAddress());
            System.out.println(d1.getCollegeName());
        }
    }
}