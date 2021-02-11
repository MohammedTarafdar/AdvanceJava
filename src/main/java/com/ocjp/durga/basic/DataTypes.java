package com.ocjp.durga.basic;

public class DataTypes {

	public static void main(String[] args) {
		/* # Why java is considered as a strongly typed language?
		 * 
		 * # Why java is not purely object oriented programming language?
		 * 
		 * # What is the default data type for any integral value?
		 * 
		 * # What is the default data type for any floating value?
		 * 
		 * # What is the default value for each data type?
		 * 
		 */
		
		byte num1 = 10;
		System.out.println("Our byte number is : " + num1);
		
		/* size: 1 byte (8 bits)
		 * range: -2*7 to 2*7-1 (-2 to the power 7 to 2 to the power 7 - 1)
		 * value: -128 to 127
		 */
		
		short num2 = 10000;
		System.out.println("Our short number is : " + num2);
		
		/* size: 2 byte (16 bits)
		 * range: -2*15 to 2*15 (-2 to the power 15 to 2 to the power 15 - 1)
		 * value: -32,768 to 32,767
		 */
		
		int num3 = 10000000;
		System.out.println("Our int number is : " + num3);
		
		/* size: 4 byte (32 bits)
		 * range: -2*31 to 2*31-1 (-2 to the power 31 to 2 to the power 31 - 1)
		 * value: -2,147,483,648 to 2,147,483,647
		 */
		
		long num4 = 123456789012345l;
		System.out.println("Our long nuber is : " + num4);
		
		/* size: 8 byte (64 bits)
		 * range: -2*63 to 2*63-1 (-2 to the power 63 to 2 to the power 63 - 1)
		 * value: 
		 */
		
		float num5 = 10.5f;
		System.out.println("Our float number is : " + num5);
		
		/* size: 4 byte (32 bits)
		 * range:  -3.4e38 to 3.4e38
		 */
		
		double num6 = 3.333333333333333333333333333333333339;
		System.out.println("Our double value is : " + num6);
		
		/* size: 8 byte (64 bits)
		 * range:  -1.7e308 to 1.7e308
		 */
		
		char ch = 'a';
		System.out.println("Our char value : " +ch);
		
		/* size: 2 byte (Unicode)
		 * range:  0 to 65535
		 */
		
		boolean bl = false;
		System.out.println("Our boolean value is : " + bl);
		
		/* size: N/A [VM dependent]
		 * range:  N/A [ but allowed value is true or false ]
		 */
	}

}
