package com.mariam.spring_JPA;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mariam.spring_JPA.config.AppConfig;
import com.mariam.spring_JPA.entity.Student;
import com.mariam.spring_JPA.repository.StudentDaoImpl;


public class App {
	
	
	
    public static void main( String[] args )
    
    {
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	StudentDaoImpl studentDaoImpl=container.getBean("studentDaoImpl",StudentDaoImpl.class );

		Student s = new Student("felfel" , 99);
    	studentDaoImpl.saveStudent(s);
    	
    	container.close();
    }
}
