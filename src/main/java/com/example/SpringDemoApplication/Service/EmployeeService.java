package com.example.SpringDemoApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDemoApplication.DTO.EmployeeDto;
import com.example.SpringDemoApplication.Entity.Employee;
import com.example.SpringDemoApplication.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository emprepo;
	public EmployeeDto getEmployee(Integer id) {
		Employee emp=emprepo.getEmployee(id);
		EmployeeDto employeeDTO=new EmployeeDto();
		return employeeDTO.EmployeeMapper(emp);
	
	}

}
