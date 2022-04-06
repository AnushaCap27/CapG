package com.capg.day2;
//create a application to store employee details as
//1 id
//2 name
//3 salary



//POJO --plain old java object



//it is blueprint for object



//create POJO class for student 5 attribute and some method
//create class for mobile
//create class for car
//create class for fan
//one class by yourself




class Employee {
//it is belong to employee class
//member variable    
//variable
  int id;
  String name;
  double salary;



//method
  // setter method
  public void setID(int id) {
      this.id = id;
  }



  public void setName(String name) {
      this.name = name;
  }



  public void setSalary(double salary) {
      this.salary = salary;
  }



  // main method
//constructor
//Normal methods        
//these are special method in java
//it have the same name as class name
  // Constructor is without parameters is called default method



  public Employee() {

  }

  public Employee(int id, String name, double salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
  }

  public Employee(int id, String name) {
      this.id = id;
      this.name = name;
  }

  public Employee(int id) {
      this.id = id;
  }
  public Employee(String name) {
      this.name = name;
  }

  public Employee(double salary) {

      this.salary = salary;
  }

  public void print() {
      System.out.println("id " + this.id);
      System.out.println("name " + this.name);
      System.out.println("salary " + this.salary);
  }

  // getter method
  public int getID() {
      return this.id;
  }

  public String getName() {
      return this.name;
  }

  public double getSalary() {
      return this.salary;
  }

}

public class Pojosimple {
	public static void main(String[] args) {
	      //creating the object 
	      //object will store in heap memory
	      Employee raj = new Employee();
	      raj.setID(1001);
	      raj.setName("Raj");
	      raj.setSalary(1000.00);
	      // raj.print();
	      System.out.println(raj.getID());
	      System.out.println(raj.getName());
	      System.out.println(raj.getSalary());
	  }

}
