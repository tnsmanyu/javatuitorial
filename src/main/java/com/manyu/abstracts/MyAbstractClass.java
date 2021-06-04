package com.manyu.abstracts;

public abstract class MyAbstractClass {
	
	public abstract void saveMyData(Object obj);
	
	public void connectAndSave(Object obj) {
		System.out.println("I am connecting to cache");
		saveMyData(obj);
	}

}


class MyTestClass {
	
	
	public static void main(String[] args) {
		
		
		MyTestClass my = new MyTestClass();
		
		new MyAbstractClass() {
			
			@Override
			public void saveMyData(Object obj) {
				// TODO Auto-generated method stub
				//saving data here
			}
		}.connectAndSave("save me");
		
		
		new MyAbstractClass() {
			
			@Override
			public void saveMyData(Object obj) {
				// TODO Auto-generated method stub
				//send data to queue
			}
		}.connectAndSave("send me");;
		

	}
	
	
	
}


