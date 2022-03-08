package com.ryan.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Share {
	
	@Getter
	@Setter
	private int shareId;
	@Getter
	@Setter
	private String shareName;
	@Getter
	@Setter
	private double marketPrice;
}
