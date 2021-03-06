package com.capg.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyListTrial {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		// add method
		list.add(10);
		list.add(1);
		list.add(50);
		list.add(2);
		list.add(100);

		list1.add(10);
		list1.add(1);
		list1.add(2);
		list1.add(100);
		// sorting list
		// sorting the list in reverse order
		Collections.sort(list, Collections.reverseOrder());
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list);

		// deleting elements of list
		// list.clear();
		// System.out.println(list);

		// remove single elements from list
		list.remove(1);
		System.out.println(list);

		// it will search for element in list
		// if element is present return (true)
		// if element is not there it return the false
		System.out.println(list.contains(10));

		// return true if both list are same
		// return false if list are not same
		System.out.println(list.equals(list1));

		// return the value in the given index
		System.out.println(list.get(1));

		// print each element as error
		// list.forEach(System.err::println);

		// return the index value of the element
		System.out.println(list.indexOf(100));

		// return whether list is empty(true) or not(false)
		System.out.println(list.isEmpty());

		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.println("it "+ it.next());
		
		//return size of list
		System.out.println(list.size());
		
		//Update the element using index
		System.out.println(list.set(0, 24));
		System.out.println(list);
	}

}
