package com.cag.day7;

import java.util.HashMap;

public class Library {
	public static void main(String[] args) {
		HashMap<Integer,Book>map=new HashMap<Integer,Book>();
		
		map.put(1001, new Book(101,"Fear Not",500));
		map.put(1002, new Book(102,"War and Peace",900));
		
		
		Book b=new Book(103,"Harry Potter",1000);
		map.put(1003, b);
		
		Book b1=new Book(104,"Life",2000);
		map.put(1004, b1);
		
		//System.out.println(map);
		//b.print(105, "kanooru", 350);
	}

}
