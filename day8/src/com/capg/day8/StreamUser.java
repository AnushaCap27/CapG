package com.capg.day8;

import java.util.ArrayList;
import java.util.Collections;

public class StreamUser {
	public static void main(String[] args) {
		
	
ArrayList<Employee>ls=new ArrayList<Employee>();
ls.add(new Employee(101,"Ajith",2500));
ls.add(new Employee(102,"Sujith",5000));
ls.add(new Employee(103,"pranav",1000));
ls.add(new Employee(104,"Raksh",4500));
ls.add(new Employee(105,"Aanya",3500));

//System.out.println(ls);
ls.stream().filter(e->e.getSalary()>2000).sorted().forEach(e->System.out.println(e.getSalary()));
long count=ls.stream().count();
System.out.println(count);
}
}