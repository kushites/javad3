package com.ans1;

import java.util.Comparator;

public class Proid implements Comparator<Product> {

public int compare(Product a, Product b){
    return a.getProductid()-b.getProductid();
}
}
