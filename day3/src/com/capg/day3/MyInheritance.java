package com.capg.day3;

//Rule 1. there should two or more classes to perform the inheritance
//Rule 2. Reuse the variable of another class
//Rule 3 . Reuse the method of another class
//Rule 4 . You can use it by extending the another class
//Rule 5. create the object of child class
//Rule 6 . SO which is extends another class that is called parent class
//Rule 7 . Class which inheritage the properites of another class is class sub class or child class 
//Rule 8 . You can access variable using . operator with class name 
//Rule 9 . by using the method name with class name
//Rule 10 . one class is extends by another class then this is called single level inheritance 
//Parent or super class
class A {
  int a=10;
  public void print() 
  {
      System.out.println("Class A");
  }
}

//extends :it is keyword in java
//it is used to extends the another
//extends className
//child or sub class
class B extends A 
{

}

public class MyInheritance {

  public static void main(String[] args) {
      B b=new B();
      //Accessing the A class Method
      b.print();
      //Accessing the A class variable
      System.out.println(b.a);
  }



}