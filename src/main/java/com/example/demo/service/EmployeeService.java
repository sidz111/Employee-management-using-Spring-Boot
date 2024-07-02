package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	String addEmployee(Employee e);
	String updateEmployee(Employee e);
	String removeEmployeeById(Integer empId);
	Employee findEmployeeById(Integer empId);
	List<Employee> showAllEmployees();
}
