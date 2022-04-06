package com.capg.day4;

class Bird {

	String Name;
	String Color;
	float Size;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public float getSize() {
		return Size;
	}

	public void setSize(float size) {
		Size = size;
	}

	public Bird() {

	}

	public Bird(String name, String color, float size) {
		super();
		Name = name;
		Color = color;
		Size = size;
	}

	public void print() {
		System.out.println("name " + this.Name);
		System.out.println("color " + this.Color);
		System.out.println("name " + this.Size);

	}
}

public class Test {
	public static void main(String[] args) {
		Bird b = new Bird("parrot","green",4);
		b.print();

	}

}
