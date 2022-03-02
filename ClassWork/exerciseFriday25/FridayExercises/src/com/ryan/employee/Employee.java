package com.ryan.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	
	Scanner scanner = new Scanner(System.in);
	String nameInput;
	int ageInput;
	private List<String> employees = new ArrayList<String>();
	

	public void userPrompt() throws EmployeeNameException, EmployeeAgeException{
		try {
			System.out.println("Please enter employee name: ");
			nameInput = scanner.nextLine();
			if (checkEmployee(nameInput) == true) {
				throw new EmployeeNameException("Employee name already exists!");
			}
			employees.add(nameInput);
			System.out.println("Employee added!");
		}
		catch (EmployeeNameException e1) {
			System.out.println(e1.getMessage());
		}
		try {
			System.out.println("Please enter employee age: ");
			String userInput = scanner.nextLine();
			ageInput = Integer.parseInt(userInput);
			if (checkAge(ageInput) == true) {
				throw new EmployeeAgeException("Invalid age entered!");
			}
			System.out.println("Registration complete!");
		}
		catch (EmployeeAgeException e2) {
			System.out.println(e2.getMessage());
		}
		
	}
	
	public boolean checkEmployee(String employee) {
		for (int i = 0; i < this.employees.size(); i++) {
			if (employee.equals(this.employees.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkAge(int age) {
		if (age < 18 || age > 60) {
			return true;
		}
		return false;
	}
	
	public void addToList(String addition) {
		this.employees.add(addition);
	}
	
	public void printEmployees() {
		for (int i = 0; i < this.employees.size(); i++) {
			System.out.println(this.employees.get(i));
		}
	}

}
