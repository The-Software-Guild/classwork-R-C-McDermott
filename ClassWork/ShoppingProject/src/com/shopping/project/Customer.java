package com.shopping.project;

public class Customer {
	
	private String customerName;
	private int customerID;
	private Product[] cart;
	
	public Customer(String customerName, int customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
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

	public void iterateCart() {
		Product[] cart = this.getCart();
		System.out.println(this.getCustomerName() + "'s cart: ");
		for (int i = 0; i < this.getCart().length; i++) {
			if (cart[i] != null) {
				System.out.println(cart[i].getProductName());
			}
		}
	}

	public double getTotalPrice() {
		Product[] cart = this.getCart();
		double total = 0;
		for (int i = 0; i < this.getCart().length; i++) {
			if (cart[i] != null) {
				total += cart[i].getProductPrice();
			}
		}
		return total;
	}

    public void printCustomerInfo() {
        System.out.println("~~~~~ Customer info ~~~~~");
        System.out.println(this.getCustomerName() + "'s ID: " + this.getCustomerID());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
	
	
}
