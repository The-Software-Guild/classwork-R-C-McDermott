package com.ryan.question2;

public class Main {

	public static void main(String[] args) {
		Cube cube = new Cube(2.0);
		Cylinder cylinder = new Cylinder(2.0, 6.0);
		Sphere sphere = new Sphere(2.0);
		
		System.out.println("Cube with dimension " + cube.getDimension() + " has area: " + cube.calculateArea() + ", volume: " + cube.calculateVolume());
		System.out.println("Cylinder with dimension " + cylinder.getDimension() + " has area: " + cylinder.calculateArea() + ", volume: " + cylinder.calculateVolume());
		System.out.println("Sphere with dimension " + sphere.getDimension() + " has area: " + sphere.calculateArea() + ", volume: " + sphere.calculateVolume());

	}

}
