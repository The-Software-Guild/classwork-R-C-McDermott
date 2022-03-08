package com.ryan.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ryan.entity.CustomersDetails;
import com.ryan.service.CustomerDetailsService;


@RestController
public class CustomerDetailsResources {

	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@GetMapping(path = "/catalogs/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomersDetails getCustomerDetailsListByUserIdResource(@PathVariable("id") String id) {
		return customerDetailsService.getCustomersDetailsById(id);
	}
}