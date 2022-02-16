
package com.rcmcdermott.exercise4_2;

import java.util.Scanner;

public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } 
            else if (action.equals("stick your hand in")) {
                System.out.println("You stick your hand inside the mailbox.");
                System.out.println("Something grabs your arm!");
                System.out.println("Attempt to pull your arm out or remain calm?");
                action = userInput.nextLine();
                if (action.equals("pull arm out")) {
                    System.out.println("You struggle to pull your arm out.");
                    System.out.println("The grip tightens around your arm.");
                    System.out.println("Your arm is lost!");
                }
                else if (action.equals("remain calm")) {
                    System.out.println("You remain calm and do not struggle.");
                    System.out.println("Your arm is slowly released.");
                    System.out.println("...close one!");
                }
            }
        } 
        else if (action.equals("go to the house")) {
            System.out.println("You enter the house.");
            System.out.println("It's very cold in here!");
            System.out.println("Leave house or continue into the foyer?");
            action = userInput.nextLine();
        }
        if (action.equals("leave house")) {
            System.out.println("Something doesn't seem right here...");
            System.out.println("You leave the house and run for your life!");
        }
        else if (action.equals("continue")) {
            System.out.println("The foyer is dimly lit.");
            System.out.println("You notice a shadowy figure at the top of the staircase...");
        }
    }
}
