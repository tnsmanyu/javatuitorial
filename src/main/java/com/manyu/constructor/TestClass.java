package com.manyu.constructor;

import com.manyu.constructor.InnerClassDemo.InnerClass;

public class TestClass extends A {
	

	
	public TestClass(String abc) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		InnerClassDemo demo = new InnerClassDemo();
		InnerClass clas = new InnerClass();
		clas.printMe();
		
	}

}
