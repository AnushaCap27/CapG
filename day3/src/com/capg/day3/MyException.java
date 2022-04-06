package com.capg.day3;

public class MyException {
public static void main(String[] args) {
        
        try
        {
        int a=10;
        int b=0;
        int c=a/b;
          System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        finally {
        	System.out.println("finally hello");
        }  
        try {
        	int [] a=new int[8];
        	System.out.println(a[10]);
        }
        catch(Exception e){
        	System.out.println(e.getMessage());
        }
        finally {
        	System.out.println("finally hello");
        }
    }
}


