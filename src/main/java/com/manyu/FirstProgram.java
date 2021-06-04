package com.manyu;

public class FirstProgram {
	
	public FirstProgram() {
		System.out.println("simple constructor");
	}
	
	public FirstProgram(String a) {
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		System.out.println("Hello world...!");
		for (String string : args) {
			System.out.println(string);
		}
	}

}
