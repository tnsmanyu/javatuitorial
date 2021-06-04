package com.manyu.innerclasses;

//Anonymous class
public abstract class Polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Polygon() {

			@Override
			void printStatement() {
				// TODO Auto-generated method stub
				System.out.println("printMe");
			}
		}.printMe();
		
	
	}

	public void printMe() {
		printStatement();
	}
	
	abstract void printStatement();
	
}
