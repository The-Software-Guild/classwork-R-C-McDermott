package com.ryan.workerassignment;

public class SalariedWorker extends Worker {
		
	public SalariedWorker(String name, double salaryRate) {
		super(name, salaryRate);
	}
	
	@Override
	public double pay(int hours) {
		if (hours <= 40) {
		return hours * this.getSalary();
		}
		else {
			return 40 * this.getSalary();
		}
	}
		
}
