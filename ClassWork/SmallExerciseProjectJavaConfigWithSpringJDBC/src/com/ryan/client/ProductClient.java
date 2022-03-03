package com.ryan.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ryan.presentation.ProductPresentation;
// Commented out for spring implementation
//import com.ryan.presentation.ProductPresentationImpl;

public class ProductClient {

	public static void main(String[] args) {
		
		ApplicationContext springContainer = new AnnotationConfigApplicationContext(ProductConfig.class);
		ProductPresentation productPresentation = (ProductPresentation)springContainer.getBean("prodPresentation");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			productPresentation.displayMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			productPresentation.performChoice(choice);
		}
	}

}
