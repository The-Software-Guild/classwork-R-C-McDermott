package com.wiley.demo;

public class Employee {
	
	private String name;
	private int employeeID;
	private Address address;
	
	public Employee(String name, int employeeID, Address address) {
		this.name = name;
		this.employeeID = employeeID;
		this.address = address;
	}
	
	public void displayInformation() {
		System.out.println(this.name + " " + this.employeeID);
		System.out.println(this.address.getCity() + ", " + this.address.getCountry());
	}
	

}
