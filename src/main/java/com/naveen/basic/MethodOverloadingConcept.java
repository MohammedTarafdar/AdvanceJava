package com.naveen.basic;

public class MethodOverloadingConcept {
	
	/* # What is method overloading?
	 * 
	 */

	public static void main(String[] args) {
		
		MethodOverloadingConcept overloding = new MethodOverloadingConcept();
		overloding.login();
		overloding.login(347333);
		

	}
	
	public void login() {
		System.out.println("login with 0 parameter");
	}
	
	public void login(String username) {
		System.out.println("login with 1 parameter");
	}
	
	public void login(int phone) {
		System.out.println("login with 1 parameter");
	}
	
	public void login(String username, String password) {
		System.out.println("login with 2 parameters");
	}
	
	public void login(int phone, String password) {
		System.out.println("login with 2 parameters");
	}
	
	public void login(String username, int phone) {
		System.out.println("login with 2 parameters");
	}
	
	

}
