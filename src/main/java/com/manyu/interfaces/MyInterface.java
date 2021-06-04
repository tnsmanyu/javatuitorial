package com.manyu.interfaces;

public interface MyInterface {
	
	private void printMe() {
		System.out.println("printMe");
	}
	
	default void print() {
		printMe();
	}
	
	static void print(String abc) {
		System.out.println("wow");
	}

}
