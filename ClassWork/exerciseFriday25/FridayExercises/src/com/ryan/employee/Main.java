package com.ryan.employee;

public class Main {

	public static void main(String[] args) throws EmployeeNameException, EmployeeAgeException {
		Employee e =  new Employee();
		
		e.addToList("Steve");
		e.addToList("Ryan");
		e.addToList("Katie");
		
		e.printEmployees();
		
		e.userPrompt();

	}

}
