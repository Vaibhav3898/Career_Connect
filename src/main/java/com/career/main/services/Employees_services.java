package com.career.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.career.main.Entity.Employer;
import com.career.main.repository.Employeers_repo;

@Service
public class Employees_services {
	
	@Autowired
	Employeers_repo emp_repo;
	
	public String register(Employer newemp) {
		
		Employer exemp = emp_repo.findByEmail(newemp.getEmail()).orElse(null);
		
		if(exemp != null) {
			return "Email already registered";
		}
		emp_repo.save(newemp);
		return "Registration successfully";
	}
	

}
