package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repository;
	
	@Override
	public Employee saveEmployee(Employee emp) {
	Employee employee=repository.save(emp);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employee=repository.findAll();
		return employee;
	}

}
