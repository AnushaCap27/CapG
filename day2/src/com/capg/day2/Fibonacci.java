package com.capg.day2;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,num1,num2,num3;
		int sum=0;
		System.out.println("enter the number n");
		n=sc.nextInt();
		System.out.println("enter the series numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		while(num2<=n)
		{
			num3=4*num2+num1;
			if(num3>n)
				break;
			else
				num1=num2;
			num2=num3;
			sum+=num2;
		}
		System.out.println(sum);
		
	}

}
