package com.ryan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ryan.entity.CustomerDetails;
import com.ryan.entity.CustomersDetails;
import com.ryan.service.CustomerDetailsService;

@Controller
public class CustomerDetailsController {
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@RequestMapping("/")
	public String getMainPageController() {
		return "index";
	}
	
	@RequestMapping("/searchCustomerDetails")
	public String getSearchCustomerDetailsPage() {
		return "searchCustomerDetailsPage";
	}
	
	@RequestMapping("/searchCustomer")
	public ModelAndView searchCustomerController(@RequestParam("customerId") String id) {
		ModelAndView modelAndView=new ModelAndView();
		CustomersDetails customersDetails = customerDetailsService.getCustomersDetailsById(id);
		List<CustomerDetails> customerDetailsList = customersDetails.getCustomersDetails();
		modelAndView.addObject("custDetails", customerDetailsList);
		modelAndView.setViewName("showCustomersDetails");
		return modelAndView;
	}

}
