package com.capg.day3;

class OnlyPositiveNumber extends Exception{
	OnlyPositiveNumber(String msg){
		super(msg);
	}
}

class Sum{
public int add(int a,int b)throws OnlyPositiveNumber{
	if(a>0&&b>0) {
		System.out.println(a+b);
	}
	else {
		throw new OnlyPositiveNumber("Enter positive number");
	}
	return a+b;
}
}

public class MyChainException {
	
public static void main(String[] args) throws OnlyPositiveNumber {
	callingMethod();
}
	public static void callingMethod() throws OnlyPositiveNumber{
		Sum sum=new Sum();
		int num=sum.add(-10,20);
}
}
