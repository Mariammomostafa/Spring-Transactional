package com.selenium.spring_Transactiona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selenium.spring_Transactiona.dto.Product;
import com.selenium.spring_Transactiona.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Transactional
	public void saveProductInfo() throws Exception {
		
		// create some products
	
			
			for (int i = 1; i <= 10; i++) {
				
				Product product = new Product();
				product.setId(i);
				product.setName("product " + i);
				
				productRepo.saveProduct(product);
				
				if(i == 7) {
					
					throw new RuntimeException("something wrong occure ...");
				}
				
			}
		
	}
}
