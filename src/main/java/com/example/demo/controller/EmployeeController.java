package com.example.demo.controller;
//
//public class EmployeeController {
//
//}


//package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("add")
	public String addEmp(@RequestBody Employee e) {
		return employeeService.addEmployee(e);
	}
	
	@PostMapping("update")
	public String updateEmp(@RequestBody Employee e) {
		Employee emp = employeeService.findEmployeeById(e.getEmpId());
		if(emp!=null) {
			return employeeService.updateEmployee(e);			
		}
		else {
			return "Null Employee";
		}
	}
	
	@PostMapping("remove")
	public String removeEmp(@RequestParam Integer empId) {
		return employeeService.removeEmployeeById(empId);
	}
	
	@GetMapping("findByEmpId")
	public Employee findByEmpId(@RequestParam Integer empId) {
		return employeeService.findEmployeeById(empId);
	}
	
	@GetMapping("showAll")
	public List<Employee> showAll(){
		return employeeService.showAllEmployees();
	}
	
	
}
