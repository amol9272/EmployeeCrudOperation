package com.tech.ServiceI;

import java.util.List;

import com.tech.Model.Employee;

public interface ServiceI {

	public String addEmployee(Employee emp);
	
	public String addEmployees(List<Employee>employees);
	
	public String getEmployee(String Id);
	
	public List<Employee>getEmployees();
	
	public String deleteEmployees(String Id);
	
	public String updateEmployee(Employee employees);
}
