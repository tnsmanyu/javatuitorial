package com.manyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.err.println("manyu");
		
		Scanner scan = new Scanner(System.in);
//		while(scan.hasNext()) {
			System.out.println(scan.next());
//		}

		
		System.out.printf("manyu %c", 'c');
		
		System.out.println();
		
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(read.readLine());
		
		
		System.out.println(a);
	}

}
