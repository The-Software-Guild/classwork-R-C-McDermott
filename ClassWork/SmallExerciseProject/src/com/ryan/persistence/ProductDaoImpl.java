package com.ryan.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ryan.entity.Products;

@Component("prodDao")
public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Products> getProductList() {
		
		List<Products> productList = new ArrayList<Products>();
		Connection connection = null;
		
		try {
			// Connecting
			// Registering driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
			// Connect to DB
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/c173", "root", "alwyn");
			
			// Query
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCTS");
			// Execute 
			ResultSet resultSet = preparedStatement.executeQuery();
			
			// Processing results
			while(resultSet.next()) {
				long productId = resultSet.getInt("ID");
				String productCode = resultSet.getString("PRODUCT_CODE");
				String productName = resultSet.getString("PRODUCT_NAME");
				String productDescription = resultSet.getString("PRODUCT_DESCRIPTION");
				double productPrice = resultSet.getInt("PRICE");
				
				Products product = new Products(productId, productCode, productName, productDescription, productPrice);
				
				productList.add(product);
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
//		4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return productList;
		
	}

	@Override
	public Products getProduct(int id) {
		Products product = new Products();
		Connection connection = null;
		
		try {
			// Connecting
			// Registering driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
			// Connect to DB
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/c173", "root", "alwyn");
			
			// Query
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCTS WHERE ID=?");
			preparedStatement.setInt(1, id);
			// Execute 
			ResultSet resultSet = preparedStatement.executeQuery();
			
			// Processing results
			if(resultSet.next()) {
				long productId = resultSet.getInt("ID");
				String productCode = resultSet.getString("PRODUCT_CODE");
				String productName = resultSet.getString("PRODUCT_NAME");
				String productDescription = resultSet.getString("PRODUCT_DESCRIPTION");
				double productPrice = resultSet.getInt("PRICE");
				
				product = new Products(productId, productCode, productName, productDescription, productPrice);
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
//		4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;
	}

	@Override
	public int addProductToDb(Products product) {
		Connection connection = null;
		
		try {
			// Connecting
			// Registering driver
			getClass().forName("com.mysql.cj.jdbc.Driver");
			// Connect to DB
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/c173", "root", "alwyn");
			
			// Query
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PRODUCTS VALUES (?,?,?,?,?)");
			preparedStatement.setLong(1,   	product.getProductId());
			preparedStatement.setString(2, 	product.getProductCode());
			preparedStatement.setString(3, 	product.getProductName());
			preparedStatement.setString(4, 	product.getProductDescription());
			preparedStatement.setDouble(5, 	product.getProductPrice());
			
			// Execute 
			//to execure all dml statements(insert, delete,update) : executeUpdate()
			int rows= preparedStatement.executeUpdate();
			
//			3.Process Result
			
			return rows;
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
//		4.Closing the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
		
	}


}
