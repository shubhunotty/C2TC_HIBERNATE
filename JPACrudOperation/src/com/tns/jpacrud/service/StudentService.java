package com.tns.jpacrud.service;

import com.tns.jpacrud.entity.Student;

public interface StudentService {
	
	public abstract void addStudent(Student student); //c
	public abstract Student getStudentById(int id); //R
	public abstract void UpdateStudent(Student student); //U
	public abstract void DeleteStudent(Student student); //D
}
