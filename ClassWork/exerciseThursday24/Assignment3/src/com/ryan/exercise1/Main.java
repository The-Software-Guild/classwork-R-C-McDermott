package com.ryan.exercise1;

public class Main {

	public static void main(String[] args) {
		Line l = new Line(2.0, "Green");
		Square s = new Square(3.0, "Red");
		Circle c = new Circle(3.5, "Blue");
		
		l.drawingColour();
		l.thickness();
		
		s.fillingColour();
		s.size();
		
		c.fillingColour();
		c.size();
		

	}

}
