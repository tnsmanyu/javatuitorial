package com.manyu.strings;

public class NewStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "My name is khan";
		String s3 = "khan";
		String s4 = "my name is KHAN";
		
		System.out.println(s1 + s3 + " is a movie");
		System.out.println(s1.concat(s3).concat(" is a movie"));

		
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out.println(s4.toLowerCase().compareTo(s1.toLowerCase()));
		
		
	

	}

}