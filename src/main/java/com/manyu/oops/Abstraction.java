package com.manyu.oops;

public class Abstraction {
	
	private String abc;
	public String abc1;
	
	public String getData() {
		if(abc!=null) {
			return abc;
		}
		
		return "not valid";
	}

}
