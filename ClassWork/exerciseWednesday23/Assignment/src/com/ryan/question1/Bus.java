package com.ryan.question1;

public class Bus extends Vehicle {

	public Bus(String model, String registration) {
		super(model, registration);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Type: " + this.getModel() + ", Reg: " + this.getRegistration());
	}
	
	public void displayBusMessage() {
		System.out.println("I am a Bus class!");
	}
}
