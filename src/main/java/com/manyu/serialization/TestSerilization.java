package com.manyu.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerilization {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
		File file = new File("testfile1");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		
		Employee e = new Employee("manyu", 30);
		
		oos.writeObject(e);
		oos.flush();
		oos.close();
		
	}

}


class Employee implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//POJO
}