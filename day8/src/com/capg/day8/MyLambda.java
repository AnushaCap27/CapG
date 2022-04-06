package com.capg.day8;

interface Lambda{
	public void print();
}

interface Lambda2{
	public void Interest(int p,int r,int t); 
}

public class MyLambda {
	public static void main(String[] args) {
		Lambda a=() -> {
			System.out.println("welcome to Day 8");
		};
		a.print();
		
		Lambda2 b=(int p,int r,int t)-> {
			int I=(p*r*t)/100;
			System.out.println("interest is:"+I);
		};
		b.Interest(1000,25 , 4);
		
	}

}
