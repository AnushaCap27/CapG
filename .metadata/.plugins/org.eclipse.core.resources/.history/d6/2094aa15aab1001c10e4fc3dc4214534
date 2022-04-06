package com.capg.day6;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class Myset {
	public static void main(String[] args) {
		
	
HashSet<Integer> set=new HashSet<Integer>();
HashSet<Integer> set1=new HashSet<Integer>();
set.add(9);
set.add(1);
set.add(5);
set.add(7);
set.add(10);

set1.add(10);
set1.add(7);
set1.add(5);
set1.add(1);

Object[] arr=set.toArray();
System.out.println(arr.length);
for(Object obj:arr)
{
    System.out.println((Integer)obj);
}

set.remove(5);
System.out.println(set);

System.out.println(set.contains(10));

System.out.println(set.equals(set1));

System.out.println(set.isEmpty());

Iterator<Integer> it = set.iterator();
while (it.hasNext())
	System.out.println("it " + it.next());

System.out.println(set.size());
}
}