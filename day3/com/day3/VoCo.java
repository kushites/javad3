package com.day3;

public class VoCo {
    void check(char x){
       String lower = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String upper= "abcdefghijklmnopqrstuvwxyz";
       boolean v=false;
       for(int i=0; i<lower.length(); i++){
           if(x==(lower.charAt(i))||x==upper.charAt(i)){
                v=true;
                break;
           }
       }
       if(v){
           if(x=='A'|| x=='E'||x=='I'||x=='O'||x=='U'||x=='a'|| x=='e'||x=='i'||x=='o'||x=='u'){
               System.out.println("Charater is vowel");
           }
           else{
               System.out.println("Character is Consonant");
           }
       }
       else{
           System.out.println("Invalid input");
        }
    }
    public static void main(String[] args){
        VoCo d= new VoCo();



        d.check('a');
        d.check('Z');
        d.check('1');
    }
}
