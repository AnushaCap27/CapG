package com.cag.day7;

public class Book {

	int BookID;
	String Name;
	int Price;

	public Book(int bookid, String name, int price) { // parametraised constructor
		this.BookID = bookid;
		this.Name = name;
		Price = price;
	}

	public Book() {
		// without parameter
	}

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Book [BookID=" + BookID + ", Name=" + Name + ", Price=" + Price + "]";
	}

	/*
	 * public void print(int BookID,String Name,int Price) {
	 * System.out.println(BookID+" "+Name+" "+Price); }
	 */
	// int []arr=new int[] {1,2,3,4,5,6,7,8};

}
