package com.example.SpringDemoApplication.Repository;

import org.springframework.stereotype.Repository;

import com.example.SpringDemoApplication.Entity.Employee;

@Repository
public class EmployeeRepository {
	public Employee getEmployee(Integer id) {
		return new Employee(1, "Pravalika", "DataScience", 26);
		
	}

}
