package com.ryan.question2;

public class Cube extends Shape3D {
	
	public Cube(double dimension) {
		super(dimension);
	}

	@Override
	public double calculateArea() {
		double width = this.getDimension();
		return 6 * (width * width);
	}
	
	@Override
	public double calculateVolume() {
		double width = this.getDimension();
		return width * width * width;
	}
}
