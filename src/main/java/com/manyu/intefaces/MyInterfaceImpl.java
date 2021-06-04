package com.manyu.intefaces;

public class MyInterfaceImpl implements MyInterface{

	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		System.out.println("printMe");
	} 
	
	public static void main(String args[]) {
		MyInterface my = new MyInterfaceImpl();
		my.printMe();
		
		MyInterface.printMeAgain();
		
		System.out.println(MyInterface.var);
		
		my.newMethod();
	}

	@Override
	public void newMethod() {
		// TODO Auto-generated method stub
		System.out.println("i am in new method");
	}

}
