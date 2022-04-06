package com.capg.day3;

//import java.io.IOError;
	//import java.io.IOException;
	import java.util.Scanner;
	class OnlyMajor extends Exception
	{
		OnlyMajor(String msg)
		{
			super(msg);
		}
	}

public class CustomDemoAge18 {
	
	public static void main(String[] args)throws OnlyMajor {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Age");
				int num=sc.nextInt();
				
				
		try {
		if(num>=18)
		{
			System.out.println("Eligible");
		}
		else {
			throw new OnlyMajor("Age is less than 18");
		}
			}
		
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}	
	
}
