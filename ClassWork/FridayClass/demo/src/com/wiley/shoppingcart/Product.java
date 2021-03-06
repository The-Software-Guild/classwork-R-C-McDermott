package com.wiley.shoppingcart;

public class Product {
	
	private String productName;
	private int productID;
	private double productPrice;
	
	public Product(String productName, int productID, double productPrice) {
		this.productName = productName;
		this.productID = productID;
		this.productPrice = productPrice;
	}
	
	// ~~ Accessor methods ~~
	public String getProductName() {
		return this.productName;
	}

	public int getProductID() {
		return this.productID;
	}
	
	public double getProductPrice() {
		return this.productPrice;
	}

	
	// ~~ Mutator methods ~~
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}
