package com.capg.day4;

class Person {
	public void work() {
		System.out.println("sleeping");
	}

	public void work(int n) {
		System.out.println("Doing home work");
	}

	public void work(double k) {
		System.out.println("Doing school work");
	}

	public void work(String st) {
		System.out.println("Doing Office Work");
	}

}

class Office extends Person {
	@Override
	public void work() {
		System.out.println("work on project");
	}
}

public class MyOverride {
	public static void main(String[] args) {
		Person p = new Person();
		p.work();
		p.work(8);
		p.work(3.987);
		p.work("cap");
		Office f = new Office();
		f.work("anu");

	}

}
