package com.ryan.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ryan.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	
	@Query("from Customer where customerId = :cid")
	public List<Customer> getCustomersByCustomerId(@Param("cid") String id);
}
