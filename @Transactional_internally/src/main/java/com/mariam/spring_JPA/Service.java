package com.mariam.spring_JPA;

import com.mariam.spring_JPA.entity.Student;
import com.mariam.spring_JPA.repository.StudentDaoImpl;

public class Service {
	
	private StudentDaoImpl studentDaoImpl;

	
	public Service(StudentDaoImpl studentDaoImpl) {
		super();
		this.studentDaoImpl = studentDaoImpl;
	}
	
	
	public Student saveStudent(Student s) throws Throwable {
		
		studentDaoImpl.saveStudent(s);
		return s;
	}

}
