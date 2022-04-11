package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployee(int id);
	public Employee  deleteEmployee(Employee employee);

    
}
