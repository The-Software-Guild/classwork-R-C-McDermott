package com.ryan.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ryan.entity.Products;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Products> getProductList() {
		List<Products> productList = new ArrayList<Products>();
		String query = "SELECT * FROM PRODUCTS";
		productList = jdbcTemplate.query(query, new ProductRowMapper());
		return productList;
	}

	@Override
	public Products getProduct(int id) {
		Products product = new Products();
		String query = "SELECT * FROM PRODUCTS WHERE ID=?";
		try {
			product = jdbcTemplate.queryForObject(query, new ProductRowMapper(), id);
			return product;
		}
		catch (EmptyResultDataAccessException e) {
			System.out.println("Product does not exist!");
		}
		return null;
	}

	@Override
	public int addProductToDb(Products product) {
		String query = "INSERT INTO PRODUCTS VALUES (?,?,?,?,?)";
		int rows = jdbcTemplate.update(query, product.getProductId(), product.getProductCode(),
										product.getProductName(), product.getProductDescription(),
										product.getProductPrice());
		return rows;
		
	}


}
