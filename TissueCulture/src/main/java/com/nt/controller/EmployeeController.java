package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@RestController
@RequestMapping("/TreePlantApi")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	@PostMapping("/register")
	public ResponseEntity<?>  registerEmployee(@RequestBody Employee em){
		try {
		Employee employee=service.saveEmployee(em);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.CREATED);
		}
	}
	@GetMapping("/getAllEmployee")
	public ResponseEntity<?>  getAllEmployee(){
		try {
		List<Employee> empList=service.getAllEmployee();
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.CREATED);
		}
	}
}
