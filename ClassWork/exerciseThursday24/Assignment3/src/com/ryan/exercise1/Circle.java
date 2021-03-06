package com.ryan.exercise1;

public class Circle implements Fillable {
	private double size;
	private String colour;
	
	public Circle(double size, String colour) {
		this.size = size;
		this.colour = colour;
	}
	
	
	@Override
	public void fillingColour() {
		System.out.println("Circle colour: " + colour);
	}
	
	@Override
	public void size() {
		System.out.println("Circle size: " + size);
	}
	
}
