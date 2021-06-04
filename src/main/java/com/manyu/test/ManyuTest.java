package com.manyu.test;

import com.manyu.TestAbstract;

public class ManyuTest {
	
	private int abc;
	
	private String name;
	
	public String getName() {
		return name.replace("_", "."); //rakesh_name - rakesh.name
	}

	public void setName(String name) {
		this.name = name+"_name"; //rakesh_name
	}

	public ManyuTest() {
		System.out.println("my man");
		// TODO Auto-generated constructor stub
	}

	protected void manyu() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String...strings) {
//		ManyuTest t = new ManyuTest();
		
		TestAbstract t1 = new TestAbstract() {
			
			@Override
			protected void manyu() {
				// TODO Auto-generated method stub
				System.out.println("inside");
				
			}
		};
		
		DefaultTest1 df = new DefaultTest1();
		
	}
	
	public class anotherClass{
		
	}

}


















