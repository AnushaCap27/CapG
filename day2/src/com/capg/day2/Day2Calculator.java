package com.capg.day2;
import java.util.Scanner;

public class Day2Calculator {

	public static void main(String args[]) {
		int num1=10;
		int num2=8;
		int result=0;
		char operator;
		Scanner read=new Scanner(System.in);
		System.out.println("operator is");
		operator=read.next().charAt(0);
		switch(operator) {
		case '+' :result=num1+num2;
		break;
		case '-' :result=num1-num2;
		break;
		case '*' : result=num1*num2;
		break;
		case '/' :result=num1/num2;
		break;
		case '%' :result=num1%num2;
		break;
		}
		System.out.println("result is:" + result);
	}
}
