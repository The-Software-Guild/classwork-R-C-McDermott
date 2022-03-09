package com.ryan.springclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.ryan")
@EntityScan(basePackages = "com.ryan.entity")
@EnableJpaRepositories(basePackages = "com.ryan.persistence")
public class RestApiCustomerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiCustomerApplication.class, args);
	}


}
