package com.ryan.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CustomersDetails {

	@Getter
	@Setter
	private List<CustomerDetails> customersDetails;
}
