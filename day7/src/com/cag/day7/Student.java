package com.cag.day7;

public class Student {
	int ID;	
	String Name;
	String Mark;
	public Student(int iD, String name,String mark) {
		super();
		ID = iD;
		Name = name;
		Mark=mark;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", Mark=" + Mark + "]";
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
	public String getMark() {
		return Mark;
	}
	public void setMark(String mark) {
		Mark = mark;
	}
	
}
