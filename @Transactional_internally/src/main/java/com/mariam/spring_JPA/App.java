package com.mariam.spring_JPA;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mariam.spring_JPA.config.AppConfig;
import com.mariam.spring_JPA.entity.Student;


public class App {
	
	
	
    public static void main( String[] args ) throws Throwable
    
    {
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	
    	
    	ServiceProxy serviceProxy = container.getBean("serviceProxy",ServiceProxy.class );

		Student s = new Student("somaa" , 100);
		serviceProxy.saveStudent(s);
		
		List<Student> students = serviceProxy.getAllStudents();
    	
		for (Student student : students) {
			System.out.println(student);
		}
    	container.close();
    }
}
