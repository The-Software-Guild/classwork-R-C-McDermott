package com.ryan.bank;

public interface Account {
	static final String savingType = "Savings";
	static final String fixedType = "Fixed";
	static final String housingLoanType = "Housing Loan";
	static final String personalLoanType = "Personal Loan";
	
	public void createAcc();
}
