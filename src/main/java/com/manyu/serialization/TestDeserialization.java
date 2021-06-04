package com.manyu.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(new File("testfile1"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e1 = (Employee) ois.readObject();
		
		System.out.println(e1.getName());
	}

}
