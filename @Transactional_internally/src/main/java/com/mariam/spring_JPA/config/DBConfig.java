package com.mariam.spring_JPA.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;


@Configuration
@EnableTransactionManagement
public class DBConfig {
	
	@Bean
	public DriverManagerDataSource datasource() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/spring-jpa-hibernate");
		datasource.setUsername("root");
		datasource.setPassword("root");
				
		return datasource;
		
	}
	
	
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(datasource());
		emf.setPackagesToScan("com.mariam.spring_JPA.entity");
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setPersistenceUnitName("mysqldb");
		
		return emf;
	}
	
	@Bean
	PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		
		JpaTransactionManager manager= new JpaTransactionManager();
		manager.setEntityManagerFactory(emf);
		
		return manager;
	}

}
