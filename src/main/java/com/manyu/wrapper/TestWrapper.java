package com.manyu.wrapper;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 10;
		
		
		Integer i1 = 10;
		
		
		Integer i2 = new Integer(11);
		
		
		
		Boolean b = false;
		
		
		boolean b1 = false;
		
		Boolean b2 = new Boolean(true);
		
		
		String abc = "123";
		
		int q = Integer.parseInt(abc);
		
		q = q+ 321;
		
		System.out.println(b1);

		
		;
		
		if(Boolean.parseBoolean("true")) {
			
		}
		
		
		String p = "10.2";
		double p1 = Double.parseDouble(p);
		
		System.out.println(p1 + 10.3);
		
		
		abc = "abc";
		
		System.out.println(Integer.parseInt(abc));
		
		int t1 = 123;
		Integer t = t1;
		
		int t2 = t;
		
		System.out.println(t);
		
		
		
	}
	
	public Employee getEmployeeById(int id, String fieldToFetch) {
		
		// service layer - > emp object and return it
//		new Employee(name, id);
		return null;
	}

}







class Employee{
	
	int id;
	String name;
	
	Integer salary; //null //Integer.parsetInt()
	//100 fields
	
	
}


















