package com.capg.day5;
import java.util.Arrays;
import java.util.Scanner;

public class MyArrayOperations {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []arr=new int[5];
	int n=arr.length;
	//int temp;
	System.out.println("enter array elements");
	for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	}
	/*for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;				
			}
		}
	}
	System.out.println("largest element of array is:"+ arr[n-1]);
	*/
	Arrays.sort(arr);
	System.out.println("sorted array is:" + Arrays.toString(arr));
	System.out.println("largest number of an array is:"+arr[n-1]);
	System.out.println("largest number of an array is:"+arr[0]);

}
}
