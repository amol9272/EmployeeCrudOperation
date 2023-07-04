package com.tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Model.Employee;
import com.tech.ServiceI.ServiceI;

@RestController
@RequestMapping("/controller")
public class Controller {

	@Autowired
	ServiceI si;

	@PostMapping("/add/employee")
	public String addEmployee(@RequestBody Employee emp) {
		String id = si.addEmployee(emp);
		return id;

	}
	
	@PostMapping("/add/employees")
	public String addEmployees(@RequestBody List<Employee>emp)
	{
		String emp1=si.addEmployees(emp);
		return emp1;
		
	}
	
	@GetMapping("/get/employee/{Id}")
	public String getEmployee(@PathVariable String Id)
	{
		String emp2=si.getEmployee(Id);
		return emp2;
		
	}
	
	@GetMapping("/get/employees")
	public List<Employee>findEmployees()
	{
		return si.getEmployees();
	}
	
	@DeleteMapping("/delete/{Id}")
	public String deleteEmployee(@PathVariable String Id)
	{
		return si.deleteEmployees(Id);
	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee)
	{
		return si.updateEmployee(employee);
	}

}
