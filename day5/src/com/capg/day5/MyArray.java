package com.capg.day5;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar1 = new int[6];
		double[] ar2 = new double[9];
		String[] ar3 = new String[8];
		float[] ar4 = new float[5];
		
		//int
		System.out.println("enter the INT array elements ");
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("array elements are");
		for (int i = 0; i < ar1.length; i++)
			System.out.print( ar1[i]+ " " +"\n");
		
	//double	
		System.out.println("enter the DOUBLE array elements ");
		for (int j = 0; j < ar2.length; j++) {		
			ar2[j]=sc.nextDouble();
		}
		System.out.println("array elements are");
		for (int j = 0; j< ar2.length; j++)
			System.out.print( ar2[j]+ " "+"\n");
		
		//String
		System.out.println("enter the STRING array elements ");
		for (int k = 0; k < ar3.length; k++) {			
			ar3[k]=sc.nextLine();
		}
		System.out.println("array elements are");
		for (int k = 0; k < ar3.length; k++)
			System.out.print( ar3[k]+ " "+"\n");
		
		//Float
		System.out.println("enter the FLOAT array elements ");
		for (int m = 0; m < ar4.length; m++) {
			ar4[m]=sc.nextFloat();
		}
		System.out.println("array elements are");
		for (int m = 0; m < ar4.length; m++)
			System.out.print( ar4[m]+ " "+"\n");
	}
}
