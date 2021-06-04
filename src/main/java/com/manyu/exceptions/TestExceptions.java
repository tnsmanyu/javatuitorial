package com.manyu.exceptions;

public class TestExceptions {

	public static void main(String[] args) throws NoDataFOund {
		// TODO Auto-generated method stub
			
		String test = "abc";
		try{
			parsing(test);
		}catch(Exception e) {
			e.printStackTrace();
			throw new NoDataFOund();
		}
		
		
		//arthimetic, null, number, arrayindexoutofbounds
		
		
		
	}
	
	private static void parsing(String test) throws Exception {
		try {
			int a =  Integer.parseInt(test);
		}catch(NumberFormatException e){
			System.out.println("number format");
			throw new Exception("something bad happened");
		}
	}

}
