package com.cg.shoppingmallmanagement.service;

import com.cg.shoppingmallmanagement.entity.Employee;
import com.cg.shoppingmallmanagement.repository.IEmployeeRepository;
import com.cg.shoppingmallmanagement.repository.IEmployeeRepositoryImpl;

public class IEmployeeServiceImpl implements IEmployeeService {
	
	IEmployeeRepository dao;

	public IEmployeeServiceImpl() {
		dao= new IEmployeeRepositoryImpl();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return null;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee=dao.searchEmployee(id);
	 return employee;
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		dao.beginTransaction();
		dao.deleteEmployee(employee);
		dao.commitTransaction();
		return employee;
	}
	

}
