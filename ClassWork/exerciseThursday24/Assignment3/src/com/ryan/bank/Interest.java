package com.ryan.bank;

public interface Interest {

	static final double savingsInterest = 0.02;
	static final double fixedInterest = 0.01;
	static final double personalLoanInterest = 0.07;
	static final double housingLoanInterest = 0.05;
	
	public void calcInt();
}
