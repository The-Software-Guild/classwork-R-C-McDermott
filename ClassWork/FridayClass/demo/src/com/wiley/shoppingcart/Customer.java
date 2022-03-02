package com.wiley.shoppingcart;

public class Customer {
	
	private String customerName;
	private int customerID;
	private Product[] cart = new Product[5];
	
	public Customer(String customerName, int customerID, Product[] cart) {
		this.customerName = customerName;
		this.customerID = customerID;
		this.cart = cart;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Product[] getCart() {
		return cart;
	}

	public void setCart(Product[] cart) {
		this.cart = cart;
	}
	
	
	
	
}
