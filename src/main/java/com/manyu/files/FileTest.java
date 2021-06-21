package com.manyu.files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		File f = new File("/home/srimanyu/git/repository/javatuitorial/testfile2");
		
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		
		
		System.out.println(f.exists());
		
		
		
		f.renameTo(new File("testfile20"));
		
		FileWriter writer = new FileWriter(new File("newText.txt"));
		
		writer.write("this is a new file i am trying out");
		
		writer.flush();
		writer.close();
		
		
		FileReader fr = new FileReader(new File("newText.txt"));
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		

	}

}
