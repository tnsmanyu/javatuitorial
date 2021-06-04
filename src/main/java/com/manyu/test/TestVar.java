package com.manyu.test;

import com.manyu.PrivateTest;
import com.manyu.ProtectedTest;
import com.manyu.PublicTest;

public class TestVar extends ProtectedTest {

	public static void main(String[] args) {
		
		PublicTest test = new PublicTest();
		System.out.println(test.a);
		test.printMe();
		
		PrivateTest test1 = new PrivateTest();
		test1.print();
		
		ProtectedTest test2 = new ProtectedTest();
//		System.out.println(test2.a);
		
		TestVar var = new TestVar();
		System.out.println(var.a);
		
		
		String[] abc = {"manyu"};
		
		for (String string : abc) {
			System.out.println(string);
		}
		
		for(int i=0; i<abc.length; ++i) {
			System.out.println(abc[i]);
		}
		
		do {
			System.out.println(abc);
		}while(abc.length<2);
		
	}

}
