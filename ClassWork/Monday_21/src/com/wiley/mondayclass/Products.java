package com.wiley.mondayclass;

public class Products {
    int productID;
    String productName;

    public void display() {
        this.productID = 5;
        this.productName = "A name";

        System.out.println(this.productID);
        System.out.println(this.productName);
    }

}
