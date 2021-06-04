package com.manyu.inner;

public abstract class TestClass {

	public String name;

	public static void printMe() {
		System.out.println("printMe");
	}

	public abstract void testMe();

	class MyTestInnerClass extends TestClass{

		public String myName;

		public void printMeAgain() {
			System.out.println("i am an inner class method");
		}

		@Override
		public void testMe() {
			// TODO Auto-generated method stub

		}

	}
	
	class MyAnotherInnerClass extends TestClass{

		@Override
		public void testMe() {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}


	public static void main(String[] args) {


		MyTestInnerClass innerTest = new MyTestInnerClass();
		innerTest.printMeAgain();



	}
	// an outer class or main class cannot be private or static


}
