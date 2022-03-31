package com.tns.jpacrud.dao;

import com.tns.jpacrud.entity.Student;

public interface Studentdao {

	public abstract void addStudent(Student student); //c
	public abstract Student getStudentById(int id); //R
	public abstract void UpdateStudent(Student student); //U
	public abstract void DeleteStudent(Student student); //D
	
	public abstract void commitTransaction();
	public abstract void BeginTransaction();
	
}
