package com.manyu.anonymous;

public abstract class Memcache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new  MyAnonymousClass() {
			
			@Override
			public void savedata(Object obj) {
				// TODO Auto-generated method stub
				System.out.println(obj.toString());
			}
		}.connectAndSave(new String("test me"));;
		
		
		
	}
	
	
	public abstract void savedata(Object obj);
	
	
	public void connectAndSave(Object obj) {
		// connect to redis cluster
		
		savedata(obj);
		
		//close connection
	}
	

}
