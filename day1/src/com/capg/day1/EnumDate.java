package com.capg.day1;

enum date {
	
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
enum month {
january,february,march, epril, may, june
}
public class EnumDate {
	public static void main(String args[]) {
		
		System.out.println(date.Monday);
		System.out.println(date.Tuesday);
		System.out.println(date.Wednesday);
		System.out.println(date.Thursday);
		System.out.println(date.Friday);
		System.out.println(date.Saturday);
		System.out.println(date.Sunday);
		System.out.println(" ");
		
		System.out.println(month.january);
		System.out.println(month.february);
		System.out.println(month.valueOf("march"));
	}

}
