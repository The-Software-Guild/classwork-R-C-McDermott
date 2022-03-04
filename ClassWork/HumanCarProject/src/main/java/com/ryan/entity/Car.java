package com.ryan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Car {
	
	@Getter
	@Setter
	@Id
	private String id;
	
	@Getter
	@Setter
	private String type;
	
	@Getter
	@Setter
	private String registration;

}
