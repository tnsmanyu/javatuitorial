package com.manyu.constructor;

public class InnerClassDemo {

	public static void main(String[] args) {
		InnerClassDemo demo = new InnerClassDemo();
//		InnerClass clas = demo.new InnerClass();
//		clas.printMe();
		
		demo.printMe();
	}
	
	private void printMe() {
		// TODO Auto-generated method stub
		InnerClass inner = new InnerClass();
		inner.printMe();
	}

	static class InnerClass{
		
		public void printMe() {
			System.out.println("printMe");
		}
		
	}

}
