package com.ryan.question1;

public class Car extends Vehicle {

	public Car(String model, String registration) {
		super(model, registration);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Type: " + this.getModel() + ", Reg: " + this.getRegistration());
	}
	
	public void displayCarMessage() {
		System.out.println("I am a Car class!");
	}
}
