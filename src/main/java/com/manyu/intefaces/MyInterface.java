package com.manyu.intefaces;

public interface MyInterface{
	
	String var = "abc";
	
	 void printMe();
	 
	 default void printAgain() {
		 System.out.println("I am in a default method");
	 }
	 

}

class MyInterfaceImpl implements MyInterface, AnotherInterface, Autditable, Entity{

	@Override
	public void printMe(Object personalData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String printMeAgain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		
	}
	
	//Reflection - is this class implementing Auditable -> if yes -> i will send to auditing queue
	
	
}