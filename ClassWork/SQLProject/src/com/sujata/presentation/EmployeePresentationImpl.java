package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

//jdbc:mysql://127.0.0.1:3306/?user=root
public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("===============================");
		System.out.println("1. Show Employees ");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Insert New Employee ");
		System.out.println("4. Search Employees by department");
		System.out.println("5. Exit");
		System.out.println("==============================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			List<Employee> employeeList=employeeService.getAllEmployee();
			System.out.println("Employee List");
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
			break;

		case 2:
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			Employee searchedEmployee=employeeService.getEmployeeById(id);
			if(searchedEmployee!=null)
				System.out.println(searchedEmployee);
			else
				System.out.println("Employee with ID "+id+" does not exist!");
			break;
		case 3:
			Employee emp=new Employee();
			
			System.out.println("Enter Employee ID : ");
			emp.setEmpId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			emp.setEmpName(scanner.next());
			System.out.println("Enter Employee Designation : ");
			emp.setEmpDesignation(scanner.next());
			System.out.println("Enter Employee Department : ");
			emp.setEmpDepartment(scanner.next());
			System.out.println("Enter Employee Salary : ");
			emp.setEmpSalary(scanner.nextInt());
			
			if(employeeService.saveEmployee(emp))
				System.out.println("Employee Saved Successfully!");
			else
				System.out.println("Employee Insertion Failed!");
			break;
		case 4:
			System.out.println("Enter department : ");
			String dept=scanner.nextLine();
			List<Employee> searchedDept=employeeService.getEmployeeByDepartment(dept);
			if(searchedDept!=null)
				for(Employee employee: searchedDept) {
					System.out.println(employee);
				}
			else
				System.out.println("Employees in "+dept+" do not exist!");
			break;
		case 5:
			System.out.println("Thanks for using Employee Management System!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}