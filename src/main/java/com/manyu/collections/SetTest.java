package com.manyu.collections;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.manyu.enums.ShirtSize;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> objs = new TreeSet<String>();
		
//		List<String> objs = new ArrayList<String>();
		

		objs.add("hyd");
		objs.add("zebra");
		objs.add("manyu");
		objs.add("abc");
		
//		objs123.addAll(objs);
		
		
		objs.forEach(obj -> {
			System.out.println(obj);
		});
		
		
		EnumSet<ShirtSize> enums = EnumSet.allOf(ShirtSize.class); 
		
		Iterator iter = enums.iterator();
		
		
		while (iter.hasNext()) {
			ShirtSize type = (ShirtSize) iter.next();
//			System.out.println(type);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
