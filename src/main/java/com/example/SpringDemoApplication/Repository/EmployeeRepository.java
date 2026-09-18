package com.example.SpringDemoApplication.Repository;

import org.springframework.stereotype.Repository;

import com.example.SpringDemoApplication.Entity.Employee;

/* @Repository is also a specialization of @Component converts class to spring managed bean 
 * this particular class will talk to Database to fetch data 
 */

@Repository
public class EmployeeRepository {
	public Employee getEmployee(Integer id) {
		return new Employee(1, "Pravalika", "DataScience", 26);
		
	}

}
