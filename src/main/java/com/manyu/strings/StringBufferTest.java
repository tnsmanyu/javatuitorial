package com.manyu.strings;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(name());
		
	}
	
	
	private static String name() {
		StringBuilder sb = new StringBuilder();
		
		
		
		sb.append("this");
		sb.append(" is");
		sb.append(" sb");
		sb.append("casxcas");
		
		
		sb.append("csadcsac");
		
		
		
		sb.append(false);
		
		
		sb.insert(5, false);
		
		System.out.println(sb.capacity());
		
		return sb.toString();
		
	}

}
