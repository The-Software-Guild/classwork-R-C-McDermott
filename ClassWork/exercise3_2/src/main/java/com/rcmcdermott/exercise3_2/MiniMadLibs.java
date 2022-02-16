
package com.rcmcdermott.exercise3_2;

import java.util.Scanner;


public class MiniMadLibs {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String firstNoun;
        String firstAdjective;
        String secondNoun;
        String number;
        String secondAdjective;
        String firstPluralNoun;
        String secondPluralNoun;
        String thirdPluralNoun;
        String presentVerb;
        String pastVerb;
        
        System.out.println("Give me a noun: ");
        firstNoun = inputReader.nextLine();
        System.out.println("Give me an adjective: ");
        firstAdjective = inputReader.nextLine();
        System.out.println("Give me another noun: ");
        secondNoun = inputReader.nextLine();
        System.out.println("Give me a number: ");
        number = inputReader.nextLine();
        System.out.println("Give me another adjective: ");
        secondAdjective = inputReader.nextLine();
        System.out.println("Give me a plural noun: ");
        firstPluralNoun = inputReader.nextLine();
        System.out.println("Give me aanother plural noun: ");
        secondPluralNoun = inputReader.nextLine();
        System.out.println("Give me another plural noun: ");
        thirdPluralNoun = inputReader.nextLine();
        System.out.println("Give me a present tense verb: ");
        presentVerb = inputReader.nextLine();
        System.out.println("Give me a past tense verb: ");
        pastVerb = inputReader.nextLine();
        
        
        System.out.print(firstNoun + ": the " + firstAdjective + " frontier. ");
        System.out.print("These are the voyages of the starship " + secondNoun + ". ");
        System.out.print("Its " + number + "-year mission: to explore strange " + secondAdjective +" "+ firstPluralNoun + ", to seek out ");
        System.out.println(secondAdjective +" "+ secondPluralNoun + " and " + secondAdjective +" "+ thirdPluralNoun + ", to boldly " + presentVerb + " where no one has " + pastVerb + " before.");
           
        
              
             
    }
}
