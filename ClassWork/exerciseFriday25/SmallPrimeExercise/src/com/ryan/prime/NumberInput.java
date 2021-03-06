package com.ryan.prime;

import java.util.Scanner;

public class NumberInput {
	
	public int number;
	Scanner inputScanner = new Scanner(System.in);
	

	public void setNumber(int n) throws PrimeCheck {
		try {
			if (!isPrime(n)) {
				throw new PrimeCheck("Number is not prime!");
			}
			this.number = n;
			System.out.println("Number added!");
		}
		catch (PrimeCheck ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	
	public boolean isPrime(int n) {
		boolean isPrime = true;
		for (int j = 2; j < n/2; j++) {
			if (n % j == 0) {
				return false;
			}
		}
		return isPrime;
	}
}
