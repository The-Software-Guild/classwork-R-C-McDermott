package com.ryan.workerassignment;

public class DailyWorker extends Worker {

	public DailyWorker(String name, double salaryRate) {
		super(name, salaryRate);
	}
	
	@Override
	public double pay(int hours) {
		return (hours * this.getSalary()) / 24;
	}

}
