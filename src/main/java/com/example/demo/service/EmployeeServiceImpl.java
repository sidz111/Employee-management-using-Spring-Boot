package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public String addEmployee(Employee e) {
		employeeDao.save(e);
		return "Added";
	}

	@Override
	public String updateEmployee(Employee e) {
		employeeDao.save(e);
		return "Updated";
	}

	@Override
	public String removeEmployeeById(Integer empId) {
		employeeDao.deleteById(empId);
		return "Deleted";
	}

	@Override
	public Employee findEmployeeById(Integer empId) {
		Optional<Employee> e = employeeDao.findById(empId);
		if(e.isEmpty()) {
			return null;
		}
		else {
			return e.get();
		}
	}

	@Override
	public List<Employee> showAllEmployees() {
		return employeeDao.findAll();
	}

}
