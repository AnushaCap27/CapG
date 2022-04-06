package com.capg.day2;
 import java.util.Scanner;
 
public class SimpleInterest {
	public static void main(String[] args) {
		int t;
		float r,p,I;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter p,r,t");
	    p=sc.nextFloat();
	    r=sc.nextFloat();
	    t=sc.nextInt();
	    I=(p*r*t)/100;
		System.out.println("Simple Interest=" +I);
	}

}
