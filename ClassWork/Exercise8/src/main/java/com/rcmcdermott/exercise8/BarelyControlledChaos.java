/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcmcdermott.exercise8;

import java.util.Random;

/**
 *
 * @author ryan-
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = randColour(); // call color method here
        String animal = randAnimal(); // call animal method again here
        String colorAgain = randColour(); // call color method again here
        int weight = numberGen(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = numberGen(10, 20);  // call number method,
            // with a range between 10 - 20
        int number = numberGen(10000, 20000);  // call number method,
            // with a range between 10000 - 20000
        int time = numberGen(2, 6);  // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    // Method 1
    public static int numberGen(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }
    // Method 2
    public static String randColour() {
        String[] colours = {"green", "blue", "red", "pink", "orange"};
        Random rand = new Random();
        int index = rand.nextInt(colours.length);
        return colours[index];
    }
    // Method 3
    public static String randAnimal() {
        String[] animals = {"pig", "cow", "chicken", "dog", "cat"};
        Random rand = new Random();
        int index = rand.nextInt(animals.length);
        return animals[index];
    }
}
