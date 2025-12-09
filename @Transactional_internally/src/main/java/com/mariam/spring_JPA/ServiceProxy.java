package com.mariam.spring_JPA;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import com.mariam.spring_JPA.entity.Student;
import com.mariam.spring_JPA.repository.StudentDaoImpl;

@Component
public class ServiceProxy extends StudentService{

	
	private TransactionInterceptor interceptor;
	
	private StudentService targetClass;
	
	public ServiceProxy(StudentDaoImpl studentDaoImpl
						, TransactionInterceptor interceptor
						, StudentService service) {
		
		super(studentDaoImpl);
		this.interceptor = interceptor;
		this.targetClass = service;
	}
	
	
	@Override
	public Student saveStudent(Student s) throws Throwable {
		
		try {
			
			// use Reflection Method to get metadata of the target method 
			Method method = targetClass.getClass().getMethod("saveStudent", Student.class);
			
			MethodInvocation invocation = new MethodInvocation() {
				
				@Override
				public Object proceed() throws Throwable {
					
					return targetClass.saveStudent(s);
				}
				
				@Override
				public Object getThis() {
					
					return targetClass;
				}
				
				@Override
				public AccessibleObject getStaticPart() {
				
					return method;
				}
				
				@Override
				public Object[] getArguments() {
					
					return new Object[] {s};
				}
				
				@Override
				public Method getMethod() {
					
					return method;
				}
			};
			
			interceptor.invoke(invocation);
			
		}catch ( NoSuchMethodException e){
			
			e.getMessage();
		}
		return s;
		
	}





}


