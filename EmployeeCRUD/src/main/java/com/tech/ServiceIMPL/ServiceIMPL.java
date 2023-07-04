package com.tech.ServiceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.Model.Employee;
import com.tech.Repository.Repository;
import com.tech.ServiceI.ServiceI;

@Service
public class ServiceIMPL implements ServiceI {

	@Autowired
	private Repository repo;
	
	@Override
	public String addEmployee(Employee emp) {
		repo.save(emp);
		return "Employee data saved successfully";
	}

	@Override
	public String addEmployees(List<Employee> employees) {
		repo.saveAll(employees);
		return "List of Employees saved successfully";
	}

	@Override
	public String getEmployee(String Id) {
		Optional<Employee>emp=repo.findById(Id);
		
		if(emp.isPresent())
		{
		 emp.get();
		}
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		
		return (List<Employee>)repo.findAll();
	}

	@Override
	public String deleteEmployees(String Id) {
		repo.deleteById(Id);
		return "Employee data removed Successfully";
	}

	@Override
	public String updateEmployee(Employee employees) {
		repo.save(employees);
		return "Employee data saved successfully";
	}

}
