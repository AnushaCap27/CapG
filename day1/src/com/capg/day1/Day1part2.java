package com.capg.day1;

public class Day1part2 {

	 public static void main(String[] args) {

		 

	        // it is called primitive datatype also
	        boolean b = true; // it will take only true or false
	                            // by default it will hold false
	                            // range is true or false;
	                            // 1 it in memory
	        System.out.println("boolean " + b);

	 

	        byte bt = -11;
	        // Range -127 to +128
	        // 8 bit in memory
	        // default is 0
	        // more than range give us cannot convert from int to byte
	        System.out.println("byte " + bt);

	 

	        char c = 65; // ASCII Code
	        char cc = 'C';
	        char ccc = '\u0041'; // Unicode for A
	        // internally it will take the ASCII value of the character and holder it
	        // 0--255
	        System.out.println((char) c);

	 

	        System.out.println((int) cc);
	        System.out.println((char) ccc);

	 

	        short s = 1234; // 16 bit
	                        // it will store number only
	        System.out.println(s);

	 

	        int sint = 1234; // 32 bit
	        // it will store number only
	        System.out.println(s);

	 

	        long l = 1234; // 64 bit
	          //it will store number only 
	        System.out.println(s);
	        
	        
	        float f=1.5555555555555555555555555f;
	        
	        System.out.println(f);
	        
	        Double d=1.3333333333334444444444444444444444444444444444444444444444444;
	        System.out.println(d);
	        

	 

	    }

	 

	
}

