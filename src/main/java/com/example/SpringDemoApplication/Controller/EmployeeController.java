package com.example.SpringDemoApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemoApplication.DTO.EmployeeDto;
import com.example.SpringDemoApplication.Entity.Employee;
import com.example.SpringDemoApplication.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Integer id){
		EmployeeDto emp=employeeService.getEmployee(id);
		return ResponseEntity.ok(emp);
		
	}

}
