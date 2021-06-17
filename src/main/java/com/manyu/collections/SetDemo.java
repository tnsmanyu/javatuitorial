package com.manyu.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e = new Employee();
		e.name = "manyu";
		

		Employee e1 = new Employee();
		e1.name = "sai";
		
		Employee e2 = new Employee();
		e2.name = "manyu";
		
		
		Set<Employee> set = new HashSet<Employee>();
		
		set.add(e);
		set.add(e1);
		set.add(e2);
		
		
		
		set.forEach(ele -> {
			System.out.println(ele.name);
		});
		
		
		Map<String, Employee> map = new HashMap<String, Employee>();
		
		map.put(e.name, e);
		map.put(e1.name, e);
		map.put(e2.name, e);
		
		System.out.println(map);
		
		
	}

}
