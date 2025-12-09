package com.mariam.spring_JPA;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mariam.spring_JPA.entity.Student;
import com.mariam.spring_JPA.repository.StudentDaoImpl;

@Service
public class StudentService {

	private StudentDaoImpl studentDaoImpl;

	public StudentService(StudentDaoImpl studentDaoImpl) {
		super();
		this.studentDaoImpl = studentDaoImpl;
	}

	public Student saveStudent(Student s) throws Throwable {

		studentDaoImpl.saveStudent(s);
		return s;
	}

	public List<Student> getAllStudents(){

		List<Student> students = studentDaoImpl.getAllStudent();
		return students;
	}

}
