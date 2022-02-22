package com.assignment1.student;

public class Main {

	public static void main(String[] args) {
		Standard stand = new Standard();
		
		Student highestPercentage = stand.getHighestPercentage();
		Student highestMathsScore = stand.getHighestMaths();
		Student highestEngScore = stand.getHighestEng();
		Student highestScienceScore = stand.getHighestScience();
		
		stand.iterateStudentsNameAndRoll();
		
		System.out.println("Student with highest percentage: " + highestPercentage.getStudName());
		System.out.println("Student with highest maths mark: " + highestMathsScore.getStudName());
		System.out.println("Student with highest eng mark: " + highestEngScore.getStudName());
		System.out.println("Student with highest science mark: " + highestScienceScore.getStudName());

	}

}
