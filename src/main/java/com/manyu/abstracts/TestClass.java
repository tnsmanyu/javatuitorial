package com.manyu.abstracts;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyAbstractClass() {
			
			@Override
			public void printMe() {
				// TODO Auto-generated method stub
				System.out.println("this is printMe");
			}
		}.printMeAgain();
		
		
		
		new MyAbstractClass() {
			
			@Override
			public void printMe() {
				// TODO Auto-generated method stub
				System.out.println("blah blah blah");
			}
		}.printMe();
		
		new memcache() {
			
			@Override
			int storeKeyValue() {
				// TODO Auto-generated method stub
				System.out.println("printMe");
				return 10;
			}
		}.connectAndStore();;
		
	}

}


abstract class memcache{
	
	abstract int storeKeyValue();
	
	void connectAndStore() {
		//logic to connect to redis db
		storeKeyValue();
		
		//store value to redis using open connection
	}
	
	
}