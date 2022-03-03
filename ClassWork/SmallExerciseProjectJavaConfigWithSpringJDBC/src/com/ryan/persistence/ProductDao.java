package com.ryan.persistence;

import java.util.List;

import com.ryan.entity.Products;

public interface ProductDao {

	List<Products> getProductList();
	Products getProduct(int id);
	int addProductToDb(Products product);
}
