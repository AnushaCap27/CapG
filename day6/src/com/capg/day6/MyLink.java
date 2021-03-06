package com.capg.day6;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class MyLink {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		list.add(9);
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(10);

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
		
		Iterator<Integer> it = list.descendingIterator();
		while (it.hasNext())
			System.out.println("it " + it.next());
		
		System.out.println(list.size());

		System.out.println(list.set(0, 24));
		
		System.out.println(list);
		
		//adding element at tail,first and last
		list.offer(12);
		System.out.println(list);
		list.offerFirst(20);
		list.offerLast(15);
		System.out.println(list);
		
		//return element at head,first element,last element
		System.out.println(list.peek()); 
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		
		//poll-return and remove head
		System.out.println(list.poll());
		//pollfirst-return and remove first element
		System.out.println(list.pollFirst());
		//polllast-return and remove last element
		System.out.println(list.pollLast());
		System.out.println(list);
	}

}
