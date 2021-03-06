package com.assignment1.student;

public class Standard {
	private Student s1 = new Student(102, "Billy", 12.1, 56.3, 55.0);
	private Student s2 = new Student(622, "Milly", 63.6, 32.3, 67.1);
	private Student s3 = new Student(322, "Tilly", 88.2, 15.3, 66.0);
	private Student s4 = new Student(731, "Bob", 74.5, 56.3, 67.0);
	private Student s5 = new Student(152, "Ryan", 75.2, 64.2, 69.0);
	private Student s6 = new Student(192, "Rob", 58.5, 56.3, 62.2);
	private Student s7 = new Student(256, "Jim", 28.2, 51.6, 97.0);
	private Student s8 = new Student(462, "Katie", 85.8, 76.3, 88.2);
		
	private Student[] studentArray = {s1, s2, s3, s4, s5, s6, s7, s8};
	
//	public Student[] getStudentArray() {
//		return this.studentArray;
//	}
		
	public void iterateStudentsNameAndRoll() {
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("Name: " + studentArray[i].getStudName() + ", Roll number: " + studentArray[i].getRollNo());
		}
	}
	
	public Student getHighestMaths() {
		double highestMark = 0;
		Student highestStudent = null;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getMarksInMaths() > highestMark) {
				highestStudent = studentArray[i];
				highestMark = studentArray[i].getMarksInMaths();
			}
		}
		return highestStudent;
	}
	
	public Student getHighestEng() {
		double highestMark = 0;
		Student highestStudent = null;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getMarksInEng() > highestMark) {
				highestStudent = studentArray[i];
				highestMark = studentArray[i].getMarksInEng();
			}
		}
		return highestStudent;
	}
	
	public Student getHighestScience() {
		double highestMark = 0;
		Student highestStudent = null;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getMarksInScience() > highestMark) {
				highestStudent = studentArray[i];
				highestMark = studentArray[i].getMarksInScience();
			}
		}
		return highestStudent;
	}
	
	public Student getHighestPercentage() {
		Student highestPercentage = null;
		Student highestMaths = getHighestMaths();
		Student highestEng = getHighestEng();
		Student highestScience = getHighestScience();
		if (highestMaths.getMarksInMaths() > highestEng.getMarksInEng() && highestMaths.getMarksInMaths() > highestScience.getMarksInScience()) {
			highestPercentage = highestMaths;
		}
		else if (highestEng.getMarksInEng() > highestMaths.getMarksInMaths() && highestEng.getMarksInEng() > highestScience.getMarksInScience()) {
			highestPercentage = highestEng;
		}
		else {
			highestPercentage = highestScience;
		}
		return highestPercentage;
	}

}
