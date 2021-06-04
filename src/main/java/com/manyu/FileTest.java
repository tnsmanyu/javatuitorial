package com.manyu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("/etc/hosts");
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		
		String st;
		  while ((st = br.readLine()) != null) {
		    System.out.println(st);
		  }
		
		  System.out.println("----------------");
		  
		  Scanner sc = new Scanner(file);
		  
		    while (sc.hasNextLine())
		      System.out.println(sc.nextLine());
		  
	}

}
