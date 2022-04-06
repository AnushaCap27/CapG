package com.capg.day4;

class Employee1{
	private int EmpID;
	private String EmpName;
	
	public Employee1(int id,String Name) {
		this.EmpID=id;
		this.EmpName=Name;
	}
	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int id) {
		this.EmpID = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String Name) {
		this.EmpName =Name;
	}
}
public class MyEncapsulation {
	public static void main(String[] args) {
		Employee1 e=new Employee1(101,"abhi");
		System.out.println(e.getEmpID());
		System.out.println(e.getEmpName());
	}

}
