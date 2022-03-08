package com.ryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetails {

	
	@Getter
	@Setter
	private String customerId;
	@Getter
	@Setter
	private String shareName;
	@Getter
	@Setter
	private int quantity;
	@Getter
	@Setter
	private double unitPrice;
	@Getter
	@Setter
	private double totalValuation;
	@Getter
	@Setter
	private String shareType;
}
