package com.capg.day8;
interface Lambdapos{
	public void posnumber(int n);
}
public class MyLambda3 {
	public static void main(String[] args) {
		Lambdapos c=(int n)-> {
			if(n>=0) {
				System.out.println(n+" is a positive number");
			}
			else
				System.out.println(n+" is an negative number");
		};
		c.posnumber(-10);
	}

}
