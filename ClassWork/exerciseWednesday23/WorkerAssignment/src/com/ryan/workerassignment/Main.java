package com.ryan.workerassignment;

public class Main {

	public static void main(String[] args) {
		DailyWorker w1 = new DailyWorker("Ryan", 50);
		SalariedWorker w2 = new SalariedWorker("Jim", 8.5);
		
		System.out.println("pay w1: " + w1.pay(66));
		System.out.println("pay w2: " + w2.pay(34));

	}

}
