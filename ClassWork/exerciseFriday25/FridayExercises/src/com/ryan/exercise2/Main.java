package com.ryan.exercise2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	

	public static void main(String[] args) {
		Set<String> days = new LinkedHashSet<String>();
		
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		System.out.println("Days of the week: ");
		for (String i: days) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Length of set: "+ days.size());
		
		// convert to array
		String[] daysArray = new String[days.size()];
		int arrayIndex = 0;
		for (String i: days) {
			daysArray[arrayIndex] = i;
			arrayIndex++;
		}
		System.out.println("Converted to array!");
		System.out.println();
		// Print array
		
		for (int i = 0; i < days.size(); i++) {
			System.out.println(daysArray[i]);
		}
		

	}

}
