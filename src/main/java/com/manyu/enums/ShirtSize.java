package com.manyu.enums;

public enum ShirtSize implements MyTestInterface{
	
	XL("Xtra Large", "Extra Large"), L("Large", "large"), M("Medium",""), S("Short","");
	
	private String fullName;
	
	private String alias;
	
	public String getFullName() {
		return fullName+getMyShirtZie();
	}
	
	public String getAlias() {
		return alias;
	}

	private ShirtSize(String str, String anotherName) {
		this.fullName = str;
		this.alias = anotherName;
	}
	
	
	public static ShirtSize lookup(String value) {
		ShirtSize[] sizes = ShirtSize.values();
	}

	@Override
	public String getMyShirtZie() {
		// TODO Auto-generated method stub
		return " is my size";
	}
	
}


class ShirtColor implements MyTestInterface, AUdit, Entity{
	

	
}



class Test{
	
	public static void main(String[] args) {
		
		
//		ShirtSize.L
		
		System.out.println(ShirtSize.XL);
		
		System.out.println(ShirtSize.XL.getFullName());
		
		System.out.println(ShirtSize.XL.name());
		
	
		
		
	}
	
	private static String myMethod(ShirtSize s) {
		return ShirtSize.S.name();
	}
	
	
	
}





interface MyTestInterface{
	
	
}
























