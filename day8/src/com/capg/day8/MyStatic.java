package com.capg.day8;
interface Trial{
	public void print();
	
	default public void printing() {
		System.out.println("Hello Im printing");
	}
}
class Demo implements Trial{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Im Override");
	}
	static {
		System.out.println("Im Static");
	}
	
}
public class MyStatic{
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.print();
		d.printing();
	}
}
	
