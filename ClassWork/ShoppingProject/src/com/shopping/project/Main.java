package com.shopping.project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        // Create products
		Product p1 = new Product("TV", 101, 4000.00);
		Product p2 = new Product("Stereo", 102, 1000.00);
		Product p3 = new Product("PC", 103, 1500.00);
		Product p4 = new Product("Laptop", 104, 1000.00);
		Product p5 = new Product("Phone", 105, 900.00);

        // Array for all available products
        Product[] availableProducts = new Product[] {p1, p2, p3, p4, p5};

		Customer c1 = new Customer("Ryan", 123131);

		c1.printCustomerInfo();
        promptInput(c1, inputReader, availableProducts);
		c1.iterateCart();
		System.out.println("Total price: £" + c1.getTotalPrice());
	}

    public static void promptInput(Customer c, Scanner s, Product[] available) {
        boolean continueLoop = true;
        int j = 0;
        Product[] cart = new Product[5];
        do {
            System.out.println("Would you like to add to your shopping cart? (y/n)");
            String userInput = s.nextLine();
            if (userInput.equals("y")) {
                printAvailbleProducts(available);

                // input
                System.out.println("Add item number:");
                String itemInput = s.nextLine();
                int itemNumber = Integer.parseInt(itemInput);

                // add to cart
                cart[j] = available[itemNumber - 1];
                System.out.println("Item added!");
                j++;
            } else {
                continueLoop = false;
                System.out.println("...");
            }
        } while (continueLoop);

        c.setCart(cart);
    }

    public static void printAvailbleProducts(Product[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.println((i + 1) + ". " + p[i].getProductName() + ": £" + p[i].getProductPrice());
        }
    }


}
