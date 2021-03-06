package com.cag.day7;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TrialMap {
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		TreeMap<Integer, Student> map2 = new TreeMap<Integer, Student>();
       
map2.put(1001, new Student(1005,"Anu","400"));
map2.put(1002, new Student(1006,"Abhi","450"));
map2.put(1007, new Student(1003,"Tanvi","360"));
map2.put(1000, new Student(1001,"Aanya","456"));
		
System.out.println(map2.pollFirstEntry());



//System.out.println(map2.firstKey());
//System.out.println(map2.lastKey());
		
		
		System.out.println(map.get(1001));
		
		Set<Integer>keys=map.keySet();
		
		//map.clear();
		//System.out.println(map.contains("Anu"));
		System.out.println(map.isEmpty());
		System.out.println(map.replace(1001, "Nithu"));
		
		System.out.println(map2.descendingKeySet());

		for(Integer key:keys) {
			System.out.println("key "+key+" Values "+map.get(key));
		}
		 Collection<String> value=map.values();
	        value.forEach(System.out::println);
	        
	        Set<Map.Entry<Integer, String>> key = map.entrySet();
	        
	        for (Map.Entry<Integer, String> m : key) {
	            System.out.println(m.getKey()  +" Value is "+m.getValue());
	        }
		
	}
}
