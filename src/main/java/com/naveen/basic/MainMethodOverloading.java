package com.naveen.basic;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("I am one");
		
		MainMethodOverloading.main("two");
		MainMethodOverloading.main(3);
		

	}

	public static void main(String main) {
		System.out.println("I am two");

	}

	public static void main(int num) {
		System.out.println("I am three");

	}

}
