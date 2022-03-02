package com.ryan.service;

import java.util.List;

import com.ryan.entity.Products;
import com.ryan.persistence.ProductDao;
import com.ryan.persistence.ProductDaoImpl;


public class ProductServiceImpl implements ProductService {

	private ProductDao productDao = new ProductDaoImpl();
	
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
