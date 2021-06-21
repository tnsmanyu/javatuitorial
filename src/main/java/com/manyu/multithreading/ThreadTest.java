package com.manyu.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		SharedPrinter p = new SharedPrinter();
		
		
		ExecutorService executors = Executors.newFixedThreadPool(3);
		
		
		for (int i = 0; i < 6; i++) {
			executors.execute(new AnotherThread(p));
		}
		
		executors.shutdown();
		
//		// TODO Auto-generated method stub
//		MyNewThread myt = new MyNewThread(p);
//		myt.start();
//		
//		
//		new MyNewThread(p).start();
//		new MyNewThread(p).start();
		
//		new Thread(new AnotherThread()).start();;
		
		System.out.println("Application ends");
	}

}



class MyNewThread extends Thread{
	
	SharedPrinter p;
	
	public MyNewThread(SharedPrinter p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(500);
			//code we need
			p.print("manyu.doc", 5);
			System.out.println(Thread.currentThread().getName());
			System.out.println("printing done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class AnotherThread implements Runnable{
	
	SharedPrinter p;
	
	public AnotherThread(SharedPrinter p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
			//code we need
			p.print("manyu.doc", 5);
			System.out.println(Thread.currentThread().getName());
			System.out.println("printing done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}


class SharedPrinter{
	
	//synchronized
	
	public  void print(String doc, int copies) {
		
		synchronized (this) {
			for (int i = 0; i < copies; i++) {
				System.out.println("printing -> "+doc+" copies -> "+(i+1));
			}
		}
		
	}
	
	
	
}

