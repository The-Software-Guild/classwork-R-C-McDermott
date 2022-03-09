package com.ryan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Share {
	
	@Getter
	@Setter
	@Id
	private int shareId;
	@Getter
	@Setter
	private String shareName;
	@Getter
	@Setter
	private double marketPrice;
}
