package com.ryan.springclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.ryan")
public class RestApiCustomerDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCustomerDetailsServiceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
