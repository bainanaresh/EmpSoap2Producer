package com.baina.spring.soap.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baina.spring.soap.api.EmployeeRepository.EmployeeRepository;
import com.baina.spring.soap.api.empreg.Employee;
import com.baina.spring.soap.api.empreg.EmployeeDetails;
import com.baina.spring.soap.api.entity.EmployeeDb;

@Service
public class EmployeeRegService {
	@Autowired
	private EmployeeRepository repository;
	
	public EmployeeDetails regEmp(Employee emp) {
		EmployeeDb emp2=new EmployeeDb();
		emp2.setEid(emp.getEid());
		emp2.setAge(emp.getAge());
		emp2.setName(emp.getName());
		emp2.setSalary(emp.getSalary());
		repository.save(emp2);
		EmployeeDetails details=new EmployeeDetails();
	
		details.setEid(emp.getEid());
		details.setName(emp.getName());
		details.setAge(emp.getAge());
		details.setSalary(emp.getSalary());
		details.setResults("employee registered successfully");
		return details;
	
	}

}
