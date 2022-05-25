package com.d6;
import java.lang.*;
public class Args {
    public static void main(String args[]) {
        if(args.length==1){
            int fac=1;
            int si= Integer.valueOf(args[0]);
            for(int i=1; i<=si; i++){
                fac=fac*i;

            }
            System.out.println(fac);
        }
        if(args.length==2){
         int a=Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
         System.out.println("Absolute diff: "+a);
        }
        if(args.length>=3){
            System.out.println("Error");
        }
    }
}
