package com.ryan.question1;

public class Vehicle {
	private String model;
	private String registration;
	
	public Vehicle(String model, String registration) {
		this.model = model;
		this.registration = registration;
	}

	public String getModel() {
		return model;
	}

	public String getRegistration() {
		return registration;
	}
	
	public void displayInfo() {
		System.out.println("I am a Vehicle class!");
	}
}
