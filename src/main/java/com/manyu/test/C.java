package com.manyu.test;

import com.manyu.A;
import com.manyu.B;
import com.manyu.Chaining;

public class C extends Chaining implements A{

	public C() {
		super("hi");
		// TODO Auto-generated constructor stub
	}

	
	public static void main() {
		C c = new C();
		c.manyu1();
		c.manyu("");
		
	}

	 static void manyu(String abc) {
		 System.out.println("manyu" + abc);
	 }

	@Override
	public int c() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int a() {
		// TODO Auto-generated method stub
		return 0;
	}


}
