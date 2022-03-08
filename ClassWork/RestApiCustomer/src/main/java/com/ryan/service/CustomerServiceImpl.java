package com.ryan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryan.entity.Customers;
import com.ryan.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customers getCustomersById(String id) {
		return new Customers(customerDao.getCustomersByCustomerId(id));
	}

}
