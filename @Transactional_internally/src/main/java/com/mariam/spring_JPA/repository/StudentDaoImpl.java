package com.mariam.spring_JPA.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mariam.spring_JPA.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class StudentDaoImpl {

	@PersistenceContext(unitName = "mysqldb")
	EntityManager entityManager;
	
	
	@Transactional
	public void saveStudent(Student student) {

		entityManager.persist(student);
		System.out.println("student saved successfully");
		
	}
	
	
	public List<Student> getAllStudent() {

	    List<Student> list = entityManager.createQuery("from Student" , Student.class).getResultList();
		System.out.println("student saved successfully");
		
		return list;
	}
	

	public Student getStudent(int id) {

	    Student student = entityManager.find(Student.class, id);	
		return student;
	}
	
	@Transactional
	public void deleteStudent(int id) {

	    Student student = getStudent(id);
	    entityManager.remove(student);
	}

}
