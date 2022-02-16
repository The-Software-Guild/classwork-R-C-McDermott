package com.rcmcdermott.windowmaster;

import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        // Declaring variables
        float width;
        float height;
        int numberOfWindows;
        
        // User input variables
        String inputWidth;
        String inputHeight;
        String inputNumWindows;
        
        // Variables to be calculated
        float windowArea;
        float windowPerimeter;
        float cost;
        
        // Initialise scanner for input
        Scanner inputScanner = new Scanner(System.in);
        
        // Gettting user input
        boolean isValid = false;
        do {
            System.out.println("Please enter width: ");
            inputWidth = inputScanner.nextLine();
            
            if (inputWidth == null || inputWidth.isEmpty()) {
                System.out.println("Invalid input!");
            }
            else {
                isValid = true;
            }
        } while (!isValid);
        
        isValid = false;
        do {
            System.out.println("Please enter height: ");
            inputHeight = inputScanner.nextLine();
            
            if (inputHeight == null || inputHeight.isEmpty()) {
                System.out.println("Invalid input!");
            }
            else {
                isValid = true;
            }
        } while (!isValid);
        
        isValid = false;
        do {
            System.out.println("Please enter number of windows: ");
            inputNumWindows = inputScanner.nextLine();
            
            if (inputNumWindows == null || inputNumWindows.isEmpty()) {
                System.out.println("Invalid input!");
            }
            else {
                isValid = true;
            }
        } while (!isValid);
        
        
        
        // Converting input to float
        width = Float.parseFloat(inputWidth);
        height = Float.parseFloat(inputHeight);
        numberOfWindows = Integer.parseInt(inputNumWindows);
        
        // Calculate area and perimeter
        windowArea = width * height;
        windowPerimeter = 2 * (width + height);
        
        // Calculate cost
        cost = numberOfWindows * ((3.50f * windowArea) + (2.25f * windowPerimeter));
        
        // Results
        System.out.println("Window width: " + width);
        System.out.println("Window height: " + height);
        System.out.println("Number of windows: " + numberOfWindows);
        System.out.println("Window area: " + windowArea);
        System.out.println("Window perimeter: " + windowPerimeter);
        System.out.println("Cost: " + cost);
    }
}
