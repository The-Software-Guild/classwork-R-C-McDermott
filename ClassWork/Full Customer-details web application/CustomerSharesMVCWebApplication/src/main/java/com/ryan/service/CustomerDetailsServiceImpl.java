package com.ryan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ryan.entity.Customer;
import com.ryan.entity.CustomerDetails;
import com.ryan.entity.Customers;
import com.ryan.entity.CustomersDetails;
import com.ryan.entity.Share;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CustomersDetails getCustomersDetailsById(String custId) {
		Customers customers = restTemplate.getForObject("http://localhost:8082/customers/" + custId, Customers.class);		
		
		List<CustomerDetails> customerDetailList = new ArrayList<CustomerDetails>();
		
		for(Customer customer: customers.getCustomerList()) {
			Share share = restTemplate.getForObject("http://localhost:8085/shares/" + customer.getShareId(), Share.class);
			CustomerDetails customerDetails = new CustomerDetails(custId, share.getShareName(), customer.getQuantity(), 
																	share.getMarketPrice(), 
																	customer.getQuantity() * share.getMarketPrice(),
																	customer.getShareType());
			customerDetailList.add(customerDetails);
		}
		CustomersDetails customersDetails = new CustomersDetails(customerDetailList);
		return customersDetails;
	}

}
