package com.ans1;

import java.util.Comparator;

public class Customcom implements Comparator<Product> {
    public int compare(Product a, Product b){
        return (int)(a.getProductprice() - b.getProductprice());
    }

}
