package com.manyu.controller;

public class User {

	public static String name = "/User/{id}";
	
	
	public static final String ADMIN = "ADMIN";
	
	
	
	public void getUserName() {
		
		System.out.println(name);
		new Object();
	}
	
	public static void main(String[] args) {
		System.out.println("print -> "+name);
//		printUserName();
		
		User user = new User();
		user.printUserName();
		
		ADMIN = "USER";
		
		
	}
	
	
	 void printUserName() {
		System.out.println(name);
	}
	

}
