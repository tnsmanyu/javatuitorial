package com.manyu;

public class CmdLineArgs {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		int a = Integer.parseInt(args[1]);
		
		System.out.println(a + 10);
	}

}
