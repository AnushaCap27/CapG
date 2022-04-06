package com.capg.day3;
//import java.io.IOError;
//import java.io.IOException;
import java.util.Scanner;
class OnlyPositiveNumberAllowed extends Exception
{
	OnlyPositiveNumberAllowed(String msg)
	{
		super(msg);
	}
}

public class MyCustomException {
public static void main(String[] args)throws OnlyPositiveNumberAllowed {
	Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			try {
	if(num>0)
	{
		System.out.println(num);
	}
	else {
		throw new OnlyPositiveNumberAllowed("Only positive number");
	}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
}
}
