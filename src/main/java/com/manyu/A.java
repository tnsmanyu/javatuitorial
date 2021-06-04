package com.manyu;

public interface A extends B, D{

	 int a();
	 
	 static void manyu(String abc) {
		 System.out.println("manyu" + abc);
	 }
	
	 default void manyu1() {
		 System.out.println("manyu1");
	 }
}
