package com.ryan.client;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.ryan.persistence.ProductDaoImpl;
import com.ryan.presentation.ProductPresentationImpl;
import com.ryan.service.ProductServiceImpl;

@Component
public class ProductConfig {
	
	@Bean("productDao")
	public ProductDaoImpl getProductDao() {
		return new ProductDaoImpl();
	}
	
	@Bean
	public ProductServiceImpl prodService() {
		return new ProductServiceImpl(getProductDao());
	}
	
	@Bean
	public ProductPresentationImpl prodPresentation() {
		ProductPresentationImpl productPresentationImpl = new ProductPresentationImpl();
		productPresentationImpl.setProductService(prodService());
		return productPresentationImpl;
	}
}
