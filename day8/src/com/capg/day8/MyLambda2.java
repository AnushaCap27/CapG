package com.capg.day8;

interface Lambda3{
	public void evenOdd(int num);	
}
public class MyLambda2 {
	public static void main(String[] args) {
		Lambda3 even=(int num)->{
			if(num%2==0) {
				System.out.println(num+" is an even number");
			}
			else
				System.out.println(num+" is an odd number");
			
		};
		even.evenOdd(239);
	}

}
