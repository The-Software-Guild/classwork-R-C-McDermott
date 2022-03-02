package com.ryan.exercise1;

public class Line implements Drawable {

	private double thickness;
	private String colour;
	
	public Line(double thickness, String colour) {
		this.thickness = thickness;
		this.colour = colour;
	}
	
	@Override
	public void thickness() {
		System.out.println("Line thickness: " + thickness);
	}
	
	@Override
	public void drawingColour() {
		System.out.println("Line colour: " + colour);
	}
}
