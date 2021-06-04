package com.manyu.intefaces;

import java.util.StringTokenizer;

public interface Autditable {

}



class Test{
	
	public static void main(String...strings) {
		String s = String.join("*","Welcome", "to", "studytonight.com");
	    System.out.println(s);        
	    
	    
	    
	    String r = new String();
	    System.out.println(r);
	    
	    
	    
	    System.out.println("Hello".compareTo("hello"));
	    
	    
	    byte[] b = "abc".getBytes();
	    
	    for (byte c : b) {
			
	    	System.out.println(c);
		}
	    
	    
	    StringBuffer str = new StringBuffer("test");
		str.insert(2, 123);
		System.out.println(str);
	    
		
		
		StringTokenizer obj = new StringTokenizer("Welcome to studytonight"," ");  
		System.out.println(obj.countTokens());
		
		int i = Integer.valueOf("10");
		System.out.println(i);
		
		
	}
	
}