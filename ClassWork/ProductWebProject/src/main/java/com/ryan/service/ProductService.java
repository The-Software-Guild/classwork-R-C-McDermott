package com.ryan.service;

import com.ryan.entity.Products;

public interface ProductService {
	
	public Products getProductFromId(long id);
	public Products updateProductPriceFromId(long id, double price);

}
