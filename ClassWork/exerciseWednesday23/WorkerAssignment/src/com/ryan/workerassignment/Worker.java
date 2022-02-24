package com.ryan.workerassignment;

public class Worker {
	private String name;
	private double salaryRate;
	
	public Worker(String name, double salaryRate) {
		this.name = name;
		this.salaryRate = salaryRate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salaryRate;
	}
	
	public double pay(int hours) {
		return 0.0;
	}
}
