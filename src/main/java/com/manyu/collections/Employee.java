package com.manyu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee extends People implements Comparable<Employee>{
	
	public String name; 
	int age;
	
	int salary; 

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Employee)obj).name);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}

}

class Test{
	
	public static void main(String...strings) {
		
		Employee e = new Employee();
		e.name = "manyu";
		e.age = 30;
		e.salary = 100;
		
		Employee e1 = new Employee();
		e1.name = "bhanu";
		e1.age = 50;
		e1.salary = 500;
		
		Employee e2 = new Employee();
		e2.name = "rakesh";
	
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e);
		list.add(e2);
		
		list.forEach(ele -> {
			System.out.println(ele.name);
		});
		
		
//		Collections.sort(list, new sortBySalary());
//		
//		Collections.shuffle(list);
		// -1 not found >= 0 index of found element
		int index = Collections.binarySearch(list, e2, new sortByAge());
		System.out.println(index);
		
//		new Array
		
//		list.forEach(ele -> {
//			System.out.println(ele.name);
//		});
//		
	}
	
}

class sortByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1 == o2)
			return 0;
		
		return (o1.age<o2.age)?-1:1;
	}
	
}


class sortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		
		
		return (o1.salary<o2.salary)?1:-1;
	}
	
}



class AdminEmployee extends Employee{
	
	
}
















