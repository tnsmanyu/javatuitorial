package com.manyu;

public class Chaining extends FirstProgram implements Cloneable{
	
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException("cannot clone");
	}
	
	getInstance(){
		return same object
	}
	

}
