package com.manyu.constructor;

import java.lang.reflect.Constructor;

public class ConstructorDemo {
	
	 String demo = "java, pqr";
	

	public static void main(String[] args) throws Exception {

//		ConstructorDemo dempObj1 = new ConstructorDemo();
		
		
		
		ConstructorDemo.printMe();
		
		
		ConstructorDemo demoObj2 = ConstructorDemo.class.newInstance();
		
		Constructor<ConstructorDemo> constructor =  ConstructorDemo.class.getConstructor();
		ConstructorDemo demoObj3 = constructor.newInstance();
	}
	
	public static void printMe() {
		System.out.println("printMe");
	}

}
