package com.ryan.bank;

public interface LoanAcc extends Account {
	
	public void repayPrinciple();
	public void payInterest();
	public void payPartialPrinciple();
}
