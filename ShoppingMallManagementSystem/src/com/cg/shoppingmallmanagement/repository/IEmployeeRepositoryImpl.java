package com.cg.shoppingmallmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmallmanagement.entity.Employee;

public class IEmployeeRepositoryImpl implements IEmployeeRepository{
	
	private EntityManager entityManager;

	public IEmployeeRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Employee addEmployee(Employee employee) {
	  entityManager.persist(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		entityManager.merge(employee);
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee=entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		entityManager.remove(employee);
		return employee;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	
	}
	

}
