package com.tns.jpacrud.client;

import com.tns.jpacrud.entity.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		Student student = new Student();
		StudentService service = new StudentServiceImpl();
		
		//Create Operation
		student.setStudentid(100);
		student.setName("Shubhu");
		service.addStudent(student);
		System.out.println("Entry is added");
		
		/*
		 * //Retrieval Operation service.getStudentById(100);
		 * System.out.println("ID is :" + student.getStudentid());
		 * System.out.println("Name is : "+ student.getName());
		 * 
		 * //Update Operation student = service.getStudentById(100);
		 * student.setName("Shubham"); service.UpdateStudent(student);
		 * System.out.println("update is performed");
		 * 
		 * //Delete Operation student = service.getStudentById(100);
		 * service.DeleteStudent(student); System.out.println("Delete is performed");
		 */
	}

}
