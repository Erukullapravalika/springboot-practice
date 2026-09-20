package com.example.SpringDemoApplication.Service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDemoApplication.DTO.EmployeeDto;
import com.example.SpringDemoApplication.Entity.Employee;
import com.example.SpringDemoApplication.Repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/* @Service is a specialization of @component which contains business that registers class as a  spring managed bean   
 * class marked with @Component will be managed by spring like no manual object creation
 */

@Service 
/* customizing nature of bean in life cycle
 * To perform certain actions after bean creation use InitializingBean interface and override the method afterPropertiesSet and define action
 * To perform certain actions before destroying bean use DisposableBean interface and override the method destroy and define action
 * this is the old way in order to perform customizing nature of bean
 * new approach is @PostContruct and @PreDestroy annotations
 */
public class EmployeeService{
	
	@Autowired
	EmployeeRepository emprepo;
	public EmployeeDto getEmployee(Integer id) {
		Employee emp=emprepo.getEmployee(id);
		EmployeeDto employeeDTO=new EmployeeDto();
		return employeeDTO.EmployeeMapper(emp);
	
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("action after bean creation");	
	}
	
	@PreDestroy
	public void beforeDestroy() {
		System.out.println("action before destroying bean");
	}

}
