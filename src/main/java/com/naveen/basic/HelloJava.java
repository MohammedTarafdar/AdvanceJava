package com.naveen.basic;

/*	"public" and "class" are two java keywords. The "public" keyword is an access 
 * modifier and "class" keyword is used ti define a class
 * 
 */

public class HelloJava {
	
	public static void main(String [] args) {
	
	System.out.println("Hello World !");
	System.out.println("Hello Tim !");
	
	int myFirstNumber = 5;
	int mySecondNumber = (10*2);
	int myThirdNumber = mySecondNumber/2;
	int myTotal = myFirstNumber+mySecondNumber-myThirdNumber;
	System.out.println("My First Number is: "+myFirstNumber);
	System.out.println("My Total is = "+myTotal);
	
	int myLastNumber = 100-myTotal;
	System.out.println("My last number is ="+myLastNumber);
		
	
	}
	

}
