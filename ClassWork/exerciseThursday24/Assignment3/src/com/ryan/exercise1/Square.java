package com.ryan.exercise1;

public class Square implements Fillable {
	
	private double size;
	private String colour;
	
	public Square(double size, String colour) {
		this.size = size;
		this.colour = colour;
	}
	
	
	@Override
	public void fillingColour() {
		System.out.println("Sqaure colour: " + colour);
	}
	
	@Override
	public void size() {
		System.out.println("Square size: " + size);
	}
	

}
