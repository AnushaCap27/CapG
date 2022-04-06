package com.cag.day7;

public class Cat {
	String Name;
	double Height;
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public double getHeight() {
		return this.Height;
	}
	public void setHeight(double height) {
		this.Height = height;
	}
	public Cat(String name, double height) {
		super();
		Name = name;
		Height = height;
	}
	@Override
	public String toString() {
		return "Cat [Name=" + Name + ", Height=" + Height + "]";
	}

}
