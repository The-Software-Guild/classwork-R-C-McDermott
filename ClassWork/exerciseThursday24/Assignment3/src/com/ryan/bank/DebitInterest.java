package com.ryan.bank;

public interface DebitInterest extends Interest {

	public void deductMonthlyInt();
	public void deductHalfYearlyInt();
	public void deductAnnualInt();
}
