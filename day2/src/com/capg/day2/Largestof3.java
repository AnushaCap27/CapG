package com.capg.day2;
import java.util.Scanner;

public class Largestof3 {

	public static void main(String args[]) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&b>c) {
			System.out.println("a is greater");
		}
		else if(b>a&&b>c) {
			System.out.println("b is bigger");
		}
		else
			System.out.println("c is bigger");
		
	}
}
