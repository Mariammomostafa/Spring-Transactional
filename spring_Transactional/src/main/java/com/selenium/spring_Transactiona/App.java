package com.selenium.spring_Transactiona;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.selenium.spring_Transactiona.config.AppConfig;
import com.selenium.spring_Transactiona.service.ProductService;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	context.registerShutdownHook();
    	
    	ProductService service = context.getBean("productService" , ProductService.class);
    	
    	service.saveProductInfo();
    	
        	
    	context.close();
    }
}
