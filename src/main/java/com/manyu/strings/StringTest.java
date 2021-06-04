package com.manyu.strings;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = "Hello";
		String S2 = "hello";

//		System.out.println(S2.compareTo(S1));
		
		//hashcode of two same objects are always same
		//but hashcode of 2 different can be same or different
		
		
		S1.intern();
		
		
		byte[] arr = S1.getBytes();
		
		for (byte b : arr) {
//			System.out.println(b);
		}
		
		int i = 10;
		
		printMe(String.valueOf(i));
		
	}
	
	public static void printMe(String str) {
		System.out.println(str);
	}
	

}
