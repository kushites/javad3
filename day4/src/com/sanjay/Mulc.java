package com.sanjay;

public class Mulc {
      public  Mulc(){
            System.out.println("Simple class");
        }
      public String Mulc(String s){
           return s;
        }
     public int Mulc(int i){
           return i;
        }
     public float  Mulc(float f){
            return f;
        }
        public static void main(String[] args){
            Mulc d= new Mulc();
            System.out.println(d);
            System.out.println(d.Mulc(1));
            System.out.println(d.Mulc((float) 10.55));
            System.out.println(d.Mulc("Sanjay"));


        }
}
