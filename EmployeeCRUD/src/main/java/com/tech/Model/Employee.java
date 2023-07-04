package com.tech.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee {

	@Id
	private String Id;
	private String FirstName;
	private String LatName;
	private String Email;
	private String Age;
	
}
