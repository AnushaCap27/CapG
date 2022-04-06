package com.capg.day8;
interface LamdaString{
	public void casestring(String s);
}
public class MyLambda4 {
public static void main(String[] args) {
	LamdaString e=(String s) ->{
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

	};
	e.casestring("AnUsHa");
}
}
