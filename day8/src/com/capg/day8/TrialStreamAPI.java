package com.capg.day8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TrialStreamAPI {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(-2);
	list.add(2);
	list.add(-19);
	list.add(9);
	list.add(10);
	Stream<Integer>st=list.stream();
	long count=list.stream().filter(e->e>0).count();
	System.out.println(count);
	list.stream().filter(e->e<0).forEach(System.out::println);
}
}
