package com.capg.day3;

import java.util.Scanner;
import java.io.IOException;

class OnlyEven extends Exception {
	OnlyEven(String msg) {
		super(msg);
	}
}

public class MyEvenException {
	public static void main(String[] args) throws OnlyEven {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		try {
			if (num % 2 == 0) {
				System.out.println("even number");
			} else {
				throw new OnlyEven("not a even number");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
