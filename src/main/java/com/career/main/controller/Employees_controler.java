package com.career.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.career.main.Entity.Employer;
import com.career.main.services.Employees_services;

@RestController
@RequestMapping("employee")
public class Employees_controler {
	@Autowired
	Employees_services emp_ser;
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Employer newemp){
		
		String result = emp_ser.register(newemp);
		return ResponseEntity.ok(result);
		
	}

}
