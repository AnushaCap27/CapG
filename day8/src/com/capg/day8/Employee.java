package com.capg.day8;

public class Employee {
	private int ID;
	private String Name;
	private int Salary;
	public Employee(int iD, String name, int salary) {
		super();
		ID = iD;
		Name = name;
		Salary = salary;
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
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

}
