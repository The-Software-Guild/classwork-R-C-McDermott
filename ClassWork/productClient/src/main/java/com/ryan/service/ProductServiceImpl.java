package com.ryan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryan.entity.Products;
import com.ryan.persistence.ProductDao;

// Using @Service instead of @Component for service layer 
@Service
public class ProductServiceImpl implements ProductService {

	//private ProductDao productDao = new ProductDaoImpl();
	@Autowired 
	private ProductDao productDao;
	
	public ProductServiceImpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	@Override
	public List<Products> getAllProducts() {
		return productDao.getProductList();
	}

	@Override
	public Products getProductById(int id) {
		return productDao.getProduct(id);
	}

	@Override
	public boolean saveProduct(Products product) {
		int rows = productDao.addProductToDb(product);
		if(rows > 0)
			return true;
		return false;
	}

}
