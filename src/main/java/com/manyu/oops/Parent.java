package com.manyu.oops;

public class Parent {

	public Parent() {
		// TODO Auto-generated constructor stub
		
		System.out.println("this is a parent constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.printMe();
	}
	
	protected void printMe() {
		System.out.println("printMe");
	}

}
