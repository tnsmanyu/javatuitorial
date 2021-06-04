package com.manyu.oops;

public class Child extends Parent{
	
	public String abc = "this is a child";
	
	
	public Child(String abc) {
		// TODO Auto-generated constructor stub
		System.out.println("this is a child constructor");
//		abc = "some";
	}

	public Child() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.printMe("manyu");
				
		
	}
	
	@Override
	  protected void printMe() {
		  System.out.println("---------> this is from child class"); 
	  }
	 
	
	protected void printMe(String abc) {
		System.out.println("this is a new method from child -- "+abc);
	}
	
	

}
