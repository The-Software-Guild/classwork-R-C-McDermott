package com.ryan.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ryan.entity.Customers;
import com.ryan.service.CustomerService;

@RestController
public class CustomerResource {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path = "/customers/{cid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Customers getCustomerByIdResource(@PathVariable("cid") String id) {
		return customerService.getCustomersById(id);
	}

}
