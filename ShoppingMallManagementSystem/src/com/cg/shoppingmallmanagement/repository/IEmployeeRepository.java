package com.cg.shoppingmallmanagement.repository;

import com.cg.shoppingmallmanagement.entity.Employee;

public interface IEmployeeRepository {

	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployee(int id);
	public Employee  deleteEmployee(Employee employee);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
