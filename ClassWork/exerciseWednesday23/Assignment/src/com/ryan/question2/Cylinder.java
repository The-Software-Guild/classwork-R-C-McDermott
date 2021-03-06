package com.ryan.question2;

public class Cylinder extends Shape3D {
	private double height;
	
	public Cylinder(double dimension, double height) {
		super(dimension);
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		double radius = this.getDimension();
		return (2 * this.getPI() * radius * height) + (2 * this.getPI() * radius * radius);
	}
	
	@Override
	public double calculateVolume() {
		double radius = this.getDimension();
		return height * this.getPI() * radius * radius;
	}

}
