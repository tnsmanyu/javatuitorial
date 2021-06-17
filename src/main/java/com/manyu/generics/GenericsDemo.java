package com.manyu.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.manyu.collections.Employee;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.name = "manyu";

		Demo d = new Demo<Employee>();
		d.demo = e;
		
		d.printMe(e);
		
		d.checkNumbers(new Double(10));
		
		//object is super class
		
		
		//List<Employee> -> List<Object>
		
		
		
	}

}


class Demo<A, G, H>{
	
	A demo;
	
	G hero;
	
	H heroin;
	
	<K,V> List<V>  getList(Map<K,V> object) {
		
		List<V> list = new ArrayList<V>();
		for(Map.Entry<K, V> entry : object.entrySet()) {
			list.add(entry.getValue());
		}
		
		return list;
	}
	
	
	
	void printMe(A obj) {
		System.out.println(obj.toString());
	}
	
	
	
	
	<G extends Number> void checkNumbers(G obj) {
		System.out.println(obj);
	}
	
	void check(List<? super Employee> obj) {
		
	}
	
	
	
}

















