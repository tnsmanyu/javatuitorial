package com.manyu.enumstest;


public enum ShirtSize implements MyEnumInterface{
	
	XL("xtra large"), L("large"), M();
	
	String name;
	
	public String getName() {
		return name;
	}

	private ShirtSize(String name) {
		this.name = name;
	}

	@Override
	public String getAnotherName() {
		// TODO Auto-generated method stub
		return this.name+" is my size";
	}
	
}


interface MyEnumInterface{
	
	public String getAnotherName();
	
	
}


class TestClass{
	
	
	public static void main(String args[]) {
		System.out.println(ShirtSize.XL.getName());
		
		
		System.out.println(ShirtSize.XL.compareTo(ShirtSize.XL));
		
		
		System.out.println(ShirtSize.XL.toString());
		
		
		ShirtSize[] sizes =  ShirtSize.values();
		for (ShirtSize shirtSize : sizes) {
			System.out.println(shirtSize.getName());
		}
		
		
		
		System.out.println(ShirtSize.XL.getAnotherName());
		
		
		
		
	}
	
}
// XL - xtra large