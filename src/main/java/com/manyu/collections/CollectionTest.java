package com.manyu.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list = new LinkedList<String>();
		List<String> list1 = new LinkedList<String>();
		list1.add("there are 3");
		
		list.add("manyu");
		list.add("sai");
		list.add("rakesh");
		
		
		list.addAll(list1);
		
		
		for (String string : list1) {
			
		}
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			iterator.next();
		}
		
		
		list.listIterator();
		
		
		list.retainAll(list1);
		
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		Stack<String> st = new Stack<String>();
		
		
		
		st.push("1");
		st.push("2");
		st.push("3");
		
		
		st.peek();
		
		
		System.out.println(st.pop());
		
		
		
		
		Vector<String> vector = new Vector<String>();
		
		
		vector.add("manyu");
		
		vector.remove("rakesh");
		
		
		list.listIterator();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
