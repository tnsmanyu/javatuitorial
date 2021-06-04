package com.manyu.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Student stu = new Student(1, "manyu", 8000);
		 * 
		 * File file = new File("manyutest.ser");
		 * 
		 * ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		 * 
		 * oos.writeObject(stu);
		 * 
		 * 
		 * oos.close();
		 */
		 
		
		
		
		//desrialization
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("manyutest.ser")));
		Student student = (Student) ois.readObject();
		
		System.out.println(student.getName());
		ois.close();
		
	}


}


class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6147206477492674L;
	int id;
	String name;
	
	Integer stipend;
	
	int i;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStipend() {
		return stipend;
	}

	public void setStipend(Integer stipend) {
		this.stipend = stipend;
	}

	public Student(int id, String name, Integer stipend) {
		super();
		this.id = id;
		this.name = name;
		this.stipend = stipend;
	} 
	
}

