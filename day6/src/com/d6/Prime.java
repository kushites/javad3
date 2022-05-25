package com.d6;

import java.util.ArrayList;

public class Prime {
    public static boolean prime(int a){
        int c=0;
        for( int i=1; i<=a; i++){
            if(a%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
    }
    public int[] finPrime(int[] arr){
        int[] a=new int[arr.length];
        int c1=0;
        for(int i=0; i<arr.length; i++){
           if(prime(arr[i])){
               a[c1++]=arr[i];

           }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        Prime d = new Prime();
       int[] ans= d.finPrime(arr1);
      if(ans.length==0){
          System.out.println("Prime not found in a Supplied Array");
      }
      else{
          for(int i=0; i<ans.length; i++){
              if(ans[i]!=0) {
                  System.out.println("Prime No. " + ans[i]);
              }
          }
      }
    }
}
