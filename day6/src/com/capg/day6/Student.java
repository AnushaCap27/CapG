package com.capg.day6;

public class Student implements Comparable<Student> {
	int ID;	
	String Name;
	float Marks;
	public Student(int iD, String name, float marks) {
		super();
		ID = iD;
		Name = name;
		Marks = marks;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getMarks() {
		return Marks;
	}
	public void setMarks(float marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
	/*	if(this.getID()>s1.getID())
		{
			return 1;
		}
		else if(this.getID()<s1.getID()) {
			return -1;
		}
		else
		return 0; */
		 return this.getName().compareTo(s1.getName());
	}
}
