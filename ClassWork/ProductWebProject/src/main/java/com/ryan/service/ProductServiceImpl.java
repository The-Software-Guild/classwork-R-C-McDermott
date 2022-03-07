package com.ryan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryan.entity.Products;
import com.ryan.persistence.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Products getProductFromId(long id) {
		return productDao.getById(id);
	}

	@Override
	public Products updateProductPriceFromId(long id, double price) {
		Products p = productDao.getById(id);
		productDao.updateProductPriceById(id, price);
		return p;
	}

}
