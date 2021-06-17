package com.manyu.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Number> a = new ArrayList<Number>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(7.9f);
		
		Print<ArrayList<Number>, Object> p = new Print<ArrayList<Number>, Object>();
		p.print(a);
	}

}

class Print<T extends Collection<Number> & Cloneable , G>{
	
	T manyu;
	
	G manisha;
	
	public void print(T obj) {

		Iterator<Number> iter = obj.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	
	}
	
	public void demo( List<? extends T> manyu) {
		
	}
	
}


class Test{
	
	public static <G, L> List<G> getList(Map<L, G> map){
		
		List<G> list = new ArrayList<G>();
		for (Map.Entry<L,G> ele : map.entrySet()) {
			list.add(ele.getValue());
		}
		
		return list;
	}
	
}




