package com.control.statements;


public class IfStatementExample {

	public static void main(String[] args) {
		
		// example of "if-statement"
		
		
		int age1 = 20;
		
		if (age1 > 18) {
			System.out.println("Yes, you are eligible to apply");
		}


		
		// example of "if-eles statement"
		
		int age2 = 15;
		if (age2 > 18) {
			System.out.println("Yes, you are eligible to apply");
		}
		else {
			System.out.println("Sorry, you are eligible to apply");
		}
		
		// example of "if-else-if statement"
		
		String day = "Wednesday";
		
		if(day == "Monday") {
			System.out.println("Today is week day");
		}
		else if (day == "Tuesday") {
			System.out.println("Today is week day");
		}
		else if (day == "Wednesday") {
			System.out.println("Today is week day");
		}
		else if (day == "Thursday") {
			System.out.println("Today is week day");
		}
		else if (day == "Friday") {
			System.out.println("Today is week day");
		}
		else if (day == "Saturday") {
			System.out.println("Today is weekend");
		}
		else if (day == "Sunday") {
			System.out.println("Today is weekend");
		}
		
		// example of "nested if statement"
		
		int age = 24;
		int weight = 45;
		
		if (age > 18) {
			System.out.println("Great! you are adult but not eligible to donate blood.");
			
			if (weight > 50) {
				System.out.println("Congratulation! you are eligible to donate blood.");
			}
		}
		
	}
	
	

}
