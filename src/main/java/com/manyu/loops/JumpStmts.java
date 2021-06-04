package com.manyu.loops;

public class JumpStmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break
		
		int i = 3;
		while(true) {
			System.out.println("printMe");
			i-=1;
			if(i>0) {
				System.out.println("continue");
				continue;
			}
			
			System.out.println("after print");
			
			break;
			
		}
		
		int p = printMe();
	
	}
	
	
	static int printMe() {
		System.out.println("printMe and returning data");
		String data = "manyu";
		if(data.startsWith("m"))
			return;
		
		System.out.println("after methid");
		
		
		while() {
			return;
		}
		
	}
	

}
