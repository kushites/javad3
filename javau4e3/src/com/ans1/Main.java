package com.ans1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      try{
          Scanner sc = new Scanner(System.in);
          int count = 0;
          System.out.println("Enter the number of elements in the array: ");
          count = sc.nextInt();
          int [] arr = new int[count];
          int c=0;
          while(count!=0){

              System.out.println("Enter the elements in the array: ");
              arr[c++]=sc.nextInt();
              count--;
          }
          System.out.println("Enter the index of array that you want to access");
          int n = sc.nextInt();
          int ans = arr[n];
          System.out.println("The array element at index "+n +" = "+arr[n]);
          System.out.println("The array element successfully accessed.");
      }
      catch(ArrayIndexOutOfBoundsException ao){
          System.out.println("java.lang.ArrayIndexOutBoundsException");
      }
      catch(NumberFormatException nfe){
          System.out.println("java.lang.NumberFormatException");
      }
      catch(InputMismatchException ie){
          System.out.println("input mismatch error");
      }
    }
}
