package com.manyu.intefaces;

public interface AnotherInterface {
	
	 String demo = "i am final";
	 
	 
	  void printMe(Object personalData);
	  
	  String printMeAgain();
	  
	  default void addCustomFields() {
		  System.out.println("these are my custom fields");
	  }
	
	
}


 class Manyu implements AnotherInterface{
	
	public static void main(String args[]) {
		System.out.println(AnotherInterface.demo);
		
		Manyu m = new Manyu();
		m.printMe(new Object());
		
		m.addCustomFields();
	}
	

	@Override
	public void printMe(Object personalData) {
		// TODO Auto-generated method stub
		System.out.println("printMe");
	}


	@Override
	public String printMeAgain() {
		return "";
	}
	
	
}
 
 
 interface UserService{
	 public void save();
 }
 
 
 
 class UserServiceImpl implements UserService{
	 
	 UserDao userDao;
	 
	 
	 public void save() {
		 
		 validate();
		 addToCache();
		 
		 userDao.save();
	 }


	public void addToCache() {
		// TODO Auto-generated method stub
		
	}


	public void validate() {
		// TODO Auto-generated method stub
		
	}
	 
	 
 }
 
 
 class UserDao{

	public void save() {
		// TODO Auto-generated method stub
		
	}
	 // connect to db
 }
 
 class AccountsService{
	 
	 UserService service;
	 
	 public void name() {
		service.addToCache();
		service.validate();
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 