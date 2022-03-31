package com.tns.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mgr_store2")

public class Manager extends Employee{
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
