package com.sanjay;
import java.io.Serializable;

public class Bean implements Serializable  {
  private  int roll=121;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
 private   int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private  int marks;
  public int getRoll(){
      return roll;
  }
  public void setRoll(int value){
      if(0<value&&500>value){
          this.roll=value;
      }
      else{
          System.out.println("Invalid Number");
      }
  }
  public int getMarks(){
      return marks;
  }
  public void setMarks(int value){
      if(18<value&&60>value) {
          this.marks = value;
      }
      else{
          System.out.println("invalid value");
      }
  }
    public  Bean() {

    }
    public  Bean(String name, int age, int roll, int marks){
            this.setName(name);
            this.setAge(age);
            this.setRoll(roll);
            this.setMarks(marks);
            System.out.println(getName());
            System.out.println(getRoll());
            System.out.println(getAge());
            System.out.println(getMarks());
    }
//    public static void main(String[] args) {
////        Bean d=new Bean();
////        Bean d1=new Bean("sanjay",25,121,450);
////
////        System.out.println(d1);
//
//    }
}
