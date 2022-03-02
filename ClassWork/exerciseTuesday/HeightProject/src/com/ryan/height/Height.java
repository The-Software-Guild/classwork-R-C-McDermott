package com.ryan.height;

public class Height {
	private int feet;
	private int inches;
	
	public Height(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
		while (this.inches > 11) {
			this.inches -= 12;
			this.feet += 1;
		}
	}
	
	public int getFeet() {
		return this.feet;
	}
	
	public int getInches() {
		return this.inches;
	}
}
