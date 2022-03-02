package com.ryan.bankImpl;

import com.ryan.bank.Account;
import com.ryan.bank.CreditInterest;
import com.ryan.bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAcc() {
		System.out.println("You have created a " + Account.savingType + " account");

	}

	@Override
	public void calcInt() {
		
	}

	@Override
	public void addMonthlyInt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addHalfYearlyInt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub

	}

}
