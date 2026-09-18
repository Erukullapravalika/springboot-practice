package com.example.SpringDemoApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringDemoApplication.Entity.Employee;
import com.example.SpringDemoApplication.Service.EmployeeService;


/* @Controller is a specialized version of the @Component annotation 
 * that registers the class as a Spring-managed bean and handles client web requests
 */

//@Controller 
@RestController // Controller+ResponseBody to avoid ResponsBody with RequestMapping 
public class EmpController {
	
	@Autowired // spring will inject empService dependenecy automatically
	EmployeeService empService;
	
	
	/* we should explicitly pass which method to use like GET,PUT etc with RequestMapping
	 * @RequestMapping(path = "/getEmp", method = RequestMethod.GET) 
	 */
	@GetMapping("/getEmp") // specialization of RequestMapping to make use of GET method of HTTP
	// @ResponseBody -- returns actual response in some format like JSON
	public String getEmp() {
		return "employee"; //finds some emp.html to render on ui without ResponseBody
	}
	
	
	@GetMapping("/getEmpById")
	/* RequestParam accepts the requestparameter what the user will pass i.e queryparameter
	 * localhost:8080/getEmpById?empid=1 to use diff name like id=1 use name="customname" 
	 */
	public String getEmpById(@RequestParam(name="id") Integer empid) {
		return "employee"; //finds some emp.html to render on ui without ResponseBody
	}
	
	
	
	@GetMapping("/getEmpByPathId/{empid}") 
	/* Pathvariable accepts the parameter value mentioned in request url
	 * localhost:8080/getEmpById/12
	 */
	public String getEmpByPathId(@PathVariable Integer empid) {
		return "employee"; //finds some emp.html to render on ui without ResponseBody
	}
	
	
	// @RequestMapping(path = "/addEmp", method = RequestMethod.POST)
	@PostMapping("/addEmp")
	// RequestBody maps the body input like JSON format to employee obj to process it further
	public String addEmp(@RequestBody Employee employee) {
		return "added"; 
	}
	

	@PutMapping("/updateEmp")
	public String updateEmp(Employee employee) {
		return "updated"; 
	}
	
	
	@DeleteMapping("/deleteEmp")
	public String deleteEmp(Employee employee) {
		return "deleted Sucessfully"; 
	}	

}
