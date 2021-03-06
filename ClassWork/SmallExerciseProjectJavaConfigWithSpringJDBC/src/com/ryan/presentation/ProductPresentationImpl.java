package com.ryan.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ryan.entity.Products;
import com.ryan.service.ProductService;

@Component("prodPresentation")
public class ProductPresentationImpl implements ProductPresentation {

	@Autowired
	private ProductService productService;
	//private ProductService productService = new ProductServiceImpl();
	
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}


	@Override
	public void displayMenu() {
		System.out.println("~~~~~~ Menu ~~~~~~~");
		System.out.println("1. Display products");
		System.out.println("2. Search product by Id");
		System.out.println("3. Add product to database");
		System.out.println("4. Exit");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
	}
	
	
	@Override
	public void performChoice(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			List<Products> productList=productService.getAllProducts();
			System.out.println("Product List");
			for(Products product: productList) {
				System.out.println(product);
			}
			break;
		case 2:
			System.out.println("Please enter product id: ");
			int idChoice = scanner.nextInt();
			Products productId = productService.getProductById(idChoice);
			if (productId != null) {
				System.out.println(productId);
			}
			else {
				System.out.println("Product does not exist!");
			}
			break;
		case 3:
			Products product = new Products();
			System.out.println("Please enter product id: ");
			product.setProductId(scanner.nextLong());
			System.out.println("Please enter product code: ");
			product.setProductCode(scanner.next());
			System.out.println("Please enter product name: ");
			product.setProductName(scanner.next());
			System.out.println("Please enter product description: ");
			scanner.nextLine();
			product.setProductDescription(scanner.nextLine());
			System.out.println("Please enter product price: ");
			product.setProductPrice(scanner.nextDouble());
			
			if (productService.saveProduct(product)) {
				System.out.println("Product saved successfully!");
			}
			else {
				System.out.println("No product inserted!");
			}
			break;
		case 4:
			System.out.println("Thanks for using product Management System!");
			scanner.close();
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
			
		}

	}

}
