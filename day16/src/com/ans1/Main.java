package com.ans1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pro=new ArrayList<>();
       for(int i=1; i<=4; i++){
           System.out.println("Enter product id:");
           int id = sc.nextInt();

           System.out.println("Enter the Product Name: ");
           String pname= sc.next();

           System.out.println("Enter the Price: ");
           double price = sc.nextInt();
           System.out.println("========================");
           Product p = new Product(id , pname, price);
           pro.add(p);

       }
        System.out.println("Enter your Selection \n1 for sorting according to Price.\n2 for sorting according to Name.\n3 for sorting according to id.");
        int choice = sc.nextInt();
        if(choice==1){
            Collections.sort(pro, new Customcom());
            System.out.println(pro);
        }
        else if(choice==2){
            Product p= new Product();

                pro.sort(Product::compareTo);
            System.out.println(pro);

        }
        else if(choice==3){
            Collections.sort(pro, new Proid());
            System.out.println(pro);
        }
        else{
            Collections.sort(pro, new Proid());
            System.out.println(pro);
        }
    }

}
