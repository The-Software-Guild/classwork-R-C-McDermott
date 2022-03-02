package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	boolean saveEmployee(Employee employee);
	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDepartment(String department);
}