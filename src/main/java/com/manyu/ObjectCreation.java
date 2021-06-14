package com.manyu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {
	
	public ObjectCreation() {
		// TODO Auto-generated constructor stub
		System.out.println("printing data");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		//1.
		ObjectCreation obj = new  ObjectCreation();
		
		//2.
		ObjectCreation obj1 = ObjectCreation.class.newInstance();
		
		//3.
		Constructor<ObjectCreation> constructor = ObjectCreation.class.getConstructor();
		ObjectCreation obj2 = constructor.newInstance();
		
		Class.forName()
		
		
		cloning
		
		
	}

}