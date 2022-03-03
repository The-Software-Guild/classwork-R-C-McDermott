package com.ryan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Products {
	
	@Getter
	@Setter
	private long productId;
	@Getter
	@Setter
	private String productCode;
	@Getter
	@Setter
	private String productName;
	@Getter
	@Setter
	private String productDescription;
	@Getter
	@Setter
	private double productPrice;

}
