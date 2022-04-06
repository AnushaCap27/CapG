package com.capg.day6;

import java.util.Comparator;

public class SortByID implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		// TODO Auto-generated method stub
		if(obj1.getID()>obj2.getID()) {
			return 1;
		}
		else if(obj1.getID()<obj2.getID()) {
			return -1;
		}
		else
			return 0;
	}

}
