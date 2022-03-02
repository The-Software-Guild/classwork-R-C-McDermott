package com.ryan.sample;

public class Sample {
	private static int objectCount = 0;
	
	{
		objectCount++;
	}
	
	static public void displayInstanceCount() {
		System.out.println("Count: " + objectCount);
	}

}
