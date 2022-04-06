package com.capg.day6;
import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class MyStack {
	public static void main(String[] args) {
		Stack<Integer> list=new Stack <Integer>();
		Stack<Integer> list1 = new Stack<Integer>();
		Vector<Integer> list2 = new Vector<Integer>();//vector and stack have the same methods
		list.add(9);
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(10);
		/*
		 10
		 7        elements in stack
		 5
		 1
		 9
		 */
		list1.add(10);
		list1.add(7);
		list1.add(5);
		list1.add(1);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		System.out.println(list.contains(10));

		System.out.println(list.equals(list1));

		System.out.println(list.get(1));
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.indexOf(100));
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext())
			System.out.println("it " + it.next());
		
		System.out.println(list.size());

		System.out.println(list.set(0, 24));
		
		System.out.println(list);
		
		System.out.println(list.push(100));
		System.out.println(list);
		
		System.out.println(list.pop());//last in first out LIFO
		System.out.println(list);
		
		System.out.println(list.peek());
	}

}
