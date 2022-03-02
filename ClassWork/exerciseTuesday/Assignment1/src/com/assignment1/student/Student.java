package com.assignment1.student;

public class Student {
	private int rollNo;
	private String studName;
	private double marksInEng;
	private double marksInMaths;
	private double marksInScience;
	
	public Student(int rollNo, String studName, double marksInEng, double marksInMaths, double marksInScience) {
		this.rollNo = rollNo;
		this.studName = studName;
		this.marksInEng = marksInEng;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getMarksInEng() {
		return marksInEng;
	}
	public void setMarksInEng(double marksInEng) {
		this.marksInEng = marksInEng;
	}
	public double getMarksInMaths() {
		return marksInMaths;
	}
	public void setMarksInMaths(double marksInMaths) {
		this.marksInMaths = marksInMaths;
	}
	public double getMarksInScience() {
		return marksInScience;
	}
	public void setMarksInScience(double marksInScience) {
		this.marksInScience = marksInScience;
	}
	
	

}
