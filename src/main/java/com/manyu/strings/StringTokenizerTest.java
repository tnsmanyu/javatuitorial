package com.manyu.strings;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "manyu, sai* rakesh";
		
		
		StringTokenizer tokens = new StringTokenizer(test);
		boolean testBool = true;
		
		while(tokens.hasMoreElements()) {
			if(testBool) {
				System.out.println(tokens.nextToken(",").trim());
				testBool = false;
			}
			else
				System.out.println(tokens.nextToken("*").trim());
		}
		
	}

}


// tns_manyu@gmail.com
