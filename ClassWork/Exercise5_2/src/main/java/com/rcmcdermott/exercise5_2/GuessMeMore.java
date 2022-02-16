
package com.rcmcdermott.exercise5_2;

import java.util.Random;
import java.util.Scanner;


public class GuessMeMore {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner inputReader = new Scanner(System.in);
        
        final int chosenNumber = rand.nextInt(201) - 100;
        int guess;
        boolean run = true;
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        
        
        do {
            System.out.println("Your guess: ");
            String playerGuess = inputReader.nextLine();
            guess = Integer.parseInt(playerGuess);
            
            
            if (guess == chosenNumber) {
                System.out.println("Correct!!");
                run = false;
            }
            else if(guess < chosenNumber) {
                System.out.println("Incorrect, you guessed too low!");
            }
            else if(guess > chosenNumber) {
                System.out.println("Incorrect, you guessed too high!");
            }
        } while (run);
        
    }
}
