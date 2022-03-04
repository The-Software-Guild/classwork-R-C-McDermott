package com.ryan.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ryan.entity.Products;

public class ProductRowMapper implements RowMapper<Products> {

	@Override
	public Products mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		long id = resultSet.getLong("ID");
		String code = resultSet.getString("PRODUCT_CODE");
		String name = resultSet.getString("PRODUCT_NAME");
		String desc = resultSet.getString("PRODUCT_DESCRIPTION");
		double price = resultSet.getDouble("PRICE");

		Products product = new Products(id, code, name, desc, price);
		return product;
	}
}
