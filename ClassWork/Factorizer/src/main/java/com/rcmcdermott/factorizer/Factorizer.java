
package com.rcmcdermott.factorizer;

import java.util.Scanner;


public class Factorizer {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String userInput;
        int numInput;
        int factorCount = 1;
        int factorSum = 0;
        
        System.out.println("Enter your number:");
        userInput = inputReader.nextLine();
        numInput = Integer.parseInt(userInput);
        
        System.out.println("The factors of " + numInput + " are:");
        for (int i = 1; i <= (numInput / 2); i++) {
            if (numInput % i == 0) {
                System.out.print(i + " ");
                factorCount++;
                factorSum += i;
            }
        }
        System.out.print(numInput);
        System.out.println();
        System.out.println(numInput + " has " + factorCount + " factors.");
        
        if (factorCount == 2) {
            System.out.println(numInput + " is a prime number.");
        }
        else {
            System.out.println(numInput + " is not a prime number.");
        }
        
        if (factorSum == numInput) {
            System.out.println(numInput + " is a perfect number.");
        }
        else {
            System.out.println(numInput + " is not a perfect number.");
        }
    }
}
