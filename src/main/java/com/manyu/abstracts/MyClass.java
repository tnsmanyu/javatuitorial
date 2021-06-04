package com.manyu.abstracts;

public class MyClass extends MyAbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass my = new MyClass();
		my.printMe();
		my.printMeAgain();
	}

	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		System.out.println("please print me");
	}

}
