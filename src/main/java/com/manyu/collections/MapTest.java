package com.manyu.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new WeakHashMap();
		
		map.put("manyu", "hyd");
		map.put("sai", "texas");
		map.put("rakesh", "cali");
		
		
		Set set =  map.keySet();
		for (Object str : set) {
//			System.out.println(str);
//			System.out.println(map.get(str));
		}
		
		
		Collection c = map.values();
		Iterator iter =  c.iterator();
		
		while (iter.hasNext()) {
			Object object = (Object) iter.next();
			
//			System.out.println(object);
			
		}
		
		
		//EntrySet
		Set<Map.Entry> set1 = map.entrySet();
		for (Entry object : set1) {
			System.out.println(object.getKey() + "  --->  "+object.getValue());
			
			
		}
		
		
		
		
	}

}
