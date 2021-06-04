package com.manyu.exceptions;

public class TestingExceptions {

	public static void main(String[] args) throws NoDataFOund {
		// TODO Auto-generated method stub
			
		String abc = "abc";
		
		try {
		method();
		}catch(Exception e) {
			System.out.println("catched");
			throw new NoDataFOund();
		}
		
		
	}
	
	
	private static void method() throws NumberFormatException{
		int a = Integer.parseInt("abc");
	}

}
