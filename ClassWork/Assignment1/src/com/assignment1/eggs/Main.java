package com.assignment1.eggs;

public class Main {

	public static void main(String[] args) {
		Eggs egg = new Eggs(5234);
		
		System.out.println("Total eggs: " + egg.getEggs());
		System.out.println("Gross: " + egg.getGross());
		System.out.println("Dozen: " + egg.getDozen());
		System.out.println("Remaining: " + egg.getRemainingEggs());
	}

}
