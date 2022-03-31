package com.tns.jpacrud.dao;

import javax.persistence.EntityManager;

import com.tns.jpacrud.entity.Student;

public class StudentdaoImpl implements Studentdao {

	private EntityManager entityManager;

	public StudentdaoImpl() {
		
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		
	}

	@Override
	public Student getStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void UpdateStudent(Student student) {
		entityManager.merge(student); 
		
	}

	@Override
	public void DeleteStudent(Student student) {
		entityManager.remove(student);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void BeginTransaction() {
		entityManager.getTransaction().commit();
		
	}
	
}