package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//create 1 employee
		Employee employee = new Employee();
		employee.setName("Shubhu");
		employee.setSalary(10000);
		em.persist(employee);
		
		//create 1 manager
		Manager manager = new Manager();
		manager.setName("Shubham");
		manager.setSalary(30000);
		manager.setDepartmentName("Training");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Added 1 employee and manager data");
		
		em.close();
		factory.close();

	}

}
