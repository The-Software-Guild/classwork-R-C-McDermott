package com.ryan.question2;

public class Sphere extends Shape3D {
	
	public Sphere(double dimension) {
		super(dimension);
	}
	
	@Override
	public double calculateArea() {
		double radius = this.getDimension();
		return 4 * this.getPI() * radius * radius;
	}
	
	@Override
	public double calculateVolume() {
		double radius = this.getDimension();
		return (4 / 3) * this.getPI() * (radius * radius * radius);
	}

}
