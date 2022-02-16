
package com.rcmcdermott.exercise5_1;

import java.util.Random;


public class ALittleChaos {
    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);
        
        // Changing randomizer.nextInt(101) to randomizer.nextInt(51) + 50
        // changes the range from 0-100 to 50-100

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
        
        
        // you can include random numbers in a math statement
        // e.g.
        int testNum = randomizer.nextInt(101) + randomizer.nextInt(101);
        System.out.println("test: " + testNum);
        
        // Random double bertween 2.0 and 8.0
        double testNumTwo = randomizer.nextDouble() * (8 - 2) + 2;
        System.out.println("test 2: " + testNumTwo);
    }
}
