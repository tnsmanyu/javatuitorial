package com.manyu;

public class Test implements A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.a();
		t.manyu1();
		A.manyu("123");
	}

	@Override
	public int a() {
		System.out.println("print a ");
		
		return 0;
	}

	@Override
	public int c() {
		// TODO Auto-generated method stub
		return 0;
	}

}
