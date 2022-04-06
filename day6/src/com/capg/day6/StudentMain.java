package com.capg.day6;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<Student>();
		Student s1=new Student(4,"Anu",456);
		Student s2=new Student(1,"rakesh",356);
		Student s3=new Student(3,"Pragna",256);
		Student s4=new Student(2,"pavan",556);
		Student s5=new Student(5,"Nisha",156);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Collections.sort(list,new SortByName());
		
		//System.out.println(list);
		
		for(Student s:list) {
			System.out.println(s);
		}
	}

}
