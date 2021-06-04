package com.manyu.oops;

public class GrandChild extends Child{
	
	String name;
	
	public GrandChild(String abc) {
		super("jink");
		System.out.println("this is grand child constructor");
		this.name = abc;
	}


	public static void main(String[] args) {
		GrandChild gc = new GrandChild("something");
		gc.printMe();
	}
	
	protected void printMe() {
		System.out.println("------> this is from gc");
		super.printMe();
	}
	
	protected void printMe(String abc) {
		System.out.println("this is overloading" + abc);
		
	}
	
}