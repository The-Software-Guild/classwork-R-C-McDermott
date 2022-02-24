package com.ryan.question1;

public class Truck extends Vehicle {

	public Truck(String model, String registration) {
		super(model, registration);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Type: " + this.getModel() + ", Reg: " + this.getRegistration());
	}
	
	public void displayTruckMessage() {
		System.out.println("I am a Truck class!");
	}
}
