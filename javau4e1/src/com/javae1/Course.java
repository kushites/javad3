package com.javae1;
import java.util.Scanner;
public class Course {
    int courseId;
    String courseName;
    int courseFee;
    void displayCourseDetails(){
            System.out.println("Courseid: "+courseId);
        System.out.println("Coursename: "+courseName);
        System.out.println("CourseFee: "+courseFee);
    }
    static void authenticate(String username, String password){
            if(username.equals("Admin")&&password.equals("1234")){
                Course d = new Course();
                Scanner d1= new Scanner(System.in);
                System.out.println("Enter course id");
                d.courseId=d1.nextInt();
                System.out.println("Enter course name:");
                d.courseName=d1.next();
                System.out.println("Enter course Fee:");
                d.courseFee=d1.nextInt();
                d.displayCourseDetails();

            }
            else{
                System.out.println("Invalid username or password");
            }
    }

    public static void main(String[] args) {
        authenticate("Admin","1234");
        authenticate("admin","25");
    }
}
