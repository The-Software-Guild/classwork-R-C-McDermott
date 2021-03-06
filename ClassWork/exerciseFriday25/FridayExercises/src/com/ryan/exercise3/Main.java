package com.ryan.exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static String userInput;

	public static void main(String[] args) throws phonebookNameException {
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		phoneBook.put("Ryan", 1235511);
		phoneBook.put("Katie", 23493452);
		phoneBook.put("Jim", 2342952);
		phoneBook.put("Julie", 82657926);
		
		Set<String> names = phoneBook.keySet();
		try {
			System.out.println("Enter name: ");
			userInput = scanner.nextLine();
			if (checkName(userInput, names)) {
				throw new phonebookNameException("No name in phonebook!");
			}
			System.out.println(userInput + "'s phone number: " + phoneBook.get(userInput));
		}
		catch (phonebookNameException e) {
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();
		}
		
		
	}
	
	public static boolean checkName(String name, Set<String> names) {
		for (String n: names) {
			if (name.equals(n)) {
				return false;
			}
		}
		return true;	
	}

}
