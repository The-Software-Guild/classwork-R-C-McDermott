package com.ryan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Human {
	
	public Human(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Getter
	@Setter
	@Id
	private String id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	@OneToOne
	private Car car;
}
