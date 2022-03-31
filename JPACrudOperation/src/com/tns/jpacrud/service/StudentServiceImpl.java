package com.tns.jpacrud.service;

import com.tns.jpacrud.dao.Studentdao;
import com.tns.jpacrud.dao.StudentdaoImpl;
import com.tns.jpacrud.entity.Student;

public class StudentServiceImpl implements StudentService{
	
	private Studentdao dao;

	public StudentServiceImpl() {
		dao = new StudentdaoImpl();
	}

	@Override
	public void addStudent(Student student) {
		dao.BeginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student getStudentById(int id) {
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public void UpdateStudent(Student student) {
		dao.BeginTransaction();
		dao.UpdateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void DeleteStudent(Student student) {
		dao.BeginTransaction();
		dao.DeleteStudent(student);
		dao.commitTransaction();
	}
}
