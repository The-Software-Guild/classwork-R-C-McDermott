package com.ryan.height;

public class Main {

	public static void main(String[] args) {
		Height h1 = new Height(5, 14);
		Height h2 = new Height(4, 8);
		Height h3 = new Height(2, 55);
		
		System.out.println("feet: " + h1.getFeet() + " inches: " + h1.getInches());
		System.out.println("feet: " + h2.getFeet() + " inches: " + h2.getInches());
		System.out.println("feet: " + h3.getFeet() + " inches: " + h3.getInches());
	}

}
