package com.ryan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="products")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Products {
	
	@Getter
	@Setter
	@Id
	@Column(name="ID")
	private long productId;
	
	@Getter
	@Setter
	@Column(name="PRODUCT_CODE")
	private String productCode;
	
	@Getter
	@Setter
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Getter
	@Setter
	@Column(name="PRODUCT_DESCRIPTION")
	private String productDescription;
	
	@Getter
	@Setter
	@Column(name="PRICE")
	private double productPrice;

}
