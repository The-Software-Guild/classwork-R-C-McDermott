package com.ryan.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ryan.presentation.ProductPresentation;
// Commented out for spring implementation
//import com.ryan.presentation.ProductPresentationImpl;

public class ProductClient {

	public static void main(String[] args) {
		// Commented out for spring implementation
		//ProductPresentation productPresentation = new ProductPresentationImpl();
		
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("com/ryan/client/prod.xml");
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
