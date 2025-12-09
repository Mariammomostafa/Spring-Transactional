package com.selenium.spring_Transactiona.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.selenium")
@EnableTransactionManagement
public class AppConfig {
	
	@Bean
	public JdbcTemplate jdbcTemplate() {

		return new JdbcTemplate(dataSource());
	}	
	@Bean
	public DataSource dataSource() {

		String url = "jdbc:mysql://localhost:3306/spring_jdbc";
		String username = "root";
		String password = "root";
		DataSource dataSource = new DriverManagerDataSource(url, username, password);

		return dataSource;
	}
	@Bean
	public TransactionManager transactionManager(DataSource dataSource) {
		
		return new DataSourceTransactionManager(dataSource);
	}


}
