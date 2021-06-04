package com.manyu;

public class Chaining extends FirstProgram{
	
	public Chaining(String a) {
		super(a);
		System.out.println("chaining called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chaining("a");
	}
	
	
	void manyu() {
		System.out.println("manyu");
	}

}
