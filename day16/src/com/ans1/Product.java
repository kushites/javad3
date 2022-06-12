package com.ans1;

public class Product {
   private int productid;
   private String productname;
    private double productprice;

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

    public Product(int productid, String productname, double productprice) {
        this.productid = productid;
        this.productname = productname;
        this.productprice = productprice;
    }
  public  Product(){

    }

    @Override
    public String toString() {
        return "Product{" +
                "\nproductid=" + productid +
                ", \nproductname='" + productname + '\'' +
                ", \nproductprice=" + productprice +
                '}';
    }

    public int compareTo(Product pro){
        return this.productname.compareTo(pro.getProductname());
    }
}
