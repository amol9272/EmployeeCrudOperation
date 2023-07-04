package com.tech.Repository;

import org.springframework.data.repository.CrudRepository;

import com.tech.Model.Employee;

public interface Repository extends CrudRepository<Employee, String>
{
	
}
