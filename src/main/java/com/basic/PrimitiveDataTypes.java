package com.basic;

import java.time.chrono.ThaiBuddhistEra;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		/* Data types specify the different sizes and values that can be stored in the variable. 
		 * There are two types of data types in Java:
		 * Primitive data types: The primitive data types include boolean, char, byte, short, int, 
		 * long, float and double.
		 * Non-primitive data types: The non-primitive data types include Classes, Interfaces, 
		 * and Arrays. 
		 */
		
		// Primitive data types:
		
		// byte
		
		byte num1;
		num1 = 123;
		
		System.out.println("byte can hold whole number between -128 and 127.");
		System.out.println("Default size of this data type: 1 byte.");
		System.out.println("Default value: 0");
		System.out.println("The value of num1 is : "+ num1);
		System.out.println(" ");
		
		// short 
		
		short num2;
		num2 = 12345;
		
		System.out.println("This is greater than byte in terms of size and less than integer.\n"+
		"Its range is -32,768 to 32767." );
		System.out.println("Default size of this data type: 2 byte");
		System.out.println("The value of num2 is : "+num2);
		System.out.println(" ");
		
		// int
		
		int num3;
		num3 = 456789321;
		
		System.out.println("int has a wider range: -2,147,483,648 to 2,147,483,647\n" + 
				"Default size: 4 byte");
		System.out.println("The value of int is : "+num3);
		System.out.println(" ");
		
		//long
		long num4;
		num4 = 1234567899876543210L;
		
		System.out.println("long has wider range than int data type, ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.\n" + 
				"size: 8 bytes\n" + 
				"Default value: 0l");
		System.out.println("The value of long is : "+ num4);
		System.out.println(" ");
		
		// float
		
		float num5;
		num5 = 12.555555556f;
		
		System.out.println("float is sufficient for holding 6 to 7 decimal digits\n" + 
				"size: 4 bytes\n"+ "\"Default value: 0.0f\"");
		System.out.println("The value of float is : "+ num5);
		System.out.println(" ");
		
		// double
		
		double num6;
		num6 = 39.98765432101234567890;
		
		System.out.println("Sufficient for holding 15 decimal digits\n" + 
				"size: 8 bytes\n" +"Default value: 0.0d");
		System.out.println("The value of num6 is : "+ num6);
		System.out.println(" ");
		
		
		// char
		
		char ch;
		ch = 'A';
		
		System.out.println("char can holds characters.\n" + 
				"size: 2 bytes\n"+"Default value: \u0000");
		System.out.println("the value of ch is : "+ ch);
		System.out.println(" ");
		
		// boolean
		
		boolean boolValue;
		boolValue = false;
		
		System.out.println("boolean holds either true of false.\n"+
		"size: 1 bytes\n"+"Default value: false");
		System.out.println("The value of boolValue is : "+ boolValue);
		
		
		
		
		
		
		

	}

}
