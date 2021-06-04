package com.manyu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int a = sc.nextInt(); String str = sc.next();
		 * 
		 * 
		 * while(sc.hasNext()) { String str1 = sc.next(); System.out.println(str1);
		 * if(str1.equals("a")) { break; } }
		 * 
		 * System.out.println(a); System.out.println(str);
		 */
		
		//Buffered Reader
		
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String str2 = "";
		 * 
		 * while((str2 = br.readLine())!=null) { System.out.println(str2); }
		 * 
		 * System.out.println(str2);
		 */
		
		
		//input from a file
		/*
		 * File file = new File("/etc/hosts");
		 * 
		 * BufferedReader br1 = new BufferedReader(new FileReader(file));
		 * 
		 * System.out.println(br1.readLine());
		 * 
		 * String str2 = ""; while((str2 = br1.readLine())!=null) {
		 * System.out.println(str2); }
		 */
		
		
		int a = 1;
		
		float f = 3.2f;
		
		System.out.printf("this is an int - %f", f);
		
		String abc = "manyu";
		
		System.out.println();
		
		System.out.printf("this is a string - %s",abc);
		
		/*
		 * %d %s %f %c
		 */
		
		
		
		
	}
	
}
