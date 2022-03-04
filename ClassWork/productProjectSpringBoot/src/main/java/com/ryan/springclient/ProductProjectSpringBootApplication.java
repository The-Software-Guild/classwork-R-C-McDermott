package com.ryan.springclient;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ryan.presentation.ProductPresentation;

@SpringBootApplication(scanBasePackages = "com.ryan")
public class ProductProjectSpringBootApplication implements CommandLineRunner {

	@Autowired
	private ProductPresentation productPresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductProjectSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			productPresentation.displayMenu();
			System.out.println("Enter Choice : ");
			int choice = scanner.nextInt();
			productPresentation.performChoice(choice);
		}
		
	}

}