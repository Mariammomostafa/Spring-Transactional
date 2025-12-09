package com.selenium.spring_Transactiona.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.selenium.spring_Transactiona.dto.Product;

@Component
public class ProductRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public void saveProduct(Product product) {
		
		String sql = "insert into product values(? , ?)";
		
		int insertedRow = jdbcTemplate.update(sql, product.getId() , product.getName());
		
		System.out.println(insertedRow + " row/s inserted..");
	}
}
