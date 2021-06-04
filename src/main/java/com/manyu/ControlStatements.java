package com.manyu;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * String a = args[0];
		 * 
		 * 
		 * if(a.contains("a")) { System.out.println("this is a test"); }else
		 * if(a.contains("b")){ System.out.println("this is not part of if"); }else
		 * if(a.contains("c")) { System.out.println("this is another stmt"); }else {
		 * System.out.println("this is final"); }
		 */
		
		String abc = "aaa";
		
		String abc1;
		
		switch(abc) {
		
		case "add" :
			System.out.println(10+10);
			abc1 = "add";
			break;
		case "multiply":
			System.out.println(10*10);
			abc1 = "multiply";
			break;
		default:
			System.out.println("i have entered default");
		
		}
		




	}

}
