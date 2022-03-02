package com.wiley.demo;

public class Main {
	public static void main(String[] args) {
		
		Address ad = new Address("Glasgow", "Scotland");
		Employee emp = new Employee("Ryan", 123213, ad);
		
		emp.displayInformation();
	}
}
