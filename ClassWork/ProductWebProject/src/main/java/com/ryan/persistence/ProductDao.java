package com.ryan.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ryan.entity.Products;

@Repository
public interface ProductDao extends JpaRepository<Products, Long> {

	
	@Transactional
	@Modifying
	@Query("Update Products set productPrice=:price where productId=:id")
	void updateProductPriceById(@Param("id") long prodId, @Param("price") double price);
}
