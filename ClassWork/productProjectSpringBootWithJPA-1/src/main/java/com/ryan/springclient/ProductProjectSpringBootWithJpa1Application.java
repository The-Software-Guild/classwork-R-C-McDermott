package com.ryan.springclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ryan.persistence.ProductDao;

@SpringBootApplication(scanBasePackages="com.ryan")
@EntityScan(basePackages="com.ryan.entity")
@EnableJpaRepositories(basePackages="com.ryan.persistence")
public class ProductProjectSpringBootWithJpa1Application implements CommandLineRunner {

	@Autowired
	private ProductDao productDao;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductProjectSpringBootWithJpa1Application.class, args);
	}
/*
	@Override
	public void run(String... args) throws Exception {
		List<String> prodNames = productDao.getProductsByPrice(100);
		for (String name: prodNames) {
			System.out.println(name);
		}
	}
*/	
	@Override
	public void run(String... args) throws Exception {
		int rows = productDao.deleteProductByName("prodname");
		if (rows > 0) {
			System.out.println("Product deleted!");
		}
		else {
			System.out.println("Product not found");
		}
	}
}
