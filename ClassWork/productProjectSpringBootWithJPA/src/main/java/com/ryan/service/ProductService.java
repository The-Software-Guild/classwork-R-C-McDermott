package com.ryan.service;

import java.util.List;

import com.ryan.entity.Products;

public interface ProductService {
	List<Products> getAllProducts();
	Products getProductById(int id);
	boolean saveProduct(Products product);
	
}
