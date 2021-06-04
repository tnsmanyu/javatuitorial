package com.manyu.arrays;

import java.util.Arrays;
import java.util.List;

public class TestArrays {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		
		int[] array = new int[10];
		
		int[] arr = {1,2,3};
		
		
		for (int i : arr) {
//			System.out.println(i);
		}
		
		
		
		String[] str = new String[20];
		
		str[0] = "manyu";
		
		
		int[][] abc = new int[3][3];
		
		
		for(int i=0; i<3; ++i) {
			for(int j = 0 ; j<3; ++j) {
				abc[i][j] = 1;
				System.out.print(abc[i][j]);
			}
			System.out.println();
		}
		
		Employee[] emps = new Employee[10];
		
		List<Employee> list = Arrays.asList(emps);
		
		
		
	}

}

 class Employee{
	
	String name;
	
}
