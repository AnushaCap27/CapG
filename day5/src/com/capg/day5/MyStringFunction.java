package com.capg.day5;

public class MyStringFunction {
	public static void main(String[] args) {
		String com="Capgemini";
		String me=new String("Anusha");
		//charAt
		System.out.println(com.charAt(4));
		System.out.println(me.charAt(4));
		
		//compareTo
		String a="H";
		String b="a";
		String c=" ";
		String d="   My name is Anu   ";
		System.out.println(a.compareTo(b));
		
		//compareToIgnoreCase
		System.out.println(a.compareToIgnoreCase(b));
		
		//concat
		System.out.println(com.concat(me));
		
		//contains
		System.out.println(com.contains("gemini"));
		
		//indexOf
		System.out.println(com.indexOf("a"));
		
		//isBlank
		System.out.println(c.isBlank());
		
		//lastIndexOf
		System.out.println(me.lastIndexOf("n"));
		
		//length
		System.out.println(me.length());
		
		//replace
		System.out.println(com.replace("C", "M"));
		
		//subSequence
		System.out.println(me.subSequence(1,6));
		
		//toUpperCase AND toLowerCase
		System.out.println(me.toUpperCase());
		System.out.println(me.toLowerCase());
		
		//trim
		System.out.println(d.trim());
}

}
